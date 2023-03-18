package com.tienda_v2.service;

import com.tienda_v2.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se recupera una lista con todos los registros de la tabla categoria
    public List<Categoria> getCategorias(boolean activos);
    
    //Se recupera el registro que tiene el IdCategoria pasado por parametro
    //Si no existe en la tabla se retorna null
    public Categoria getCategoria(Categoria categoria);
    
    //Se elimina el registro que tiene el idCategoria pasado por parametro
   public void deleteCategoria(Categoria categoria);
   
   //Si el objeto categoria tiene un idCategoria que existe en la tabla Categoria
   //El registro se actualiza con la nueva informacion
   //si el idCliente NO existe en la tabla, se crea el registro con esa informacion
   public void saveCategoria(Categoria categoria);

   
}
