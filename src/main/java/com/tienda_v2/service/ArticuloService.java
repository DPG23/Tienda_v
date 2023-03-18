
package com.tienda_v2.service;

import com.tienda_v2.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    
    //Se recupera una lista con todos los registros de la tabla Articulo
    public List<Articulo> getArticulos(boolean activos);
    
    //Se recupera el registro que tiene el IdArticulo pasado por parametro
    //Si no existe en la tabla se retorna null
    public Articulo getArticulo(Articulo articulo);
    
    //Se elimina el registro que tiene el idArticulo pasado por parametro
   public void deleteArticulo(Articulo articulo);
   
   //Si el objeto Articulo tiene un idArticulo que existe en la tabla cliente
   //El registro se actualiza con la nueva informacion
   //si el idCliente NO existe en la tabla, se crea el registro con esa informacion
   public void saveArticulo(Articulo articulo);

   
}
