package uia.com.apimvcrest.modelo;

import java.util.ArrayList;

public class IpeticionOrdenModelo {

    private int id;
    private String descripcion="";
    private int pedidoProveedor=0;
    private int clasificacion=-1;
    private String unidad="";
    private String codigo="";


    public IpeticionOrdenModelo(int id, int pedidoProveedor, String unidad, String codigo, int clasificacion, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.pedidoProveedor = pedidoProveedor;
        this.clasificacion = clasificacion;
        this.unidad = unidad;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String print() {
        return "IpeticionOrdenModelo{" +
                "id=" + this.id +
                ", descripcion='" + this.descripcion + '\'' +
                ", pedidoProveedor=" + this.pedidoProveedor +
                ", clasificacion=" + this.clasificacion +
                ", unidad='" + this.unidad + '\'' +
                ", codigo='" + this.codigo + '\'' +
                '}';
    }
}
