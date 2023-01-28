package com.mycompany.proyectoestructuras;

public class NodoL {

    private Persona Dato;
    private NodoL Next;

    public NodoL(Persona Dato) {
        this.Dato = Dato;
        this.Next = null;
    }

    public Persona getDato() {
        return Dato;
    }

    public void setDato(Persona Dato) {
        this.Dato = Dato;
    }

    public NodoL getNext() {
        return Next;
    }

    public void setNext(NodoL Next) {
        this.Next = Next;
    }

    @Override
    public String toString() {
        return Dato + "";
    }
    
    
    
}
