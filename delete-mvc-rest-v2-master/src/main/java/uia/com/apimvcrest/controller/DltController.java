package uia.com.apimvcrest.controller;

import org.springframework.web.bind.annotation.*;
import uia.com.apimvcrest.modelo.CotizacionModelo;
import uia.com.apimvcrest.servicio.DLTServicio;

import java.io.IOException;

@RestController
public class DltController {
    DLTServicio servicioDlt = new DLTServicio();
    public DltController() throws IOException {
    }

    @DeleteMapping("/cotizaciones/{id}")
    public CotizacionModelo dlt(@PathVariable("id") Long id) throws IOException{
        return servicioDlt.borraDLT(id);
    }
}
