package uia.com.apimvcrest.servicio;

import uia.com.apimvcrest.compras.GestorCompras;
import uia.com.apimvcrest.modelo.ItemPOCModelo;

import java.io.IOException;
import java.util.ArrayList;

public class PeticionOrdenCompraServicio implements IPeticionOrdenCompraServicio{
    private GestorCompras miGestorCompras = new GestorCompras();

    public PeticionOrdenCompraServicio() throws IOException {
    }

    @Override
    public ArrayList<ItemPOCModelo> getPeticiones() {
        return miGestorCompras.getPeticiones();
    }

    @Override
    public Object getPeticion(int id) {
        return null;
    }

    @Override
    public void print() {
        miGestorCompras.printMiModeloPeticiones();
    }
}
