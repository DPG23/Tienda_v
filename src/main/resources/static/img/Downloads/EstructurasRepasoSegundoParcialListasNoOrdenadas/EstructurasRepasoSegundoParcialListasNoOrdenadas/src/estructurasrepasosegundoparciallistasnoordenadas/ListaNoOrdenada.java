
package estructurasrepasosegundoparciallistasnoordenadas;


public class ListaNoOrdenada {
    Nodo cabeza;
    
    public void inserta(Perro p){
        Nodo aux = new Nodo(p);
        aux.setNext(cabeza);
        cabeza = aux;
    }
    
    public void insertaAlFinal(Perro p){
        if(cabeza == null){
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza = aux;
        }else{
            Nodo aux = cabeza;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            Nodo temp = new Nodo(p);
            aux.setNext(temp);
        }
    }
}
