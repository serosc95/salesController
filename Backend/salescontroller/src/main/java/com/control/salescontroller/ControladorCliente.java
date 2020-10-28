package com.control.salescontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("cliente")
public class ControladorCliente {

    @Autowired
    private ClienteService serviceC;
    
    @GetMapping(value = "/")
    public List<Cliente>listar(){
        return serviceC.listar();
    }
    @PostMapping
    public Cliente agregar(@RequestBody Cliente p){
        return serviceC.add(p);
    }

}
