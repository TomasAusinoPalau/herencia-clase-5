import java.util.concurrent.atomic.AtomicInteger;

import java.util.*;
public class Tramite {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int cantidad, numeroTramite;
    private Date fecha;
    private String sustanciaSolicitada;
    private Productor productor;
    private Consumidor comprador;

    public Tramite(int cantidad, Date fecha, String sustanciaSolicitada, Productor productor, Consumidor comprador) {
        this.cantidad = cantidad;
        this.fecha = new Date(fecha.getTime());
        this.sustanciaSolicitada = sustanciaSolicitada;
        this.productor = productor;
        this.numeroTramite = count.incrementAndGet();
        this.comprador = comprador;
    }


    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public  void setNumeroTramite(int numeroTramite) {
        this.numeroTramite = numeroTramite;
    }
    public int getNumeroTramite() {
        return numeroTramite;
    }
    public void setProductor(Productor productor) {
        this.productor = productor;
    }
    public Productor getProductor() {
        return productor;
    }
    public String getSustanciaSolicitada() {
        return sustanciaSolicitada;
    }
    public void setSustanciaSolicitada(String sustanciaSolicitada) {
        this.sustanciaSolicitada = sustanciaSolicitada;
    }

}
