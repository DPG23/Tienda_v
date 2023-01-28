package com.mycompany.proyectoestructuras;

public class NodoC {

    private String Pedido;
    private float Precio;
    private NodoC atras;

    public NodoC(String Pedido, float Precio) {
        this.Pedido = Pedido;
        this.Precio = Precio;
        this.atras = null;
    }

    public String getPedido() {
        return Pedido;
    }

    public void setPedido(String Pedido) {
        this.Pedido = Pedido;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public NodoC getAtras() {
        return atras;
    }

    public void setAtras(NodoC atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "Pedido: " + Pedido + ", Precio: " + Precio;
    }

}
