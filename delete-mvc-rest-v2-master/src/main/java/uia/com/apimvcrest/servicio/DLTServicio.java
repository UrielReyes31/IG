package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.compras.GestorCompras;
import uia.com.apimvcrest.compras.InfoComprasUIA;

import java.io.IOException;

public class DLTServicio implements IDLTServicio {
    private GestorCompras miGestorCompras = new GestorCompras();

    public DLTServicio() throws IOException {
    }

    @Override
    public void borraDLT(Long id) throws IOException{
        this.miGestorCompras.borraDLT(id);
    }
}
