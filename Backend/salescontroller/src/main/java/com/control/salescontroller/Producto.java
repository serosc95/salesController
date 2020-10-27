package com.control.salescontroller;

import javax.persistence.*;

@Entity
@Table(name="TEST_PRODUCTO")
public class Producto {

    @Id
    @Column(name = "IdProducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Codigo")
    private String codigo;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "ValorUnidad")
    private int valorUnidad;
    @Column(name = "Stock")
    private int stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
