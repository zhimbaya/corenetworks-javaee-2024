import { Component, OnInit } from '@angular/core';
import { ProductosService } from '../../service/productos.service';
import { PedidosService } from '../../service/pedidos.service';
import { Producto } from '../../model/Producto';
import { Pedido } from '../../model/Pedido';

@Component({
  selector: 'app-compra',
  templateUrl: './compra.component.html',
  styleUrl: './compra.component.css'
})
export class CompraComponent implements OnInit {
  productos:Producto[];
  pedido:Pedido;

  constructor(private productosService:ProductosService, private pedidosService:PedidosService){
  }
  ngOnInit(): void {
    this.pedido=new Pedido();
    this.cargarProductos();//para cargar productos desde el principio
  }

  cargarProductos():void{
    this.productosService
    .productos()
    .subscribe(data=>this.productos=data);
  }

  guardarPedido():void{
    this.pedidosService.alta(this.pedido).subscribe(data=>this.cargarProductos());
  }
}
