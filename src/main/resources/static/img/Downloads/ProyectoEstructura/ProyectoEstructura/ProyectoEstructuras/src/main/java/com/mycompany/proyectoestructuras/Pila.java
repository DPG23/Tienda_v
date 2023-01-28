package com.mycompany.proyectoestructuras;

public class Pila {

    private NodoP top;

    public void push(NodoP ElementoNuevo) {
        ElementoNuevo.setAbajo(top);
        top = ElementoNuevo;
    }

    public NodoP pop() {
        NodoP aux = top;
        if (PilaVacia()) {
            System.out.println("Se encuentra vacia la pila.");
        } else {
            top = top.getAbajo();
            aux.setAbajo(null);
        }
        return aux;
    }

    public boolean PilaVacia() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String s = "Lista de ordenes terminadas:\n";
        NodoP aux = top;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAbajo();
        }
        
        return s;
    }
}
