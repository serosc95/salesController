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
        return productRepository.findAllByid(id);
    }

    @Override
    public Producto add(Producto p) {
        if( productRepository.findAllByCodigo(p.getCodigo()).isEmpty()) {
            return productRepository.save(p);
        }
        return null;
    }

    @Override
    public Producto edit(Producto p) {
        return productRepository.save(p);
    }
}
