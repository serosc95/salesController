package com.control.salescontroller;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findAll();

    Producto save(Producto p);

    void delete(Producto p);
}
