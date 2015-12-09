package Clases;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Cocinero extends Thread{
    Orden o;
    JProgressBar barra;
    ArrayList<Ingredientes> listaIngredientes;
    int tiempo;
    JLabel label;
    Bodega bodega;

    public Cocinero(Orden o, JProgressBar barra, ArrayList<Ingredientes> listaIngredientes, JLabel label, Bodega bodega) {
        super();
        this.o = o;
        this.barra = barra;
        this.listaIngredientes = listaIngredientes;
        this.tiempo = 0;
        this.label = label;
        this.bodega = bodega;
        for (int i = 0; i < o.getCantidad(); i++) {
            tiempo += o.get(i).getTiempo();
        }
    }

    @Override
    public void run(){
        
        for (int i = 0; i < listaIngredientes.size(); i++) {
            bodega.getIngrediente(listaIngredientes.get(i));
        }
       
        this.barra.setMaximum(tiempo);
        for (int i = 1; i <= this.tiempo; i++) {
            if (tiempo < 25) {
                label.setText("Horneando");
            }else if (tiempo > 25 && tiempo < 80) {
                label.setText("Cocinando");
            }else if (tiempo > 80) {
                label.setText("Empacando");
            }

            barra.setValue(i);
            pausa(1000);
        }
        
        JOptionPane.showMessageDialog(null, "orden terminada");
    }
    
    public void pausa(int mlSeg) {
        try {
            Thread.sleep(mlSeg);
        } catch (InterruptedException e) {

        }
    }
}
