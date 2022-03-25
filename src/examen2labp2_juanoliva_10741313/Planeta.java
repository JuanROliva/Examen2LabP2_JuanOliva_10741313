package examen2labp2_juanoliva_10741313;

import java.util.Random;

public abstract class Planeta {
    private String nombrePlaneta;
    private int size, peso, cx, cy;
    protected Random aleatorio = new Random();

    public Planeta() {
    }

    public Planeta(String nombrePlaneta, int size, int peso, int cx, int cy) {
        this.nombrePlaneta = nombrePlaneta;
        this.size = size;
        this.peso = peso;
        this.cx = cx;
        this.cy = cy;
    }
    
    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    @Override
    public String toString() {
        return nombrePlaneta;
    }
    
    public abstract Object colision(Planeta p);
    
}
