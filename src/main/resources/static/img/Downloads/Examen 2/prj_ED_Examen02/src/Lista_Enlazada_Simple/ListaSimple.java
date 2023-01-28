package Lista_Enlazada_Simple;

import prj_ed_examen02.*;

public class ListaSimple {

    private Nodo cabeza;
    private Nodo ultimo;

    public void inserta(Mascota p) {
        if (cabeza == null) {
            cabeza = new Nodo(p);
            ultimo = cabeza; //Como es el primer elemento tanto cabeza como ultimo es igual. 

        } else if (p.getId() < cabeza.getDato().getId()) {
            Nodo aux = new Nodo(p);

            aux.setNext(cabeza);
            cabeza = aux;
            ultimo.setNext(cabeza);

        } else if (ultimo.getDato().getId() <= p.getId()) {

            ultimo.setNext(new Nodo(p));
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);

        } else {

            Nodo aux = cabeza;

            while (aux.getNext().getDato().getId() < p.getId()) {
                aux = aux.getNext();
            }

            Nodo temp = new Nodo(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);

        }

    }

    public boolean existe(int id) {

        Nodo aux = cabeza.getNext();
        Boolean Existe = false;

        if (cabeza.getDato().getId() == id) {
            Existe = true;
            return Existe;
        } else {

            while (aux != cabeza && Existe != true) {

                if (aux.getDato().getId() == id) {
                    Existe = true;
                    return Existe;
                } else {

                    aux = aux.getNext();

                }

            }

        }

        return Existe;

    }

    public ListaSimple modificada(Mascota p) {

        Nodo aux = cabeza.getNext();
        ListaSimple listaAux = new ListaSimple();

        while (aux != cabeza) {

            if (aux.getDato().getId() == p.getId()) {

                listaAux.inserta(p);

            } else {

                listaAux.inserta(aux.getDato());
            }

            aux = aux.getNext();

        }

        return listaAux;
    }

    public ListaSimple elimina(int id) {

        Nodo aux = cabeza.getNext();
        ListaSimple listaAux = new ListaSimple();

        if (cabeza.getDato().getId() != id) {
            listaAux.inserta(aux.getDato());
        }

        while (aux != cabeza) {

            if (aux.getDato().getId() != id) {
                listaAux.inserta(aux.getDato());
            }

            aux = aux.getNext();

        }

        return listaAux;
    }

    public Mascota Extrae(int id) {

        Nodo aux = cabeza.getNext();
        Mascota miMascota = null;

        if (cabeza.getDato().getId() == id) {
            return cabeza.getDato();
        }

        while (aux != cabeza) {

            if (aux.getDato().getId() == id) {
                miMascota = aux.getDato();
                return miMascota;
            }

            aux = aux.getNext();

        }

        return null;

    }

    @Override
    public String toString() {

        Nodo aux = cabeza;
        String s = "Lista: \n\n";

        if (aux != null) {

            s = s + "id: " + aux.getDato().getId() + ", nombre: " + aux.getDato().getNombre() + "\n";
            aux = aux.getNext();

            while (aux != cabeza) {

                s = s + "id: " + aux.getDato().getId() + ", nombre: " + aux.getDato().getNombre() + "\n";
                aux = aux.getNext();

            }

        } else {
            s = "Vacia";
        }

        return s;

    }

}
