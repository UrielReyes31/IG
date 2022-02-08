package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.modelo.ItemPOCModelo;

import java.util.ArrayList;

public interface IPeticionOrdenCompraServicio {
    ArrayList<ItemPOCModelo> getPeticiones();
    Object getPeticion(int id);
    void print();
}
