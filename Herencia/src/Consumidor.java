import java.time.Instant;
import java.util.*;
public class Consumidor extends User implements IRenovable {


    private Date fechaRenovacion;

    public Consumidor(String name, int edad, String email, String fechaAlta, String cuil, String password) {
        super(name, edad, email,fechaAlta, cuil, password);
        this.fechaRenovacion = new Date();
    }

    public void iniciarTramite(int cantidad, Date fecha, String sustanciaSolicitada, Productor productor) {
        Tramite tramite = new Tramite(cantidad, fecha, sustanciaSolicitada, productor, this);
        solicitarSustancia(tramite);
    }
    private void solicitarSustancia(Tramite tramite) {
        tramite.getProductor().manipularTramite(tramite);
    }
    
    public void cerrarTramite(int idTramite) {
        System.out.println("El tramite "+ idTramite + " fue cerrado y la sustancia recibida");
    }

    public Date getFechaRenovacion() {
        return fechaRenovacion;
    }
    
    @Override
    public void renovarDatos(String dni) {
        String[] datos = this.getCuil().split("-");
        if(datos[1].equals(dni)) {
            System.out.println("La cuenta ha sido actualizada");
        } else {
            String nuevoCuil = datos[0] + "-" + dni + "-" + datos[2];
            this.setCuil(nuevoCuil);
            System.out.println("El dni y la cuenta han sido actualizados");
        }
        this.setFechaRenovacion();
        
    }

    @Override
    public void setFechaRenovacion() {
        this.fechaRenovacion = Date.from(Instant.now());
    }
}
