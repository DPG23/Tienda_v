/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HUAWEI PC
 */
public class Usuarios extends Perfiles{

    private List<Perfiles> vusuarios;
    public Usuarios() {
        vusuarios= new ArrayList<>();
    }
    public int buscar(String usuario){
        int n=-1;
        for (int i = 0; i < vusuarios.size(); i++) {
            if(vusuarios.get(i).getId().equals(usuario)){
                n=i;
                break;
            }
            
        }
        return n;
    }
    public boolean insertar(Usuarios usuario){
        if(buscar(usuario.getUsuario())==-1){
            vusuarios.add(usuario);
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean modificar(Usuarios usuario){
        if(buscar(usuario.getUsuario())!=-1){
            //vusuarios.set(0, usuario);
            Perfiles usuarioaux=obtener(usuario.getUsuario());
            
            usuarioaux.setContraseña(usuario.getContraseña());
            usuarioaux.setNombre(usuario.getNombre());
            usuarioaux.setCorreo(usuario.getCorreo());
            usuarioaux.setId(usuario.getId());
            usuarioaux.setEdad(usuario.getEdad());
            
            return true;
        }else{
            return false;
        }
        
    }
    public boolean eliminar(String usuario){
        if(buscar(usuario)!=-1){
            vusuarios.remove(buscar(usuario));
            return true;
        }else{
            return false;
        }
        
    }
    public Usuarios obtener(String usuario){
        if(buscar(usuario)!=-1){
           return (Usuarios) vusuarios.get(buscar(usuario));
        }else{
            return null;
        }
        
    }
    
    
    
    
}
