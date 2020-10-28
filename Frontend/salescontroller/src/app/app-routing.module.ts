import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ShowComponent } from './Products/show/show.component';
import { AddComponent } from './Products/add/add.component';
import { EditComponent } from './Products/edit/edit.component';
import { SearchComponent } from './Products/search/search.component';
import { RegistryComponent } from './Products/registry/registry.component';
import { CajaComponent } from './Products/caja/caja.component';

const routes: Routes = [
  {path:'show', component:ShowComponent},
  {path:'add', component:AddComponent},
  {path:'edit',component:EditComponent},
  {path:'search',component:SearchComponent},
  {path:'registry',component:RegistryComponent},
  {path:'caja',component:CajaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
