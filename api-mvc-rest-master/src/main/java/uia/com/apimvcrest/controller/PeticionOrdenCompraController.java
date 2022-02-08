package uia.com.apimvcrest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uia.com.apimvcrest.modelo.ItemPOCModelo;
import uia.com.apimvcrest.modelo.PeticionOrdenCompraModelo;
import uia.com.apimvcrest.servicio.PeticionOrdenCompraServicio;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class PeticionOrdenCompraController {

    private PeticionOrdenCompraServicio servicioPeticion = new PeticionOrdenCompraServicio();

    public PeticionOrdenCompraController () throws IOException {
    }

    @GetMapping("/peticiones")
    public ArrayList<ItemPOCModelo> peticiones()
    {
        return servicioPeticion.getPeticiones();
    }

    @GetMapping("/peticion/{id}")
    public ResponseEntity<PeticionOrdenCompraModelo> peticionById(@PathVariable int id)
    {
        return (ResponseEntity<PeticionOrdenCompraModelo>) servicioPeticion.getPeticion(id);
    }


}
