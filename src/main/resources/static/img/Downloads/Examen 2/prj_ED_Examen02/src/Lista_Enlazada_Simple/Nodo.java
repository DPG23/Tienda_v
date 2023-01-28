package Lista_Enlazada_Simple;

import prj_ed_examen02.*;

public class Nodo {

    private Mascota dato;
    private Nodo Next;

    public Nodo(Mascota dato) {
        this.dato = dato;
        this.Next = null;
    }

    public Nodo getNext() {
        return Next;
    }

    public void setNext(Nodo Next) {
        this.Next = Next;
    }

    public Mascota getDato() {
        return dato;
    }

    public void setDato(Mascota dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

}
