
package com.tienda_v2.service;

import com.tienda_v2.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
    //Se recupera una lista con todos los registros de la tabla cliente
    public List<Cliente> getClientes();
    
    //Se recupera el registro que tiene el IdCliente pasado por parametro
    //Si no existe en la tabla se retorna null
    public Cliente getCliente(Cliente cliente);
    
    //Se elimina el registro que tiene el idCliente pasado por parametro
   public void deleteCliente(Cliente cliente);
   
   //Si el objeto cliente tiene un idCliente que existe en la tabla cliente
   //El registro se actualiza con la nueva informacion
   //si el idCliente NO existe en la tabla, se crea el registro con esa informacion
   public void saveCliente(Cliente cliente);

   
}
