package com.mycompany.proyectoestructuras;

public class Cola {

    private NodoC frente;
    private NodoC ultimo;

    public NodoC getFrente() {
        return frente;
    }

    public void encola(NodoC nuevoElemento) {
        if (frente == null) {
            frente = nuevoElemento;
            ultimo = nuevoElemento;
        } else {
            ultimo.setAtras(nuevoElemento);
            ultimo = nuevoElemento;
        }

    }

    public NodoC atiende() {
        NodoC aux = frente;
        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }

    @Override
    public String toString() {
        String s = "Lista de ordenes por cocinar:\n";
        NodoC aux = frente;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }
}
