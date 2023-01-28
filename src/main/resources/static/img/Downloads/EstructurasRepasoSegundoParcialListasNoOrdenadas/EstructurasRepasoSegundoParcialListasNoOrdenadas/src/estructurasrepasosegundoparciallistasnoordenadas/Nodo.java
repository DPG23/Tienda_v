
package estructurasrepasosegundoparciallistasnoordenadas;


public class Nodo {
    private Perro dato;
    private Nodo next;

    public Nodo(Perro dato) {
        this.dato = dato;
        this.next = null;
    }

    
    
    public Perro getDato() {
        return dato;
    }

    public void setDato(Perro dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
}
