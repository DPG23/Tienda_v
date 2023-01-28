package Lista_Circular;

import prj_ed_examen02.Mascota;

public class Nodo {

    private Mascota dato;
    private Nodo Next;

    public Nodo(Mascota dato) {
        this.dato = dato;
        this.Next = null;
    }

    public Mascota getDato() {
        return dato;
    }

    public void setDato(Mascota dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return Next;
    }

    public void setNext(Nodo Next) {
        this.Next = Next;
    }

    @Override
    public String toString() {
       return "Datos mascota: " + dato.toString();
    }
    
    

}
