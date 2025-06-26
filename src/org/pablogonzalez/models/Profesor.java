package org.pablogonzalez.models;

public class Profesor extends Persona{
    private String email;
    private String phone;
    private String id;

    public Profesor(){}

    public Profesor(String id, String email, String phone, String nombres, String apellidos, Integer edad) {
        super(nombres, apellidos, edad);
        this.id = id;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
            this.email = email;
        }else{
            this.email = "Email inválido";
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return """
               
               --- PROFESOR ---
               Nombre: """ + getNombres() + " " + getApellidos() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "ID: " + id + "\n" +
                "Email: " + email + "\n" +
                "Telefono: " + phone + "\n";
    }
}
