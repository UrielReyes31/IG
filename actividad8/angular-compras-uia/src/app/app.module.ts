import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ReportesComponeteComponent } from './reportes-componete/reportes-componete.component';
import { CotizacionesComponenteComponent } from './cotizaciones-componente/cotizaciones-componente.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { ReporteDetalleComponent } from './reporte-detalle/reporte-detalle.component';


@NgModule({
  declarations: [
    AppComponent,
    ReportesComponeteComponent,
    CotizacionesComponenteComponent,
    ReporteDetalleComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
