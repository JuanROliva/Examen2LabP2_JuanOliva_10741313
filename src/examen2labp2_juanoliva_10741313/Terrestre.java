package examen2labp2_juanoliva_10741313;

import javax.swing.JOptionPane;

public class Terrestre extends Planeta{

    public Terrestre() {
        super();
    }

    public Terrestre(String nombrePlaneta, int size, int peso, int cx, int cy) {
        super(nombrePlaneta, size, peso, cx, cy);
    }


    @Override
    public Object colision(Planeta p) {
        int r = aleatorio.nextInt(100);
        if (r >= 0 && r <= 25) {
            String nombrePlaneta = JOptionPane.showInputDialog(null, "Se creó un nuevo Planeta"
                    + "\nIngrese el nombre del nuevo Planeta:");
            int peso = (this.getPeso() + this.getPeso())/2;
            int size = (this.getSize() + p.getPeso())/2;
            int cX = (this.getCx() + p.getCx())/2;
            int cY = (this.getCy() + p.getCy())/2;
            Terrestre nuevo = new Terrestre(nombrePlaneta, cY, peso, cX, cY);
            return nuevo;
        }
        return false;
    }
    
}
