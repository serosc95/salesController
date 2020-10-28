import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service'
import { Producto } from 'src/app/Modelo/Producto';

@Component({
  selector: 'app-caja',
  templateUrl: './caja.component.html',
  styleUrls: ['./caja.component.css']
})
export class CajaComponent implements OnInit {

  productos: Producto[];
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit(): void {
    this.service.getProducto()
      .subscribe(data => {
        this.productos = data;
      });
  }

  onSelect(id:number):void{
    console.log(id);
  }
}
