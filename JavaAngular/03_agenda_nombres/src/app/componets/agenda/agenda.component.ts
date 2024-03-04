import { Component } from '@angular/core';

@Component({
  selector: 'app-agenda',
  templateUrl: './agenda.component.html',
  styleUrl: './agenda.component.css'
})
export class AgendaComponent {
  nombres:string[]=[]; //lista Json de cadenas vacías.
  nombre:string = "";
  nombreSel:string="";//guarda el nombre seleccionado
  guardar():void{
    this.nombres.push(this.nombre);
  }
  eliminar():void{
    //recorre array y elimina el nombre que coincide con el seleccionado
    for(let i=0;i<this.nombres.length;i++){
      if(this.nombres[i]==this.nombreSel){
        this.nombres.splice(i,1);
      }
    }
  }

}
