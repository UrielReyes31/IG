package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.compras.GestorCompras;
import uia.com.apimvcrest.modelo.CotizacionModelo;

import java.io.IOException;

public class DLTServicio implements IDLTServicio {
    private GestorCompras miGestorCompras = new GestorCompras();

    public DLTServicio() throws IOException {
    }

    @Override
    public CotizacionModelo borraDLT(Long id) throws IOException{
       return this.miGestorCompras.borraDLT(id);
    }
}
