package beans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;



/**
 *
 * @author Usuario
 */
@Named(value = "primerBean")
@ViewScoped
public class primerBean implements Serializable {
    
    private int valor1;
    private String nombre;
    private String[] selectedCities;
    private List<String> cities;
    private String[] selectedConsoles;
    private String username;     
    private String password;
    private List<Modelo> listaU;
    
  
    
    @PostConstruct    
      
    public void init() {
        cities = new ArrayList<String>();
        cities.add("Miami");
        cities.add("London");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Barcelona");
        cities.add("Rome");
        cities.add("Brasilia");
        cities.add("Amsterdam");
    }

    public List<Modelo> getListaU() {
        return listaU;
    }

    public void setListaU(List<Modelo> listaU) {
        this.listaU = listaU;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String login() {
        FacesMessage message = null;
        String url="";
      
        for(Modelo mo: listaU){
             if(username != null && username.equals(mo.getUsuario()) && password != null && password.equals(mo.getContrasña())) {
                HttpSession sesion =(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
                sesion.setAttribute("Usuario", mo);
                if(mo.getRol().equals("Administrador")){
                    url = "Pagina3.xhtml?faces-redirect=true";
                }else{
                    if(mo.getRol().equals("Estudante")){
                    url="Estudiante.xhtml?faces-redirect=true";
                    }else{
                        if(mo.getRol().equals("Docente")){
                            url="Docente.xhtml?faces-redirect=true";

                        
                        }
                    }
                }
        } else{
                 message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
             FacesContext.getCurrentInstance().addMessage(null, message);
             }
        }
        return url;
        
    }   

    
    
    
    

    public String[] getSelectedConsoles() {
        return selectedConsoles;
        
    }

    public void setSelectedConsoles(String[] selectedConsoles) {
        this.selectedConsoles = selectedConsoles;
    }

    public String[] getSelectedCities() {
        return selectedCities;
    }

    public void setSelectedCities(String[] selectedCities) {
        this.selectedCities = selectedCities;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    
    public primerBean() {
        listaU  = new ArrayList<>();
        listaU.add(new Modelo("Steve", "steve", "admin1", "Estudiante"));
        listaU.add(new Modelo("Cesar", "Cabrera", "admin", "Estudiante"));
        listaU.add(new Modelo("Chimbo", "steven", "steve", "Estudiante"));
        listaU.add(new Modelo("Dario", "Dario"," 1234", "Estudiante"));   
        listaU.add(new Modelo("Alexis", "Alexis", "4567", "Estudiante"));
        listaU.add(new Modelo("Joan", "Joan", "789", "Estudiante"));
        listaU.add(new Modelo("Cristian", "Cristian", "1234", "Estudiante"));
        listaU.add(new Modelo("Yeferson", "Yeferson", "4567", "Docente"));
                      
        
        
                
    }

    public int getValor() {
        return valor1;
    }

    public void setValor(int valor) {
        this.valor1 = valor;
    }

    public String getNombre() {
        return "Hola " + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  
 
      

    
    
    
}
