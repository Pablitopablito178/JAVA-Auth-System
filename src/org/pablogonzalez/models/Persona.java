
package org.pablogonzalez.models;

public class Persona {
    public String nombres;
    public String apellidos;
    public Integer edad;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, Integer edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    public void saludar(){
        System.out.println("Hola mi nombre es " + nombres + " y tengo" + edad + " años");
    }
}
