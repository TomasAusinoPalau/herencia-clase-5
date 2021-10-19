public class Auditor extends User {
    
    public Auditor(String email, String fechaAlta, String cuil, String password) {
        super(email, fechaAlta, cuil, password);
    }

    public Sustancia definirSustanciaSimple(String formula, String name, double pureza, String color, int cantidad) {
        return new SustanciaSimple(formula, name, pureza, color, cantidad);
    }

    public Sustancia definirSustanciaCompuesta(String formula, String name, double pureza, int cantidad) {
        return new SustanciaCompuesta(formula, name, pureza, cantidad);
    }

    public void altaSustancia(Sustancia sustancia, Productor productor) {
        productor.añadirSustancia(sustancia);
        enviarMailProductores();
    }

    public void bajaSustancia() {
        
        enviarMailProductores();
    }

    private void enviarMailProductores() {

    }

}
