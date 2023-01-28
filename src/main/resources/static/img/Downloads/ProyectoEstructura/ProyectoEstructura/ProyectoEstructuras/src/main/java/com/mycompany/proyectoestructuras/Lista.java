package com.mycompany.proyectoestructuras;

public class Lista {

    private NodoL Cabeza;

    public void Insertar(Persona P) {
        if (Cabeza == null) {
            Cabeza = new NodoL(P);

        } else if (P.getID() < Cabeza.getDato().getID()) {
            NodoL aux = new NodoL(P);
            aux.setNext(Cabeza);
        } else if (Cabeza.getNext() == null) {
            Cabeza.setNext(new NodoL(P));
        } else {
            NodoL aux = Cabeza;
            while (aux.getNext() != null && aux.getNext().getDato().getID() < P.getID()) {
                aux = aux.getNext();
            }
            NodoL Temp = new NodoL(P);
            Temp.setNext(aux.getNext());
            aux.setNext(Temp);
        }

    }

    @Override
    public String toString() {
        NodoL aux = Cabeza;
        String s = "Lista de clientes:\n";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
        }
        return s;
    }
    
    
}
