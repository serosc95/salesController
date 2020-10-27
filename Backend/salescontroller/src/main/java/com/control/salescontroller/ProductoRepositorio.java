package com.control.salescontroller;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface ProductoRepositorio extends Repository<Producto, Integer>{
    List<Producto>findAll();
    Producto findOne(int id);
    Producto save(Producto p);
    void delete(Producto p);
}
