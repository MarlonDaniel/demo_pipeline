import { Injectable } from '@angular/core';

// imports pour former le request 
import { HttpClient, HttpHeaders} from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class ApiRequestService {

constructor(
  private http: HttpClient,
) { }

getHeaders(): HttpHeaders {
  let headers = new HttpHeaders({
    "Content-Type": "application/json",
    'Access-Control-Allow-Headers': 'Content-Type',
    'Access-Control-Allow-Methods': 'GET, PUT, POST',
    'Access-Control-Allow-Origin': '*',
    //"token":sessionStorage.getItem('token') || ""
  });
  //console.log("token",sessionStorage.getItem('token'));
  return headers;
}

get(url: string): Observable<any> {
  //return this.http.get(url).pipe(
  return this.http.get(url, { headers: this.getHeaders() }).pipe(
    catchError(function (error: any) {
      if (error.status === 401) {
        //this.router.navigate(['/logout']);
      }
      return throwError(error);
    })
  );
}
} 