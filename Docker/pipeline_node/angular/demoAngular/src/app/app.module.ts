import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './components/app.component';

// pour utiliser l'api-request.service.ts
import { HttpClientModule } from '@angular/common/http';
import { ApiRequestService } from './services/api/api-request.service';
import { VoitureService } from './services/api/voiture.service';
import { VoitureListComponent } from './components/voiture-list/voiture-list.component';


@NgModule({
  declarations: [
    AppComponent,
    VoitureListComponent    //NEUF Ajuter le component a les declarations 
  ],
  imports: [
    // Autres NgModules que cette module a besoin
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,   // NEUF appres de BrowserModule
  ],
  providers: [
    // services auquel l'application a besoin
    ApiRequestService,  
    VoitureService,
  ],
  bootstrap: [
    // l'application demarre avec le appModule
    AppComponent
  ]
})

export class AppModule { }
