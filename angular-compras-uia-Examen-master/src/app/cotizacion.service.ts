import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, of } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';
import { ICotizacion } from './ICotizacion';

@Injectable({
  providedIn: 'root'
})
export class CotizacionService {
  
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  cotizacionesUrl = "http://localhost:8080/cotizaciones";
  itemsUrl = "http://localhost:8080/item-rnsi";
  private cotizaciones$ = new BehaviorSubject<ICotizacion[]>([]);
 

  constructor(private http: HttpClient) { }

  public getCotizaciones(id:number)
  {
      this.cotizacionesUrl = "http://localhost:8080/cotizaciones"+`?id=`+id;
      this.http.get<ICotizacion[]>(this.cotizacionesUrl).subscribe((pozos) => this.cotizaciones$.next(pozos));
      return this.cotizaciones$;
  }
  
  private handleError<T>(operation = 'operation', result?: T) {
      return (error: any): Observable<T> => {      
        // TODO: send the error to remote logging infrastructure
        console.error(error); // log to console instead      
        // TODO: better job of transforming error for user consumption
        console.log(`${operation} failed: ${error.message}`);      
        // Let the app keep running by returning an empty result.
        return of(result as T);
      };
    }

    /** POST: add a new Solicitud to the server */
public agregaCotizacion(Cotizacion: ICotizacion): Observable<ICotizacion>  {
  return this.http.post<ICotizacion>(this.itemsUrl, Cotizacion, this.httpOptions).pipe(
    tap((newCotizacion: ICotizacion) => console.log(`added Cotizacion w/ id=${newCotizacion.id}`)),
    catchError(this.handleError<ICotizacion>('addCotizacion'))
  );
}




}
