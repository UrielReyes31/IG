
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, of } from 'rxjs';
import { IReporte } from './IReporte';
import { map, tap,catchError } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class ReportesService {

  httpOptions = {
    Headers: new HttpHeaders({'Content-Type':'application/json' })
  };

  reportesUrl = "http://localhost:8080/reportes";

  constructor(private http: HttpClient) {

   }
  
  public getReportes()
  {
    return this.http.get<IReporte[]>(this.reportesUrl)
      .pipe(
      tap(_ => console.log('extrayendo catalogo')),
      catchError(this.handleError<IReporte[]>('loadReportes', []))
      );
  }
  private handleError<T>(operation = 'operation', result?: T){
    return (error: any): Observable<T> => {
      console.error(error);
      console.log('${operation} failed: ${error.message}');
      return of(result as T);
    };
 }

  agregaReporte (Reporte: IReporte): Observable<IReporte> {
  return this.http.post<IReporte>(this.reportesUrl, Reporte, this.httpOptions).pipe(
    tap((newReporte: IReporte) => console.log('added reporte w/ id = ${newReporte.id}')),
    catchError(this.handleError<IReporte>('addReporte'))
    );
  }
}
