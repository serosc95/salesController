package com.control.salescontroller;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
    List<Cliente> findAll();
    Cliente save(Cliente p);
    Cliente findAllByIdentificacion(int identificacion);
}
