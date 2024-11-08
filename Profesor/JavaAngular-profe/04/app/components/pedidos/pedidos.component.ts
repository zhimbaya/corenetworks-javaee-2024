import { Component } from '@angular/core';
import { Pedido } from '../../model/Pedido';

@Component({
  selector: 'app-pedidos',
  templateUrl: './pedidos.component.html',
  styleUrl: './pedidos.component.css'
})
export class PedidosComponent {
  pedidos:Pedido[]=[];
  pedido:Pedido;
  tablaVisible:boolean=false;
  constructor(){
    this.pedido=new Pedido();
  }
  agregarPedido():void{
    this.pedidos.push(this.pedido);
    this.pedido=new Pedido();
    console.log(this.pedidos);
  }
  verPedidos():void{
    this.tablaVisible=!this.tablaVisible;
  }
}
