import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ShowComponent } from './Products/show/show.component';
import { AddComponent } from './Products/add/add.component';
import { EditComponent } from './Products/edit/edit.component';

const routes: Routes = [
  {path:'show', component:ShowComponent},
  {path:'add', component:AddComponent},
  {path:'edit',component:EditComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
