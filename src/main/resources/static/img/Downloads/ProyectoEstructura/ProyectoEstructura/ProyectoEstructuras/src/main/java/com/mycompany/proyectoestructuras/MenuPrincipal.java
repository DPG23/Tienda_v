package com.mycompany.proyectoestructuras;

import javax.swing.JOptionPane;

public class MenuPrincipal {

    public static void main(String[] args) {
        Lista lista = new Lista();
        Pila pila = new Pila();
        Cola cola = new Cola();
        // Menú del Restaurante.
        String A = "Arroz con Camarones";
        String B = "Nachos Mixtos";
        String C = "Fajitas de Pollo";
        String D = "Casado de Res";
        String E = "Hamburgesa Tradicional";
        int Orden = 0;
        int Opcion = 0;
        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog("     Menú Restaurante Fidélitas     "
                    + " \n1. Pedir Comida"
                    + " \n2. Pasar al siguiente pedido"
                    + " \n3. Ver pedidos realizados"
                    + " \n4. Ver pedidos terminados"
                    + " \n5. Ver información del cliente"
                    + " \n6. Eliminar informacion de los clientes."
                    + " \n7. Eliminar informacion de pedidos."
                    + " \n8. Salir."
                    + " \n\n Digite la opción que desea ejecutar:"));
            switch (Opcion) {
                case 1:
                    lista.Insertar(new Persona(Integer.parseInt(JOptionPane.showInputDialog("Digite el número de orden: \n" + lista)),
                            JOptionPane.showInputDialog("Escriba su nombre completo: "),
                            Integer.parseInt(JOptionPane.showInputDialog("Digite su número de teléfono: ")),
                            Integer.parseInt(JOptionPane.showInputDialog("Digite su número de cédula: "))));

                    Orden = Integer.parseInt(JOptionPane.showInputDialog("Escoja el platillo que desea comer: "
                            + "\n(Para las bebidas se cuenta con ReFill) \n"
                            + "1. " + A + " (₡3000).\n"
                            + "2. " + B + " (₡2500).\n"
                            + "3. " + C + " (₡2700).\n"
                            + "4. " + D + " (₡4000).\n"
                            + "5. " + E + " (₡3500)."));
                    if (Orden == 1) {
                        cola.encola(new NodoC(A, 3000));
                    } else if (Orden == 2) {
                        cola.encola(new NodoC(B, 2500));
                    } else if (Orden == 3) {
                        cola.encola(new NodoC(C, 2700));
                    } else if (Orden == 4) {
                        cola.encola(new NodoC(D, 4000));
                    } else if (Orden == 5) {
                        cola.encola(new NodoC(E, 3500));
                    }
                    break;
                case 2:
                    if (cola.getFrente() == null) {
                        JOptionPane.showMessageDialog(null, "No hay personas por atender.");
                    } else {
                        NodoC atiendepedido = cola.atiende();
                        pila.push(new NodoP(atiendepedido.getPedido()));
                        JOptionPane.showMessageDialog(null, "Se ha pasado al siguiente pedido. ");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, cola);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, pila);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, lista);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Muchas gracias por utilizar nuestro servicio.");
            }
        } while (Opcion != 8);
    }
}
