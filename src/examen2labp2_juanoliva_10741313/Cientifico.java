package examen2labp2_juanoliva_10741313;

import java.io.Serializable;
import java.util.ArrayList;

public class Cientifico implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String nombreCientifico;
    private ArrayList<Planeta> planetas = new ArrayList<>();

    public Cientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }

    @Override
    public String toString() {
        return nombreCientifico;
    }
    
}
