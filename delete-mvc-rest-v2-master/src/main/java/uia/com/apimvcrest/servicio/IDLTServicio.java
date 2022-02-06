package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.modelo.CotizacionModelo;

import java.io.IOException;

public interface IDLTServicio {
    CotizacionModelo borraDLT(Long id) throws IOException;
}
