import { Component, OnInit } from '@angular/core';
import { LibrosService } from '../../service/libros.service';
import { Libro } from '../../model/Libro';

@Component({
  selector: 'app-libros',
  templateUrl: './libros.component.html',
  styleUrl: './libros.component.css'
})
export class LibrosComponent implements OnInit {
  libro:Libro;
  //libros:Libro[];
  isbn:number;

  constructor(private librosService:LibrosService){}

  ngOnInit(): void {
      this.libro = new Libro();
  }

  cargarLibroIsbn():void{
    this.librosService
    .libro(this.isbn)
    .subscribe(data=>this.libro=data);
  }

}
