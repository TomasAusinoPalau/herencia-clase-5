import java.sql.Date;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            Ejercicios:
                hacer ida-vuelta entre consumidor y productor, delegando las tareas.

            Leer patrones de diseño:
                Patron generativo. PROTOTYPE.
        */
        Auditor auditor = new Auditor("email@auditor.com", "22/05/2020", "20-22222222-1", "no-password");

        Sustancia sust1 = auditor.definirSustanciaSimple("H2O", "Agua", 98.8, "Transparente", 100);
        Sustancia sust2 = auditor.definirSustanciaSimple("CO2", "Carbono", 44.01, "Transparente", 100);
        Sustancia sust3 = auditor.definirSustanciaSimple("N2", "Nitrogeno", 28.01, "Transparente", 100);
        Sustancia sust4 = auditor.definirSustanciaSimple("O2", "Oxigeno", 32.01, "Transparente", 100);


        Productor producer = new Productor("Claudio", 44, "producer@laboratorio.com", "18/10/2021", "20-12345678-1", "megusta");
        Consumidor consumer = new Consumidor("Juan", 44, "consumer@gmail.com", "18/10/2021","20-87654321-1", "nomegusta");

        auditor.altaSustancia(sust1, producer);
        auditor.altaSustancia(sust2, producer);
        auditor.altaSustancia(sust3, producer);
        auditor.altaSustancia(sust4, producer);

        Date day = new Date(20210918);

        Tramite tramite1 = consumer.iniciarTramite(15, day, "Agua", producer);
        consumer.cerrarTramite(tramite1);
        
        Tramite tramite2 = consumer.iniciarTramite(10, day, "Nitrogeno", producer);
        consumer.cerrarTramite(tramite2);
        
        Tramite tramite3 = consumer.iniciarTramite(10, day, "Carbono", producer);
        consumer.cerrarTramite(tramite3);
    }
}
