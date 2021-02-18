import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './components/app.component';
import { VoitureListComponent } from './components/voiture-list/voiture-list.component';
import {DemoComponent} from './components/demo/demo.component';

const routes: Routes = [
  { path: 'voiture', component: VoitureListComponent},
  { path: 'demo', component: DemoComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
