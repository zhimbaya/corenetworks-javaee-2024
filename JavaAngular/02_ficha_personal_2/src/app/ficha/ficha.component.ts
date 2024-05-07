import { Component } from '@angular/core';

@Component({
  selector: 'app-ficha',
  templateUrl: './ficha.component.html',
  styleUrl: './ficha.component.css'
})
export class FichaComponent {
  nombre:string = "";
  edad:number = 0;
  departamento:string = "";
  resultado:string = "";
  grabar():void{
    this.resultado =  "Te llamas: " + this.persona.nombre + " tienes " + this.persona.edad + " años de edad ";
    this.resultado += "y eres del departamento "+ this.persona.departamento;
  }
}
