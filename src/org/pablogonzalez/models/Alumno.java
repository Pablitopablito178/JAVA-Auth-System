package org.pablogonzalez.models;

public class Alumno extends Persona{
    public int idAlumno;
    public String colegioAlumno;
    
    public Alumno(){
    }

    public Alumno(int idAlumno, String colegioAlumno, 
            String nombres, String apellidos, Integer edad) {
        super(nombres, apellidos, edad);
        this.idAlumno = idAlumno;
        this.colegioAlumno = colegioAlumno;
    }
    
    
    
    
}
