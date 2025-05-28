package org.pablogonzalez.models;

public class Alumno extends Persona{
    private String carnet;
    private String grado;
    private String seccion;
    
    public Alumno(){
    }
    
    public Alumno(String nombres, String apellidos, Integer edad, 
            String carnet, String grado, String seccion){
        super(nombres, apellidos, edad);
        this.carnet = carnet;
        this.grado = grado;
        this.seccion = seccion;
    }
    
    public String getCarnet(){
        return carnet;
    }
    
    public void setCarnet(String carnet){
        this.carnet = carnet;
    }
    
    public String getGrado(){
        return grado;
    }
    
    public void getGrado(String grado){
        this.grado = grado;
    }
    
    public String getSeccion(){
        return seccion;
    }
    
    public void setSeccion(String seccion){
        this.seccion = seccion;
    }
}
