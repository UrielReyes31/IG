package uia.com.apimvcrest.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;
import uia.com.apimvcrest.compras.InfoComprasUIA;
import uia.com.apimvcrest.compras.PeticionOrdenCompra;

import java.util.ArrayList;

public class PeticionOrdenCompraModelo {

    private int id;
    private String name;
    private String codigo;
    private String unidad;
    private int cantidad;
    private int vendedor;
    private int clasificacion;
    private String descripcion;
    private int pedidoProveedor;

    private ArrayList<IpeticionOrdenModelo> items = new ArrayList<IpeticionOrdenModelo>();

    public ArrayList<IpeticionOrdenModelo> getItems() {
        return items;
    }

    public void setItems(ArrayList<IpeticionOrdenModelo> items) {
        this.items = items;
    }

    public PeticionOrdenCompraModelo(int id, String name, String codigo, int vendedor, int clasificacion, int cantidad, String descripcion, int pedidoProveedor) {
        this.id = id;
        this.name = name;
        this.codigo = codigo;
        this.vendedor = vendedor;
        this.clasificacion = clasificacion;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.pedidoProveedor =pedidoProveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getVendedor() {
        return vendedor;
    }

    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPedidoProveedor() {
        return pedidoProveedor;
    }

    public void setPedidoProveedor(int pedidoProveedor) {
        this.pedidoProveedor = pedidoProveedor;
    }


    public void print() {
        System.out.println( "PeticionOrdenCompraModelo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", codigo='" + codigo + '\'' +
                ", unidad='" + unidad + '\'' +
                ", cantidad=" + cantidad +
                ", vendedor=" + vendedor +
                ", clasificacion=" + clasificacion +
                ", descripcion='" + descripcion + '\'' +
                ", pedidoProveedor=" + pedidoProveedor +
                '}');

        if(this.getItems() != null)
        {
            for(int i=0; i<this.getItems().size(); i++)
                this.getItems().get(i).print();
        }
    }

}
