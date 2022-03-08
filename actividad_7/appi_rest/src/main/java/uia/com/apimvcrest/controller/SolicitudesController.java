package uia.com.apimvcrest.controller;

import uia.com.apimvcrest.modelo.CotizacionModelo;
import uia.com.apimvcrest.servicio.SolicitudesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import uia.com.apimvcrest.modelo.SolicitudesModelo;
import uia.com.apimvcrest.modelo.ItemComprasUIAModelo;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SolicitudesController
{
    private SolicitudesServicio servicioSolicitudes = new SolicitudesServicio();


    @Autowired
    public SolicitudesController(SolicitudesServicio servicio) throws IOException {
        this.servicioSolicitudes = servicio;
    }



    @GetMapping("/Solicitudes")
    public ArrayList<SolicitudesModelo> solicitudes() {
        return servicioSolicitudes.getSolicitudes();
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

