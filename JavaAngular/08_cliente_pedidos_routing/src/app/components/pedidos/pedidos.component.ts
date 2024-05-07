import { ProductosService } from './../../service/productos.service';
import { Component, OnInit } from '@angular/core';
import { Producto } from '../../model/Producto';
import { Pedido } from '../../model/Pedido';
import { PedidosService } from '../../service/pedidos.service';

@Component({
  selector: 'app-pedidos',
  templateUrl: './pedidos.component.html',
  styleUrl: './pedidos.component.css'
})
export class PedidosComponent  implements OnInit {
  pedidos:Pedido[];

  constructor(private pedidosService:PedidosService){
  }

  ngOnInit(): void {
    this.cargarPedidos();
  }

  cargarPedidos():void{
    this.pedidosService
    .pedidos()
    .subscribe(data=>this.pedidos=data);
  }
}
