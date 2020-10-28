import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ShowComponent } from './Products/show/show.component';
import { AddComponent } from './Products/add/add.component';
import { EditComponent } from './Products/edit/edit.component';
import{FormsModule}from '@angular/forms';
import{ServiceService}from '../app/Service/service.service';
import{HttpClientModule}from '@angular/common/http';
import { RegistryComponent } from './Products/registry/registry.component';
import { SearchComponent } from './Products/search/search.component';
import { CajaComponent } from './Products/caja/caja.component';

@NgModule({
  declarations: [
    AppComponent,
    ShowComponent,
    AddComponent,
    EditComponent,
    RegistryComponent,
    SearchComponent,
    CajaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
