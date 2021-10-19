import java.time.Instant;
import java.util.*;


public class Productor extends User implements IRenovable {
    private Date fechaRenovacion;
    private Vector<Sustancia> sustancias = new Vector<Sustancia>();

    public Productor(String name, int edad, String email, String fechaAlta, String cuil, String password) {
        super(name, edad, email,fechaAlta, cuil, password);
        this.fechaRenovacion = new Date();
    }

    public Date getFechaRenovacion() {
        return fechaRenovacion;
    }

    

    @Override
    public void renovarDatos(String dni) {
        setFechaRenovacion();
    }

    @Override
    public void setFechaRenovacion() {
        this.fechaRenovacion = Date.from(Instant.now());
    }

    public void habilitarSustancia() {   

    }

    public void añadirSustancia(Sustancia sustancia) {
            sustancias.add(sustancia);
    }

    public boolean manipularTramite(Tramite tramite) {
        for(Sustancia sustancia : sustancias){
            if(tramite.getSustanciaSolicitada().equals(sustancia.getNombre())){
                if(sustancia.getCantidad() > tramite.getCantidad()){

                    sustancia.setCantidad(sustancia.getCantidad() - tramite.getCantidad());
                    aceptarAltaTramite(tramite.getNumeroTramite());
                    enviarProducto(tramite.getSustanciaSolicitada());
                    return true;
                } else {
                    rechazarAltaTramite(tramite.getNumeroTramite());
                    return false;
                }
            }
        }
        return false;  
    }

    private void enviarProducto(String sustancia) {
        System.out.println("Enviando producto " + sustancia);


    }

    public void aceptarAltaTramite(int numeroTramite) {
        System.out.println("Tramite aceptado, el número de identificación es: " + numeroTramite);

    }

    public void rechazarAltaTramite(int numeroTramite) {
        System.out.println("Tramite rechazado por falta de la sustancia solicitada");
    }
}
