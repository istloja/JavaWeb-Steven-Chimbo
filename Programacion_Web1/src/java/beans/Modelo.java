
package beans;

public class Modelo {
    private String Nombre;
    private String Usuario;
    private String Contrasña;
    private String rol;

    public Modelo(String Nombre, String Usuario, String Contrasña, String rol) {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Contrasña = Contrasña;
        this.rol = rol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasña() {
        return Contrasña;
    }

    public void setContrasña(String Contrasña) {
        this.Contrasña = Contrasña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
