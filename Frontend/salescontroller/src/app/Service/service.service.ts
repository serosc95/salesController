import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Producto } from '../Modelo/Producto';
import { Cliente } from 'src/app/Modelo/Cliente';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }
  UrlProduct='http://localhost:8080/producto/';
  UrlClient='http://localhost:8080/cliente/';

  getProducto(){
    return this.http.get<Producto[]>(this.UrlProduct);
  }
  createProducto(producto:Producto){
    return this.http.post<Producto>(this.UrlProduct,producto);
  }
  getProductoId(id:number){
    return this.http.get<Producto>(this.UrlProduct+"/"+id);
  }
  updateProducto(producto:Producto){
    return this.http.put<Producto>(this.UrlProduct+"/"+producto.id,producto);
  }
  buscarCliente(cliente:Cliente){
    return this.http.post<Cliente>(this.UrlClient,cliente);
  }
}
