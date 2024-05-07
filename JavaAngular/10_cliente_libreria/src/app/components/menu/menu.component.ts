import { HttpHeaders, HttpParams } from '@angular/common/http';
import { client_id, grant_type, password, urlAuth, username } from '../../custom_properties';
import { LibrosService } from './../../../../../09_cliente_libreria/src/app/service/libros.service';
import { Component, OnInit } from '@angular/core';
import { Libro } from '../../model/Libro';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrl: './menu.component.css'
})
export class MenuComponent  {

}
