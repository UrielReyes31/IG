package uia.com.apimvcrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import uia.com.apimvcrest.modelo.ReporteModelo;
import uia.com.apimvcrest.modelo.ItemComprasUIAModelo;
import uia.com.apimvcrest.servicio.ReportesServicio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ReportesController
{
    private ReportesServicio servicioReportes;
    //ArrayList<ReporteModelo> reportees = new ArrayList<ReporteModelo>();

    @Autowired
    public ReportesController(ReportesServicio servicio) throws IOException {
        this.servicioReportes = servicio;
    }


    @GetMapping("/reportes")
    public ArrayList<ReporteModelo> Reportes()
    {
        return servicioReportes.getReportes();
    }

    @GetMapping("/reporte/{id}")
    public ReporteModelo reporteById(@PathVariable int id)
    {
        return  servicioReportes.getReporte(id);
    }

    @DeleteMapping("/reporte/{id}")
    public ReporteModelo deleteReportesById(@PathVariable int id)
    {
        return  servicioReportes.deleteReportes(id);
    }

    @PutMapping("/reporte/{id}")
    public ReporteModelo reportePutById(@PathVariable int id, @RequestBody ItemComprasUIAModelo newItem)
    {
        return  servicioReportes.putReporte(id, newItem);
    }

    public ReportesServicio getServicioReportes() {
        return servicioReportes;
    }

    public void setServicioReportes(ReportesServicio servicioReportes) {
        this.servicioReportes = servicioReportes;
    }
}

