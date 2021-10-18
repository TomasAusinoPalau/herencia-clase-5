public class SustanciaSimple extends Sustancia {
    private String color;

    SustanciaSimple(String formula, String name, double pureza, String color, int cantidad) {
        super(formula, name, pureza, cantidad);
        this.color = color;
    
    }

    @Override
    public int getCantidad() {
        // TODO Auto-generated method stub
        return super.getCantidad();
    }
}
