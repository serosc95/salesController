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
    this.service.buscarCliente(this.cliente)
    .subscribe(data=>{
      console.log(data);
      if (data == null)
        this.router.navigate(["registry"]);
      else
        this.router.navigate(["caja"]);
    })
  }
}
