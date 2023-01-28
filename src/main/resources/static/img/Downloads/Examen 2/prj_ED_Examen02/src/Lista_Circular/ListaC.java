package Lista_Circular;

import javax.swing.JOptionPane;
import prj_ed_examen02.Mascota;

public class ListaC {

    private Nodo cabeza;
    private Nodo ultimo;

    public Nodo getCabeza() {
        return cabeza;
    }

    public void insertar(Mascota m) {

        if (cabeza == null) {

            cabeza = new Nodo(m);
            ultimo = cabeza;

        } else if (m.getId() < cabeza.getDato().getId()) {

            Nodo aux = new Nodo(m);

            aux.setNext(cabeza);
            cabeza = aux;
            ultimo.setNext(cabeza);

        } else if (ultimo.getDato().getId() <= m.getId()) {

            ultimo.setNext(new Nodo(m));
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);

        } else {

            Nodo aux = cabeza;

            while (aux.getNext().getDato().getId() < m.getId()) {
                aux = aux.getNext();
            }

            Nodo temp = new Nodo(m);
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

    public ListaC modifica(Mascota p) {

        Nodo aux = cabeza.getNext();
        ListaC listaAux = new ListaC();

        while (aux != cabeza) {

            if (aux.getDato().getId() == p.getId()) {

                listaAux.insertar(p);

            } else {

                listaAux.insertar(aux.getDato());
            }

            aux = aux.getNext();

        }

        return listaAux;

    }

    public void mascotasInventario(Nodo aux, int TotalMascotas) {

        if (aux == cabeza) {

            if (aux.getDato().getEstadoAdopción().equalsIgnoreCase("Adopcion")) {
                TotalMascotas++;
            }

            JOptionPane.showMessageDialog(null, "El total de mascotas registradas es el siguiente: \n\n"
                    + "Mascotas disponibles para adopción: " + TotalMascotas);

        } else {

            if (aux.getDato().getEstadoAdopción().equalsIgnoreCase("Adopcion")) {
                TotalMascotas++;

            }

            aux = aux.getNext();
            mascotasInventario(aux, TotalMascotas);

        }

    }

    public void mascotasAdoptadas(Nodo aux, int TotalMascotas) {

        if (aux == cabeza) {

            if (aux.getDato().getEstadoAdopción().equalsIgnoreCase("Adoptado")) {
                TotalMascotas++;
            }

            JOptionPane.showMessageDialog(null, "El total de mascotas registradas es el siguiente: \n\n"
                    + "Mascotas adoptadas: " + TotalMascotas);

        } else {

            if (aux.getDato().getEstadoAdopción().equalsIgnoreCase("Adoptado")) {
                TotalMascotas++;

            }

            aux = aux.getNext();
            mascotasAdoptadas(aux, TotalMascotas);

        }

    }

    public void totalTipos(Nodo aux, int TotalPerros, int TotalGatos) {

        if (aux == cabeza) {

            if (aux.getDato().getTipo().equalsIgnoreCase("Perro")) {
                TotalPerros++;
            } else {
                TotalGatos++;
            }

            JOptionPane.showMessageDialog(null, "El total de mascotas registradas es el siguiente: \n\n"
                    + "Total Perros: " + TotalPerros + "\n"
                    + "Total Gatos: " + TotalGatos + "\n");

        } else {

            if (aux.getDato().getTipo().equalsIgnoreCase("Perro")) {
                TotalPerros++;
            } else {
                TotalGatos++;
            }

            aux = aux.getNext();
            totalTipos(aux, TotalPerros, TotalGatos);

        }

    }

    @Override
    public String toString() {

        Nodo aux = cabeza;
        String s = "Lista Total Mascotas: \n \n";

        if (aux != null) {

            s = s + "id: " + aux.getDato().getId() + ", Nombre Mascotas: " + aux.getDato().getNombre() + ", Edad: " + aux.getDato().getEdad() + " Estado Adopción: " + aux.getDato().getEstadoAdopción() + " Tipo mascota: " + aux.getDato().getTipo() + "\n";
            aux = aux.getNext();

            while (aux != cabeza && aux != null) {

                s = s + "id: " + aux.getDato().getId() + ", Nombre Mascotas: " + aux.getDato().getNombre() + ", Edad: " + aux.getDato().getEdad() + " Estado Adopción: " + aux.getDato().getEstadoAdopción() + " Tipo mascota: " + aux.getDato().getTipo() + "\n";
                aux = aux.getNext();

            }

        } else {

            s += "No hay datos";

        }

        return s;
    }

    public String toStringInventario() {

        Nodo aux = cabeza;
        String s = "Lista Total Mascotas: \n \n";

        if (aux != null) {

            if (aux.getDato().getEstadoAdopción().equalsIgnoreCase("Adopcion")) {
                s = s + "id: " + aux.getDato().getId() + ", Nombre Mascotas: " + aux.getDato().getNombre() + ", Edad: " + aux.getDato().getEdad() + " Estado Adopción: " + aux.getDato().getEstadoAdopción() + " Tipo mascota: " + aux.getDato().getTipo() + "\n";
            }
            aux = aux.getNext();

            while (aux != cabeza && aux != null) {

                if (aux.getDato().getEstadoAdopción().equalsIgnoreCase("Adopcion")) {
                    s = s + "id: " + aux.getDato().getId() + ", Nombre Mascotas: " + aux.getDato().getNombre() + ", Edad: " + aux.getDato().getEdad() + " Estado Adopción: " + aux.getDato().getEstadoAdopción() + " Tipo mascota: " + aux.getDato().getTipo() + "\n";
                }
                aux = aux.getNext();

            }

        } else {

            s += "No hay datos";

        }

        return s;
    }

    public String toStringAdoptadas() {

        Nodo aux = cabeza;
        String s = "Lista Total Mascotas: \n \n";

        if (aux != null) {

            if (aux.getDato().getEstadoAdopción().equalsIgnoreCase("Adoptado")) {
                s = s + "id: " + aux.getDato().getId() + ", Nombre Mascotas: " + aux.getDato().getNombre() + ", Nombre Cliente: " + aux.getDato().getNuevoDueño() + ", Fecha Adopción: " + aux.getDato().getFechaAdopcion();
            }
            aux = aux.getNext();

            while (aux != cabeza && aux != null) {

                if (aux.getDato().getEstadoAdopción().equalsIgnoreCase("Adoptado")) {
                    s = s + "id: " + aux.getDato().getId() + ", Nombre Mascotas: " + aux.getDato().getNombre() + ", Nombre Cliente: " + aux.getDato().getNuevoDueño() + ", Fecha Adopción: " + aux.getDato().getFechaAdopcion();
                }
                aux = aux.getNext();

            }

        } else {

            s += "No hay datos";

        }

        return s;
    }

}
