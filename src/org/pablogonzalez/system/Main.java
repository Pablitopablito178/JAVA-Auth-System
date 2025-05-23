package org.pablogonzalez.system;

import org.pablogonzalez.models.Persona;
import org.pablogonzalez.models.Alumno;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona("Pablito", "Jauregui", 12);
        Alumno alum1 = new Alumno( 1, "Liceo Rumanoe", "Juna", "Perez", 15);
        
        persona1.nombres = "Jose";
        persona2.apellidos = "Gonzalez";
        persona1.edad = 13;
        
        System.out.println(persona1.nombres);
        System.out.println(persona2.apellidos);
        System.out.println(persona3.nombres);
        
        persona1.saludar();
    }
    
}
