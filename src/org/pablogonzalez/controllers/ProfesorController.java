package org.pablogonzalez.controllers;

import java.util.Scanner;
import java.util.ArrayList;
import org.pablogonzalez.models.Profesor;

public class ProfesorController {
    private Scanner leer = new Scanner(System.in);
    ArrayList<Profesor> profesores = new ArrayList<Profesor>();
    
    public ProfesorController(){}
    
    public void agregarProfesor(){
        Profesor profesor = new Profesor();
        System.out.println("Ingresa nombres");
        profesor.setNombres(leer.nextLine());
        System.out.println("Ingresa apellidos");
        profesor.setApellidos(leer.nextLine());
        System.out.println("Ingresa la edad");
        profesor.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresa el email");
        profesor.setEmail(leer.nextLine());
        System.out.println("Ingresa el # de telefono");
        profesor.setPhone(leer.nextLine());
        System.out.println("Ingresa el ID");
        profesor.setId(leer.nextLine());
        profesores.add(profesor);
    }
    
    public void listarProfesores(){
        for(int i = 0; i < profesores.size(); i++){
            System.out.println(profesores.get(i));
        }
    }
    
    public Profesor buscarProfesor(String id){
        Profesor profesorTemporal;
        Profesor mostrarProfesor = new Profesor();
        for(int i = 0; i < profesores.size(); i++){
            profesorTemporal = profesores.get(i);
            if(profesorTemporal.getId().equals(id)){
                mostrarProfesor = profesorTemporal;
            }
        }
        return mostrarProfesor;
    }
    
    public Profesor actualizarProfesor(String id){
        Profesor profesorTemporal = new Profesor();
        Profesor profesorActualizado = new Profesor();
        
        for(int i = 0; i < profesores.size(); i++){
            profesorTemporal = profesores.get(i);
            if(profesorTemporal.getId().equals(id)){
                profesorActualizado = profesorTemporal;
                profesores.remove(i);
            }
        }
        
        System.out.println("Los datos del profesor buscado son:");
        System.out.println(profesorTemporal.toString());
        System.out.println("--------------------------------------");
        System.out.println("INGRESA AHORA LOS NUEVOS DATOS");
        System.out.println("Ingresa los nombres");
        profesorActualizado.setNombres(leer.nextLine());
        System.out.println("Ingresa los apellidos");
        profesorActualizado.setApellidos(leer.nextLine());
        System.out.println("Ingresa el telefono");
        profesorActualizado.setPhone(leer.nextLine());
        
        System.out.println("Estas seguro que deseas actualizar los datos");
        System.out.println("1. para si, 2. para no");
        int eleccion = leer.nextInt();
        if(eleccion == 1){
            System.out.println("Profesor actualizado exitosamente");
            profesorTemporal = profesorActualizado;
            profesores.add(profesorTemporal);
        }else{
            System.out.println("No se realizaron cambios");
            profesores.add(profesorTemporal);
        }
        return profesorTemporal;
    }
    
    public String eliminarProfesor(String id){
        String respuesta = "";
        Profesor profesorEncontrado = new Profesor();
        for(int i = 0; i < profesores.size(); i++){
            profesorEncontrado = profesores.get(i);
            if(profesorEncontrado.getId().equals(id)){
                profesores.remove(i);
                respuesta = "Profesor eliminado exitosamente";
            }
        }
        return respuesta;
    }
}
