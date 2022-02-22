
package com.apimvcrest.servicio;

import com.apimvcrest.modelo.SolicitudesModelo;
import com.apimvcrest.modelo.ItemComprasUIAModelo;

import java.util.ArrayList;

public interface ISolicitudesServicio {
    ArrayList<SolicitudesModelo> getSolicitudes();
    Object getSolicitud(int id);
    void print();

    SolicitudesModelo deleteSolicitud(int id);
    SolicitudesModelo putSolicitud(int id, ItemComprasUIAModelo newItem);
}
