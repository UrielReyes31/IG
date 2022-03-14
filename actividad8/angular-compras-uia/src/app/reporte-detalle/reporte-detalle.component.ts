import { Component, Input, OnInit } from '@angular/core';
import { IReporte } from '../IReporte';
import { ReportesService } from '../reportes.service';

@Component({
  selector: 'app-reporte-detalle',
  templateUrl: './reporte-detalle.component.html',
  styleUrls: ['./reporte-detalle.component.css']
})
export class ReporteDetalleComponent implements OnInit {

  @Input() reporte?: IReporte;

  reportes: IReporte[]= [];

  selectedReporte?: IReporte;

  constructor(private datosReportes: ReportesService) { }

  ngOnInit(): void {
    this.datosReportes.getReportes().subscribe((data:any)=>{
      console.log(data);
      this.reportes = data;
    })
  }

  onSelect(reporte: IReporte): void{
    this.selectedReporte = reporte;
  }

}
