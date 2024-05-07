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
  productos:Producto[];
  productoSel:string;

  pedidos:Pedido[];
  pedido:Pedido;

  constructor(private productosService:ProductosService, private pedidosService:PedidosService){
  }

  ngOnInit(): void {
    this.pedido=new Pedido();
    this.cargarProductos();//para cargar productos desde el principio
    this.cargarPedidos();
  }

  cargarProductos():void{
    this.productosService
    .productos()
    .subscribe(data=>this.productos=data);
  }

  guardarPedido():void{
    this.pedidosService.alta(this.pedido).subscribe(data=>this.cargarProductos());
  }

  cargarPedidos():void{
    this.pedidosService
    .pedidos()
    .subscribe(data=>this.pedidos=data);
  }
}
