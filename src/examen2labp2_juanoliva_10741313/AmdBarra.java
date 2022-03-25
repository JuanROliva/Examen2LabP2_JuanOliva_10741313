package examen2labp2_juanoliva_10741313;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class AmdBarra implements Runnable{
    private JProgressBar bar;
    private double distancia;

    public AmdBarra(JProgressBar bar) {
        this.bar = bar;
    }

    public AmdBarra(JProgressBar bar, double distancia) {
        this.bar = bar;
        this.distancia = distancia;
    }
    
    public JProgressBar getBar() {
        return bar;
    }

    public void setBar(JProgressBar bar) {
        this.bar = bar;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public void run() {
        boolean condicion = true;
        for (int i = 0; i < distancia; i++) {
            bar.setValue(i);
            try {
                Thread.sleep(5L);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
