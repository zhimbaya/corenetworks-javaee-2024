import { Component } from '@angular/core';
import { Resultado } from '../../model/Resultado';
import { BuscadorService } from '../../service/buscador.service';

@Component({
  selector: 'app-buscador',
  templateUrl: './buscador.component.html',
  styleUrl: './buscador.component.css'
})
export class BuscadorComponent {
  tematica:string;
  resultados:Resultado[]=[];

  constructor(private buscadorService:BuscadorService){

  }

  buscar():void{
    this.buscadorService
    .buscarResultados(this.tematica)
    .subscribe(data=>this.resultados=data); //llamada asincrona
  }
}
