import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ShowComponent } from './Products/show/show.component';
import { AddComponent } from './Products/add/add.component';
import { EditComponent } from './Products/edit/edit.component';

@NgModule({
  declarations: [
    AppComponent,
    ShowComponent,
    AddComponent,
    EditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
