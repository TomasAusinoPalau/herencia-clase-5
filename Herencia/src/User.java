public abstract class User {
    private String name, email, fechaAlta, cuil, password;
    int edad;

    public User(String name, int edad, String email, String fechaAlta, String cuil, String password) {
        this.name = name;
        this.email = email;
        this.fechaAlta = fechaAlta;
        this.cuil = cuil;
        this.password = password;
        this.edad = edad;
    }

    // constructor mínimo
    public User(String email, String fechaAlta, String cuil, String password) {
        this.email = email;
        this.fechaAlta = fechaAlta;
        this.cuil = cuil;
        this.password = password;
    }


    public String getCuil() {
        return cuil;
    }
    public void setCuil(String cuil) {
        this.cuil = cuil;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    

}
