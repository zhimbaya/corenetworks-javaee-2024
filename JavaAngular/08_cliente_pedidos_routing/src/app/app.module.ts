import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { PedidosComponent } from './components/pedidos/pedidos.component';
import { FormsModule } from '@angular/forms';
import { CompraComponent } from './components/compra/compra.component';
import { MenuComponent } from './components/menu/menu.component';

@NgModule({
  declarations: [
    PedidosComponent,
    CompraComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [MenuComponent]
})
export class AppModule { }
