import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { PedidosComponent } from './components/pedidos/pedidos.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    PedidosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [PedidosComponent]
})
export class AppModule { }
