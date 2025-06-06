package org.pablogonzalez.models;

public class Profesor extends Persona{
    private String email;
    private String phone;
    private String id;

    public Profesor() {
    }

    public Profesor(String id, String email, String phone, String nombres, String apellidos, Integer edad) {
        super(nombres, apellidos, edad);
        this.id = id;
        this.email = email;
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
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "id=" + id + ", email=" + email + ", phone=" + phone + '}';
    }
    
    
    
}
