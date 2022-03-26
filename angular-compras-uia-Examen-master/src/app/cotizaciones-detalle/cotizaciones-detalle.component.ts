import { Component, Input, OnInit } from '@angular/core';
import { CotizacionService } from '../cotizacion.service';
import { ICotizacion } from '../ICotizacion';
import { IReporte } from '../iReporte';

@Component({
  selector: 'app-cotizaciones-detalle',
  templateUrl: './cotizaciones-detalle.component.html',
  styleUrls: ['./cotizaciones-detalle.component.css']
})
export class CotizacionesDetalleComponent implements OnInit {

  
 public cotizacion = { name: "", id: 0, padre:0 }

 cotizaciones: ICotizacion[] = [];

 selectedCotizacion?: ICotizacion;

 @Input() reporte!: IReporte;

  constructor(public datosCotizaciones:CotizacionService) { }

  ngOnInit(): void {
    this.datosCotizaciones.getCotizaciones(this.reporte.id).subscribe((data: any[])=>{
      console.log(data);
      this.cotizaciones = data;
    })
    
  }

  
  onSelect(cotizacion: ICotizacion): void {
    this.selectedCotizacion = cotizacion;
  }

  agregar(name: string, id:string): void {
    name = name.trim();

    var newCotizacion = <ICotizacion>{};
    
    newCotizacion.id=id;
    newCotizacion.name=name;
    newCotizacion.type="cotizacionNS";
    
    if (!name) { return; }
    this.datosCotizaciones.agregaCotizacion(newCotizacion)
      .subscribe(cotizacion => {
        this.cotizaciones.push(cotizacion);
      });
  }
  


}
