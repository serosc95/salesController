import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Producto } from '../Modelo/Producto';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }
  Url='http://localhost:8080/control/productos';

  getProducto(){
    return this.http.get<Producto[]>(this.Url);
  }
}
