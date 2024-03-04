import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Producto } from '../model/Producto';

@Injectable({
  providedIn: 'root'
})
export class ProductosService {

  urlBase:string="http://localhost:9000/sproductos/";

   constructor(private http:HttpClient ) { }

   productos():Observable<Producto[]>{
    return this.http.get<Producto[]>(this.urlBase+"productos");
   }

}
