package uia.com.apimvcrest.controller;

import com.apimvcrest.servicio.SolicitudesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import uia.com.apimvcrest.modelo.SolicitudesModelo;
import uia.com.apimvcrest.modelo.ItemComprasUIAModelo;
import uia.com.apimvcrest.servicio.SolicitudServicio;

import java.io.IOException;
import java.util.List;

@Controller
public class SolicitudesController
{
    private SolicitudesServicio servicioSolicitudes;
    //ArrayList<ReporteModelo> reportees = new ArrayList<ReporteModelo>();

    @Autowired
    public SolicitudesController(SolicitudesServicio servicio) throws IOException {
        this.servicioSolicitudes = servicio;
    }



    @GetMapping("/viewSolicitudes")
    public String viewSolicitudes(ModelMap model)
    {
        List<SolicitudesModelo> solicitudes = servicioSolicitudes.getSolicitudes();
        System.out.println("Solicitudes: " + solicitudes.toString());
        model.addAttribute("solicitudes", servicioSolicitudes.getSolicitudes());
        return "view-solicitudes";
    }

    @GetMapping("/Solicitud/{id}")
    public SolicitudesModelo SolicitudById(@PathVariable int id)
    {
        return  servicioSolicitudes.getSolicitud(id);
    }

    @DeleteMapping("/Solicitud/{id}")
    public SolicitudesModelo deletesolicitudById(@PathVariable int id)
    {
        return  servicioSolicitudes.deleteSolicitud(id);
    }

    @PutMapping("/Solicitud/{id}")
    public SolicitudesModelo solicitudPutById(@PathVariable int id, @RequestBody ItemComprasUIAModelo newItem)
    {
        return  servicioSolicitudes.putSolicitud(id, newItem);
    }

    public SolicitudesServicio getServicioSolicitudes() {
        return servicioSolicitudes;
    }

    public void setServicioSolicitudes(SolicitudesServicio servicioSolicitudes) {
        this.servicioSolicitudes = servicioSolicitudes;
    }
}

