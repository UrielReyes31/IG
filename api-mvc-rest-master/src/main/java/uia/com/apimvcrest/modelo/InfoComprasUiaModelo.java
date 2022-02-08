package uia.com.apimvcrest.modelo;

import java.util.ArrayList;

public class InfoComprasUiaModelo {
    private int id;
    private String name;
    private String codigo;
    private int vendedor;
    private int clasificacion;
    private int cantidad=-1;
    private double total=0.0;
    private int entrega;

    public InfoComprasUiaModelo(){}
    private ArrayList<ItemCotizacionModelo> Items = new ArrayList<>();

    public ArrayList<ItemCotizacionModelo> getItems(){return Items;}

    public void setItems(ArrayList<ItemCotizacionModelo> Items ){
        this.Items = Items;
    }

    public InfoComprasUiaModelo(int id, String name, String codigo, int vendedor, int clasificacion, double total, int entrega) {
        this.id = id;
        this.name = name;
        this.codigo = codigo;
        this.total = total;
        this.entrega = entrega;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getEntrega() {
        return entrega;
    }

    public void setEntrega(int entrega) {
        this.entrega = entrega;
    }

    public void print() {
        System.out.println( "PeticionOrdenCompraModelo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", codigo='" + codigo + '\'' +
                ", cantidad=" + cantidad +
                ", vendedor=" + vendedor +
                ", clasificacion=" + clasificacion +
                ", total=" + total +
                ", entrega=" + entrega +
                '}');

        if(this.getItems() != null)
        {
            for(int i=0; i<this.getItems().size(); i++)
                this.getItems().get(i).print();
        }
    }
}
