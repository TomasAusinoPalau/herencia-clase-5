import java.util.*;
public class SustanciaCompuesta extends Sustancia {

    Vector<SustanciaCompuesta> composition = new Vector<SustanciaCompuesta>();

    public SustanciaCompuesta(String formula, String name, double pureza, int cantidad) {
        super(formula, name, pureza, cantidad);    
        this.composition = new Vector<SustanciaCompuesta>();
    }
    public SustanciaCompuesta(String formula, String name, float pureza,int cantidad, Vector<SustanciaCompuesta> composition) {
        super(formula, name, pureza, cantidad);  
        this.composition = composition;
    }
    public void componer(SustanciaCompuesta s) {
        this.composition.add(s);
    }

    public Vector<SustanciaCompuesta> descomponer() {
        Vector<SustanciaCompuesta> aux = this.composition;
        descomponer(this.composition);
        return aux;
    }

    public void descomponer(Vector<SustanciaCompuesta> simples) {
        for(SustanciaCompuesta sustancia : simples) {
            for(int i = 0; i < this.composition.size(); i++) {
                if(this.composition.get(i).getFormula().equals(sustancia.getFormula())) {
                    this.composition.remove(i);
                }
            }
        }
    }


}
