import { Component, OnInit } from '@angular/core';
import { LibrosService } from '../../service/libros.service';
import { Libro } from '../../model/Libro';

@Component({
  selector: 'app-catalogo',
  templateUrl: './catalogo.component.html',
  styleUrl: './catalogo.component.css'
})
export class CatalogoComponent implements OnInit{
  libro:Libro;
  libros:Libro[];

  constructor(private librosService:LibrosService){}

  ngOnInit(): void {
    this.libro = new Libro();
    this.cargarCatalogo();
}

  cargarCatalogo():void{
    this.librosService
    .catalogo()
    .subscribe(data=>this.libros=data);
  }
}
