import { Injectable, Output } from '@angular/core';

import { Observable } from "rxjs";
import { ApiRequestService } from "./api-request.service";

// import de les variables de environement (dossier environments)
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class VoitureService {

constructor(
  private apiRequest: ApiRequestService
) { 
}

list(): Observable<any> {
  //return this.apiRequest.get(`${environment.ENDPOINT_API}/voiture/list/${nombre}`);
  console.log("LOG voiture.service.ts - Observable");
  //return this.apiRequest.get(`localhost:3000/voiture/list/`);
  return this.apiRequest.get(`${environment.api_endopoint}/voiture/list`);
}

}
