/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import Utilidades.Persona;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author AlexisO
 */
@Named(value = "beanLogin")
@RequestScoped
public class BeanLogin implements Serializable {

    private String usuario, contrasena;

    private List<Persona> lista;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }



//
//    public BeanLogin() {
//        lista = new ArrayList<>();
//        lista.add(new Persona("alexis", "Ortega", "1", "12345"));
//        lista.add(new Persona("joan", "peña", "2", "12345"));
//        lista.add(new Persona("cristian", "poma", "3", "12345"));
//        lista.add(new Persona("steven", "chimbo", "1", "12345"));
//        lista.add(new Persona("cesar", "cabrera", "2", "12345"));
//        lista.add(new Persona("dario", "gonsalez", "3", "12345"));
//        lista.add(new Persona("guillermo", "aucapiña", "1", "12345"));
//        lista.add(new Persona("yeferson", "torres", "1", "12345"));
//
//    }
//
//    public String comprobar() {
//        String url = null;
//        FacesMessage message;
//
//        for (Persona pers : lista) {
//
//        HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
//        sesion.setAttribute("usuario", pers);
//            if (usuario.equals(pers.getNombre()) && contrasena.equals(pers.getContrasenia())) {
//                message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", "");
////                if (pers.getUsuario().equals("1")) {
//                    url = "PaginaAdministrador.xhtml?faces-redirect=true";
//                } else {
//                    if (pers.getUsuario().equals("2")) {
//                        url = "PaginaEstudiante.xhtml?faces-redirect=true";
//                    } else {
//                        if (pers.getUsuario().equals("3")) {
//                            url = "PaginaOrganizador.xhtml?faces-redirect=true";
//                        }
//                    }
//                }
//            } else {
//                message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Datos Incorrectos", "");
//            }
//            FacesContext.getCurrentInstance().addMessage(null, message);
//        }
//        return url;
//    }
}
