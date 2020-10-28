import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service'
import { Producto } from 'src/app/Modelo/Producto';

@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.css']
})
export class ShowComponent implements OnInit {

  productos: Producto[];
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit() {
    this.service.getProducto()
      .subscribe(data => {
        this.productos = data;
      });
  }
  Editar(producto:Producto):void{
    localStorage.setItem("id",producto.id.toString());
    this.router.navigate(["edit"]);
  }
  Add():void{
    this.router.navigate(["add"]);
  }

}
