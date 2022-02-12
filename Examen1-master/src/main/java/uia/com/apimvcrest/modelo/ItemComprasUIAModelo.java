package uia.com.apimvcrest.modelo;

public class ItemComprasUIAModelo
{
    private int id;
    private String name="";
    private String descripcion="";
    private int pedidoProveedor=0;
    private int clasificacion=-1;
    private int vendedor=-1;
    private int cantidad;
    private String unidad="";
    private int existencia_inicial = 0;
    private int existencia_minima = 0;
    private int consumo_mensual = 0;

    public ItemComprasUIAModelo()
    {
    }

    public ItemComprasUIAModelo(int id, String name, String descripcion, int pedidoProveedor, int clasificacion, int vendedor, int cantidad, String unidad, String codigo, int existencia_inicial,int existencia_minima, int consumo_mensual) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.pedidoProveedor = pedidoProveedor;
        this.clasificacion = clasificacion;
        this.vendedor = vendedor;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.codigo = codigo;
        this.existencia_inicial = existencia_inicial;
        this.existencia_minima = existencia_minima;
        this.consumo_mensual = consumo_mensual;
    }
    public ItemComprasUIAModelo(String name, String descripcion, int pedidoProveedor, int existencia_inicial,int existencia_minima, int consumo_mensual) {
        this.name = name;
        this.descripcion = descripcion;
        this.pedidoProveedor = pedidoProveedor;
        this.existencia_inicial = existencia_inicial;
        this.existencia_minima = existencia_minima;
        this.consumo_mensual = consumo_mensual;
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

    public int getVendedor() {
        return vendedor;
    }

    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    private String codigo="";

    public int getExistencia_inicial() {
        return existencia_inicial;
    }

    public void setExistencia_inicial(int existencia_inicial) {
        this.existencia_inicial = existencia_inicial;
    }

    public int getExistencia_minima() {
        return existencia_minima;
    }

    public void setExistencia_minima(int existencia_minima) {
        this.existencia_minima = existencia_minima;
    }

    public int getConsumo_mensual() {
        return consumo_mensual;
    }

    public void setConsumo_mensual(int consumo_mensual) {
        this.consumo_mensual = consumo_mensual;
    }
}
