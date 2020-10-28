package com.control.salescontroller;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    
    List<Producto> findAll();
   
    List<Producto> findAllByCodigo(String codigo);

    Producto save(Producto p);

    Producto findAllByid(int id);
}
