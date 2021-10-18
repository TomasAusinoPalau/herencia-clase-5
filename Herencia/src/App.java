import java.sql.Date;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            Ejercicios:
                hacer ida-vuelta entre consumidor y productor, delegando las tareas.

            Leer patrones de diseño:
                Patron generativo. PROTOTYPE.
        */

        Sustancia sust1 = new SustanciaSimple("H2O", "Agua", 98.8, "Transparente", 100);
        Sustancia sust2 = new SustanciaSimple("CO2", "Carbono", 44.01, "Transparente", 100);
        Sustancia sust3 = new SustanciaSimple("N2", "Nitrogeno", 28.01, "Transparente", 100);
        Sustancia sust4 = new SustanciaSimple("O2", "Oxigeno", 32.01, "Transparente", 100);


        Productor producer = new Productor("Claudio", 44, "producer@laboratorio.com", "18/10/2021", "20-12345678-1", "megusta");
        Consumidor consumer = new Consumidor("Juan", 44, "consumer@gmail.com", "18/10/2021","20-87654321-1", "nomegusta");

        producer.añadirSustancia(sust1);
        producer.añadirSustancia(sust2);
        producer.añadirSustancia(sust3);
        producer.añadirSustancia(sust4);

        Date day = new Date(20210918);

        consumer.iniciarTramite(10, day, "Agua", producer);
        consumer.cerrarTramite(1);
    }
}
