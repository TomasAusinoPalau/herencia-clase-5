public abstract class Sustancia {
    private String formula;
    private String name;
    private double pureza;
    private int cantidad;

    public Sustancia(String formula, String name, double pureza, int cantidad) {
        this.formula = formula;
        this.name = name;
        this.pureza = pureza;
        this.cantidad = cantidad;
    }

    public String getFormula() {
        return formula;
    }
    public void setFormula(String formula) {
        this.formula = formula;
    }
    public String getNombre() {
        return name;
    }
    public void setNombre(String name) {
        this.name = name;
    }
    public double getPureza() {
        return pureza;
    }
    public void setPureza(double pureza) {
        this.pureza = pureza;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
