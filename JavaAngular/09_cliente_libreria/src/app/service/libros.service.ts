import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Libro } from '../model/Libro';
import { Observable } from 'rxjs';
import { PASSWORD, USUARIO } from '../custom_properties';

@Injectable({
  providedIn: 'root'
})
export class LibrosService {

  urlBase:string="http://localhost:8800/"

  constructor(private http:HttpClient ) { }
/* FUNCIONA
  login(usuario: string, password: string) {
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(usuario + ':' + password) }); //btoa codifica en base64
    return this.http.get<any>('api/login', { headers });
  }
*/
  catalogo():Observable<Libro[]>{
    return this.http.get<Libro[]>(this.urlBase+"catalogo");
  }
  tematicas():Observable<string[]>{
    return this.http.get<string[]>(this.urlBase+"tematicas");
  }
  libro(isbn:number):Observable<Libro>{
    let cadBase64=btoa(USUARIO+":"+PASSWORD);
    //añadir encabezado Authorization
    let heads=new HttpHeaders();
    heads=heads.set("Authorization","Basic "+cadBase64);
    return this.http.get<Libro>(this.urlBase+"libro/"+isbn,{headers:heads});
  }
  alta(libro:Libro):Observable<void>{
    let cadBase64=btoa(USUARIO+":"+PASSWORD);
    //añadir encabezado Authorization
    let heads=new HttpHeaders();
    heads=heads.set("Authorization","Basic "+cadBase64);
    return this.http.post<void>(this.urlBase+"alta", libro,{"headers":heads});
  }
}
