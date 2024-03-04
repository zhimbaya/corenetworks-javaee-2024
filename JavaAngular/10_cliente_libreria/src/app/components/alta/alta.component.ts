import { Component, OnInit } from '@angular/core';
import { LibrosService } from '../../service/libros.service';
import { Libro } from '../../model/Libro';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-alta',
  templateUrl: './alta.component.html',
  styleUrl: './alta.component.css'
})
export class AltaComponent implements OnInit{
  tematicas:string[];
  libro:Libro;

  constructor(private librosService:LibrosService, private router:Router){}

  ngOnInit(): void {
    this.libro = new Libro();
    this.cargarTematicas();
}

  registrarLibro():void{
    this.librosService
    .alta(this.libro)
    .subscribe(data=>this.router.navigate(["/catalogo"]));
    alert("Libro registrado");
  }
  cargarTematicas():void{
    this.librosService
    .tematicas()
    .subscribe(data=>this.tematicas=data);
  }
}
