import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Libro } from '../model/Libro';
import { Observable } from 'rxjs';
import { client_id, grant_type, password, urlAuth, username } from '../custom_properties';
import { TokenResponse } from '../model/TokenResponse';

@Injectable({
  providedIn: 'root'
})
export class LibrosService {
  token:string;
  urlBase:string="http://localhost:9000/"

  constructor(private http:HttpClient) {
    this.setToken();
  }

  catalogo():Observable<Libro[]>{
    let heads=new HttpHeaders();
    heads=heads.set("Authorization","Bearer "+this.token);
    return this.http.get<Libro[]>(this.urlBase+"catalogo",{"headers":heads});
  }

  tematicas():Observable<string[]>{
    return this.http.get<string[]>(this.urlBase+"tematicas");
  }

  libro(isbn:number):Observable<Libro>{
    return this.http.get<Libro>(this.urlBase+"libro/"+isbn);
  }

  alta(libro:Libro):Observable<void>{
    let heads=new HttpHeaders();
    heads=heads.set("Authorization","Bearer "+this.token);
    return this.http.post<void>(this.urlBase+"alta", libro,{"headers":heads});
  }

  setToken():void{
    let params=new HttpParams();
    let heads=new HttpHeaders();
    params=params.set("username",username);
    params=params.set("password",password);
    params=params.set("client_id",client_id);
    params=params.set("grant_type",grant_type);

    let url = urlAuth;
    heads = heads.set('Content-Type','application/x-www-form-urlencoded');
    this.http.post<TokenResponse>(url,params,{"headers":heads}).subscribe(data=>this.token=data.access_token);
  }
}
