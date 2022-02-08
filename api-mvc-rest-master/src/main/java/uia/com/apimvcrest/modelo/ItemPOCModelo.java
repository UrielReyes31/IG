package uia.com.apimvcrest.modelo;

public class ItemPOCModelo extends ItemCotizacionModelo{

    private String unidad="";
    public ItemPOCModelo(){
        super();
    }
    public ItemPOCModelo(int cantidad, double valorUnitario, double subtotal, double total,String unidad)
    {
       super(cantidad,valorUnitario,subtotal,total);
       this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
