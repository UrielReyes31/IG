package uia.com.apimvcrest.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.apimvcrest.compras.GestorCompras;
import uia.com.apimvcrest.modelo.SolicitudesModelo;
import uia.com.apimvcrest.modelo.ItemComprasUIAModelo;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class SolicitudesServicio implements ISolicitudesServicio {


    GestorCompras miGestorCompras;

    public SolicitudesServicio() throws IOException {
    }

    @Autowired
    public SolicitudesServicio(GestorCompras gestorCompras) throws IOException {
        this.miGestorCompras = gestorCompras;
    }

    @Override
    public ArrayList<SolicitudesModelo> getSolicitudes() {
        return miGestorCompras.getSocilitudes();
    }

    @Override
    public SolicitudesModelo getSolicitud(int id)
    {
        return miGestorCompras.getSolicitud(id);
    }

    @Override
    public void print()
    {
        miGestorCompras.printMiModeloReportes();
    }

    @Override
    public SolicitudesModelo deleteSolicitud(int id) {
        return miGestorCompras.deleteSolicitud(id);
    }

    @Override
    public SolicitudesModelo putSolicitud(int id, ItemComprasUIAModelo newItem)
    {
        return miGestorCompras.putSolicitud(id, newItem);
    }
}
