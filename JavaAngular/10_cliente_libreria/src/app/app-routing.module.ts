import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CatalogoComponent } from './components/catalogo/catalogo.component';
import { LibrosComponent } from './components/libros/libros.component';
import { AltaComponent } from './components/alta/alta.component';

const routes: Routes = [
  {
    path:"catalogo",
    component:CatalogoComponent
  },
  {
    path:"libros",
    component:LibrosComponent
  },
  {
    path:"alta",
    component:AltaComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
