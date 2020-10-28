import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service'
import { Cliente } from 'src/app/Modelo/Cliente';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  cliente:Cliente=new Cliente();
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
  }

  Buscar(){
    let value;
    this.service.buscarCliente(this.cliente)
    .subscribe(data=>{
      value = data;
      if (value == 0)
        this.router.navigate(["registry"]);
      else
      {
        localStorage.setItem("cedula",value.toString());
        this.router.navigate(["caja"]);
      }
    })
  }
}
