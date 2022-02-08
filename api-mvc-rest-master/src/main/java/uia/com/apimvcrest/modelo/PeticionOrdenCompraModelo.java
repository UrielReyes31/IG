package uia.com.apimvcrest.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import uia.com.apimvcrest.compras.InfoComprasUIA;
import uia.com.apimvcrest.compras.PeticionOrdenCompra;

import java.util.ArrayList;

public class PeticionOrdenCompraModelo extends InfoComprasUiaModelo{
    public PeticionOrdenCompraModelo(){
        super();
    }

    public PeticionOrdenCompraModelo(int id, String name, String codigo, int vendedor, int clasificacion, double total, int entrega){
        super(id,name,codigo, vendedor, clasificacion,total,entrega);
    }


}
