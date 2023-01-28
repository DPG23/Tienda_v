/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

/**
 *
 * @author Usuario
 */
public class Cliente extends Usuario{
    
    private String correo;

    public Cliente() {
    }

    public Cliente(String correo, String nombre, String contraseña) {
        super(nombre, contraseña);
        this.correo = correo;
    }

    
    public void ejecutarInicioSesion(){
        System.out.println("Bienvenido al panel de visualización principal");
    }
}