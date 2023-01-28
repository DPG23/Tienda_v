/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author aboza
 */
public class Termino implements Serializable,Comparable<Termino>{
    private String palabra;
    private String concepto;

    public Termino() {
    }

    public Termino(String palabra, String concepto) {
        this.palabra = palabra;
        this.concepto = concepto;
    }

    public String getPalabra() {
        return palabra;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

       @Override
    public int compareTo(Termino pTermino) {
        return this.palabra.compareTo(pTermino.getPalabra());
    }

//NECESARIO PARA PODER USAR EL METODO CONTAINS DE LAS COLECCIONES
    @Override
    public boolean equals(Object x) {
        try {
            Termino vUsuario = (Termino) x;
            return this.palabra.equals(vUsuario.getPalabra());
        } catch (Exception e) {
            return false;
        }
    }
    
    
    
    
}
