package uia.com.compras;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SolicitudCotizacion extends PeticionOrdenCompra{

    private int cotizacion;

    public SolicitudCotizacion(@JsonProperty("id")int id, @JsonProperty("name")String name,
                               @JsonProperty("codigo")String codigo, @JsonProperty("unidad")String unidad,
                               @JsonProperty("cantidad")int cantidad, @JsonProperty("vendedor")int vendedor, @JsonProperty("clasificacionProveedor")int cotizacion)
    {
        super(id, name, codigo, unidad, cantidad);
        this.cotizacion = cotizacion;
    }
    public SolicitudCotizacion(PeticionOrdenCompra info){
        super(info.getId(), info.getName(), info.getCodigo(), info.getUnidad(), info.getCantidad());
        this.setClasificacion(info.getClasificacion());
    }
    public SolicitudCotizacion(){

    }

    public int getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(int cotizacion) {
        this.cotizacion = cotizacion;
    }
    public void hazCotizacion(PeticionOrdenCompra info){
        for(int i=0; i<info.getItems().size(); i++) {
           cotizacion =+ info.getCantidad();
        }
        System.out.println("cotizacion:" +cotizacion);
    }

    public void hazCotizacion(Comprador miComprador) {
       // miComprador.vendedores.entrySet().forEach(System.out::println);
        //miComprador.vendedores.values().forEach(System.out::println);
        //System.out.println(Arrays.toString(miComprador.vendedores.values().stream().toArray()));

    }
}
