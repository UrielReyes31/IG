import { Component, OnInit } from '@angular/core';
import { IReporte } from '../IReporte';
import { FormsModule } from '@angular/forms';
import { ReportesService } from '../reportes.service';

@Component({
  selector: 'app-reportes-componete',
  templateUrl: './reportes-componete.component.html',
  styleUrls: ['./reportes-componete.component.css']
})
export class ReportesComponeteComponent implements OnInit {       

  
  public reporte: IReporte = {name: "Uriel", id: 0,
                    codigo: "1",
                    vendedor: 2,
                    clasificacionVendedor: 3,
                    total: 4,
                    entrega: 5 }

  reportes: IReporte[] = [];

  selectedReporte?: IReporte;
  

  constructor(private datosReportes:ReportesService) { }

  ngOnInit(): void {
    
    this.datosReportes.getReportes().subscribe((data: any[])=>{
      console.log(data);
      this.reportes = data;
    })
    
  }

  onSelect(reporte: IReporte): void{
    this.selectedReporte = reporte;
  }
}
