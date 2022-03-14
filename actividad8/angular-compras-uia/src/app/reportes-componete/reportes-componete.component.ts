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

  public reporte = { name: "", id: 0}


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

  agregar(name: string, Id:string): void{
  name = name.trim();

  var newReporte= <IReporte>{};

  newReporte.id = Number(Id);
  newReporte.name = name;
  newReporte.type = "reporte";

  if (!name){return;}
  this.datosReportes.agregaReporte(newReporte)
  .subscribe(reporte => {
    this.reportes.push(reporte);
  });
 }
}


