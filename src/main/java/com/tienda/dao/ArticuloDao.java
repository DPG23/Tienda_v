
package com.tienda.dao;

import com.tienda_v2.domain.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticuloDao extends JpaRepository<Articulo, Long>{
    
}
