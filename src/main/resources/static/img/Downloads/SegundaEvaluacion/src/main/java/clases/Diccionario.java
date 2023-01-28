/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author aboza
 */
public class Diccionario implements Serializable{
    
    private ArrayList<Termino> terminos;

    public Diccionario() {
    }

    public Diccionario(ArrayList<Termino> terminos) {
        this.terminos = terminos;
    }

    public ArrayList<Termino> getTerminos() {
        return terminos;
    }

    public void setTerminos(ArrayList<Termino> terminos) {
        this.terminos = terminos;
    }
    
    
    
}
