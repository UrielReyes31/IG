package uia.com.apimvcrest.controller;

import org.springframework.web.bind.annotation.*;
import uia.com.apimvcrest.compras.InfoComprasUIA;
import uia.com.apimvcrest.servicio.DLTServicio;

import java.io.IOException;

@RestController
public class DltController {
    DLTServicio servicioDlt = new DLTServicio();
    public DltController() throws IOException {
    }

    @DeleteMapping("/cotizaciones/{id}")
    public void dlt(@PathVariable("id") Long id) throws IOException{
        servicioDlt.borraDLT(id);
    }
}
