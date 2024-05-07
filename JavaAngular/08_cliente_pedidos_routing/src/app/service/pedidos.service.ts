import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pedido } from '../model/Pedido';

@Injectable({
  providedIn: 'root'
})
export class PedidosService {
  urlBase:string="http://localhost:9000/spedidos/";

  constructor(private http:HttpClient) { }

  alta(pedido:Pedido):Observable<void>{
    return this.http.post<void>(this.urlBase + "alta", pedido);
  }
  pedidos():Observable<Pedido[]>{
    return this.http.get<Pedido[]>(this.urlBase+"pedidos")
  }
}
