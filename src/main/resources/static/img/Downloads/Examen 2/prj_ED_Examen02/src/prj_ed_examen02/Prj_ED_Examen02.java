package prj_ed_examen02;

import Lista_Circular.ListaC;
import Lista_Enlazada_Simple.ListaSimple;
import java.awt.TextArea;
import javax.swing.JOptionPane;

public class Prj_ED_Examen02 {

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {

        int Opcion = 1;
        String[] OpcionYesNo = {"Perro", "Gato"};
        ListaC misMascotas = new ListaC();
        ListaSimple mascotasAdoptadas = new ListaSimple();

        //Se agregan mascotas para test
        misMascotas.insertar(new Mascota(1, "Rufo", "Perro", 10));
        misMascotas.insertar(new Mascota(2, "Dobby", "Perro", 5));
        misMascotas.insertar(new Mascota(3, "Haru", "Gato", 2));
        
        
        while (Opcion != 7) {

            Opcion = Integer.parseInt(JOptionPane.showInputDialog("Por favor seleccione la opción que desea ejecutar: \n"
                    + "1. Agregar mascota a inventario \n"
                    + "2. Modificar datos de mascota \n"
                    + "3. Adoptar mascota \n"
                    + "4. Cantidad de mascotas en inventario \n"
                    + "5. Cantidad de mascotas adoptadas \n"
                    + "6. Cantidad de perros y gatos registrados \n"
                    + "7. Salir \n"));

            switch (Opcion) {

                case 1:

                    int id = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un ID"));
                    String Nombre = JOptionPane.showInputDialog("Por favor ingrese el nombre de la mascota");
                    String Tipo = (String) JOptionPane.showInputDialog(null, "Desea agregar un nuevo país", "Información Paices", JOptionPane.QUESTION_MESSAGE, null, OpcionYesNo, OpcionYesNo[0]);
                    int Edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la edad de la mascota"));

                    misMascotas.insertar(new Mascota(id, Nombre, Tipo, Edad));

                    JOptionPane.showMessageDialog(null, "La mascota " + Nombre + " ha sido guardada existosamente");

                    break;

                case 2:

                    id = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el ID que desae modificar"));

                    if (misMascotas.existe(id)) {

                        Mascota mascotaExiste = misMascotas.Extrae(id);

                        if (mascotaExiste.getEstadoAdopción().equalsIgnoreCase("Adopcion")) {

                            Nombre = JOptionPane.showInputDialog("Por favor ingrese el nombre de la mascota");
                            Tipo = (String) JOptionPane.showInputDialog(null, "Desea agregar un nuevo país", "Información Paices", JOptionPane.QUESTION_MESSAGE, null, OpcionYesNo, OpcionYesNo[0]);
                            Edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la edad de la mascota"));

                            Mascota miMascota = new Mascota(id, Nombre, Tipo, Edad);

                            misMascotas = misMascotas.modifica(miMascota);

                        } else {

                            JOptionPane.showMessageDialog(null, "La mascota que esta intentando editar, ya fue adoptada, por favor seleccione otra");

                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "El Id indicado no existe");
                    }

                    break;

                case 3:

                    id = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el ID de la mascota en adopción"));

                    if (misMascotas.existe(id)) {

                        Mascota miMascota = misMascotas.Extrae(id);

                        if (miMascota.getEstadoAdopción().equalsIgnoreCase("Adopcion")) {

                            String nuevoDueño = JOptionPane.showInputDialog("Por digite el nombre de la persona que adoptara a la mascota");
                            String estadoAdopcion = "Adoptado";
                            String fechaAdopcion = JOptionPane.showInputDialog("Digite la fecha de adopción");

                            miMascota.setEstadoAdopción(estadoAdopcion);
                            miMascota.setNuevoDueño(nuevoDueño);
                            miMascota.setFechaAdopcion(fechaAdopcion);

                            mascotasAdoptadas.inserta(miMascota);

                            JOptionPane.showMessageDialog(null, "Se ha registrado la adopción correctamente");

                        } else {

                            JOptionPane.showMessageDialog(null, "La mascota ya fue adoptada");

                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "El ID no existe");

                    }

                    break;

                case 4:

                    if (misMascotas.getCabeza() == null) {

                        JOptionPane.showMessageDialog(null, "No existen mascotas registradas");

                    } else {

                        if (misMascotas.getCabeza().getNext() == null) {
                            misMascotas.mascotasInventario(misMascotas.getCabeza(), 0);
                        } else {
                            misMascotas.mascotasInventario(misMascotas.getCabeza().getNext(), 0);

                        }

                        JOptionPane.showMessageDialog(null, new TextArea(misMascotas.toStringInventario()));

                    }

                    break;

                case 5:

                    if (misMascotas.getCabeza() == null) {

                        JOptionPane.showMessageDialog(null, "No existen mascotas registradas");

                    } else {

                        if (misMascotas.getCabeza().getNext() == null) {
                            misMascotas.mascotasAdoptadas(misMascotas.getCabeza(), 0);
                        } else {
                            misMascotas.mascotasAdoptadas(misMascotas.getCabeza().getNext(), 0);
                        }

                        JOptionPane.showMessageDialog(null, new TextArea(misMascotas.toStringAdoptadas()));

                    }

                    break;

                case 6:

                    if (misMascotas.getCabeza() == null) {

                        JOptionPane.showMessageDialog(null, "No existen mascotas registradas");

                    } else {

                        if (misMascotas.getCabeza().getNext() == null) {
                            misMascotas.totalTipos(misMascotas.getCabeza(), 0, 0);
                        } else {
                            misMascotas.totalTipos(misMascotas.getCabeza().getNext(), 0, 0);
                        }

                        JOptionPane.showMessageDialog(null, new TextArea(misMascotas.toString()));

                    }

                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Usted ha seleccionado una opción incorrecta");
                    break;

            }

        }

    }

}
