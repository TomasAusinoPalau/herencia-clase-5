public class Auditor extends User {
    
    public Auditor(String email, String fechaAlta, String cuil, String password) {
        super(email, fechaAlta, cuil, password);
    }

    public void definirSustancia() {

    }

    public void altaSustancia() {

        enviarMailProductores();
    }

    public void bajaSustancia() {
        
        enviarMailProductores();
    }

    private void enviarMailProductores() {

    }

}
