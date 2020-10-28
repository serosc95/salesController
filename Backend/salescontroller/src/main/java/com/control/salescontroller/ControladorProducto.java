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
@RequestMapping("producto")
public class ControladorProducto {

    @Autowired
    private ProductoService serviceP;
    
    @GetMapping(value = "/")
    public List<Producto>listar(){
        return serviceP.listar();
    }
    
    @PostMapping
    public Producto agregar(@RequestBody Producto p){
        return serviceP.add(p);
    }
    @GetMapping(path = {"/{id}"})
    public Producto listarId(@PathVariable("id")int id){
        return serviceP.listarId(id);
    }
    @PutMapping(path = {"/{id}"})
    public Producto editar(@RequestBody Producto p,@PathVariable("id") int id){
        p.setId(id);
        return serviceP.edit(p);
    }
}
