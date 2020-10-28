package com.control.salescontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{
    
    @Autowired
    private ProductoRepository productRepository;
    
    @Override
    public List<Producto> listar() {
        return productRepository.findAll();
    }

    @Override
    public Producto listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto add(Producto p) {
        if( productRepository.findAllByCodigo(p.getCodigo()).size() == 0) {
            return productRepository.save(p);
        }
        return null;
    }

    @Override
    public Producto edit(Producto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
