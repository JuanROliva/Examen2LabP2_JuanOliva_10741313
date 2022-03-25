package examen2labp2_juanoliva_10741313;

import javax.swing.JOptionPane;

public class Gaseoso extends Planeta{

    public Gaseoso() {
        super();
    }

    public Gaseoso(String nombrePlaneta, int size, int peso, int cx, int cy) {
        super(nombrePlaneta, size, peso, cx, cy);
    }
    
    @Override
    public Object colision(Planeta p) {
        int r = aleatorio.nextInt(100);
        if (r >= 0 && r <= 20) {
            String nombrePlaneta = JOptionPane.showInputDialog(null, "Se creó un nuevo Planeta"
                    + "\nIngrese el nombre del nuevo Planeta:");
            int peso = (this.getPeso() + this.getPeso())/2;
            int size = (this.getSize() + p.getPeso())/2;
            int cX = (this.getCx() + p.getCx())/2;
            int cY = (this.getCy() + p.getCy())/2;
            Gaseoso nuevo = new Gaseoso(nombrePlaneta, size, peso, cX, cY);
            return nuevo;
        }
        return false;
    }
    
}
