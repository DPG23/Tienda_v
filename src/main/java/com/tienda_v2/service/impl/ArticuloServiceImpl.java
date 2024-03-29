
package com.tienda_v2.service.impl;

import com.tienda.dao.ArticuloDao;
import com.tienda_v2.domain.Articulo;
import com.tienda_v2.service.ArticuloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticuloServiceImpl implements ArticuloService {
    
     @Autowired
    private ArticuloDao articuloDao;

    @Override
    @Transactional(readOnly=true)
    public List<Articulo> getArticulos(boolean activos) {
        var lista=articuloDao.findAll();
        
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        
        return lista;
    }

    @Override
    @Transactional(readOnly=true)
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }

    @Override
     @Transactional(readOnly=false)
    public void deleteArticulo(Articulo articulo) {
        articuloDao.delete(articulo);
    }

    @Override
    public void saveArticulo(Articulo articulo) {
        articuloDao.save(articulo);
    }
    
}
