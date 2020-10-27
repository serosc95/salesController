package com.control.salescontroller;

import javax.persistence.*;

@Entity
@Table(name="TEST_PRODUCTO")
public class Producto {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String Codigo;
    @Column 
    private String Nombre;  
    @Column
    private int ValorUnidad;
    @Column
    private int Stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getValorUnidad() {
        return ValorUnidad;
    }

    public void setValorUnidad(int ValorUnidad) {
        this.ValorUnidad = ValorUnidad;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
}
