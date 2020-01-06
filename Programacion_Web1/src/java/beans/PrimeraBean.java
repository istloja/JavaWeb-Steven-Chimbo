/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.view.ViewScoped;

/**
 *
 * @author AlexisO
 */
@Named(value = "primneraBean")
@ViewScoped
public class PrimeraBean implements Serializable{

    private int valor1;
    private String nombre;
    private int spinner1;
    private double spinner2,spinner3,spinner4,spinner5,spinner6;
   
    
    private int slider1,slider3,slider4,slider5,slider6,slider7,slider8=30,slider9=80;
    private float slider2=0.2f;
    
    
    
    private String boton;

    public String getBoton() {
        return boton;
    }

    public void setBoton(String boton) {
        this.boton = boton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSpinner1() {
        return spinner1;
    }

    public void setSpinner1(int spinner1) {
        this.spinner1 = spinner1;
    }

    public double getSpinner2() {
        return spinner2;
    }

    public void setSpinner2(double spinner2) {
        this.spinner2 = spinner2;
    }

    public double getSpinner3() {
        return spinner3;
    }

    public void setSpinner3(double spinner3) {
        this.spinner3 = spinner3;
    }

    public double getSpinner4() {
        return spinner4;
    }

    public void setSpinner4(double spinner4) {
        this.spinner4 = spinner4;
    }

    public double getSpinner5() {
        return spinner5;
    }

    public void setSpinner5(double spinner5) {
        this.spinner5 = spinner5;
    }

    public double getSpinner6() {
        return spinner6;
    }

    public void setSpinner6(double spinner6) {
        this.spinner6 = spinner6;
    }

    public int getSlider1() {
        return slider1;
    }

    public void setSlider1(int slider1) {
        this.slider1 = slider1;
    }

    public int getSlider3() {
        return slider3;
    }

    public void setSlider3(int slider3) {
        this.slider3 = slider3;
    }

    public int getSlider4() {
        return slider4;
    }

    public void setSlider4(int slider4) {
        this.slider4 = slider4;
    }

    public int getSlider5() {
        return slider5;
    }

    public void setSlider5(int slider5) {
        this.slider5 = slider5;
    }

    public int getSlider6() {
        return slider6;
    }

    public void setSlider6(int slider6) {
        this.slider6 = slider6;
    }

    public int getSlider7() {
        return slider7;
    }

    public void setSlider7(int slider7) {
        this.slider7 = slider7;
    }

    public int getSlider8() {
        return slider8;
    }

    public void setSlider8(int slider8) {
        this.slider8 = slider8;
    }

    public int getSlider9() {
        return slider9;
    }

    public void setSlider9(int slider9) {
        this.slider9 = slider9;
    }

    public float getSlider2() {
        return slider2;
    }

    public void setSlider2(float slider2) {
        this.slider2 = slider2;
    }
    
   

   
    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }
    
    /**
     * Creates a new instance of PrimneraBean
     */
    public PrimeraBean() {
    }
    
}
