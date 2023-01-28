package com.mycompany.proyectoestructuras;

public class Persona {

    private int ID;
    private String Nombre;
    private int Teléfono;
    private int Cédula;

    public Persona(int ID, String Nombre, int Teléfono, int Cédula) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Teléfono = Teléfono;
        this.Cédula = Cédula;
    }

    public Persona() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(int Teléfono) {
        this.Teléfono = Teléfono;
    }

    public int getCédula() {
        return Cédula;
    }

    public void setCédula(int Cédula) {
        this.Cédula = Cédula;
    }
    

    @Override
    public String toString() {
        return "ID: " + ID + ", Nombre: " + Nombre + ", Teléfono: " + Teléfono + ", Cédula: " + Cédula;
    }

}
