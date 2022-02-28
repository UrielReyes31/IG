import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ReportesComponeteComponent } from './reportes-componete/reportes-componete.component';
import { CotizacionesComponenteComponent } from './cotizaciones-componente/cotizaciones-componente.component';

@NgModule({
  declarations: [
    AppComponent,
    ReportesComponeteComponent,
    CotizacionesComponenteComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
