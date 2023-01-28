/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import clases.Usuarios;

/**
 *
 * @author HUAWEI PC
 */
public class UsuarioLV {
    private static Usuarios usuariosd= new Usuarios();
    
    public static boolean autentificar(String usuario, String contraseña){
        if (obtener(usuario)!=null) {
            Perfiles usuarioConsulta=obtener(usuario);
            if (usuarioConsulta.getUsuario().equals(usuario)&&usuarioConsulta.getContraseña().equals(contraseña)) {
                return true;
            }else{
                return false;
            }
            
        }else{
            return false;
        }
    }
    
    public static boolean insertar(Perfiles usuario){
        return usuariosd.insertar((Usuarios) usuario);
        
    }
    public static boolean modificar(Perfiles usuario){
        return usuariosd.modificar((Usuarios) usuario);
        
    }
    public static boolean eliminar(String usuario){
        return usuariosd.eliminar(usuario);
        
    }
    public static Perfiles obtener(String usuario){
        return usuariosd.obtener(usuario);
        
    }
    
    
}
