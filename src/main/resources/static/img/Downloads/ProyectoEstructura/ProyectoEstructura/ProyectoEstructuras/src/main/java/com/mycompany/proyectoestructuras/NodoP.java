package com.mycompany.proyectoestructuras;

public class NodoP {

    private String Pedido;
    private int Bebida;
    private NodoP abajo;

    public NodoP(String Pedido) {
        this.Pedido = Pedido;

        this.abajo = null;
    }

    public int getBebida() {
        return Bebida;
    }

    public void setBebida(int Bebida) {
        this.Bebida = Bebida;
    }

    public String getPedido() {
        return Pedido;
    }

    public void setPedido(String Pedido) {
        this.Pedido = Pedido;
    }

    public NodoP getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoP abajo) {
        this.abajo = abajo;
    }

    @Override
    public String toString() {
        return "Pedido: " + Pedido;
    }

}
