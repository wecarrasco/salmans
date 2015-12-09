package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Camion {
    ArrayList <Orden> listaOrdenes;

    public Camion() {
        listaOrdenes = new ArrayList<>();
    }
    
    public void addOrden(Orden n){
        if (listaOrdenes.size() < 20) {
            listaOrdenes.add(n);
        }else{
            JOptionPane.showMessageDialog(null, "Ya no hay espacio, agregando a otro camion");
            
            
        }
    }

    public Camion(ArrayList<Orden> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }

    public ArrayList<Orden> getListaOrdenes() {
        return listaOrdenes;
    }

    public void setListaOrdenes(ArrayList<Orden> listaOrdenes) {
        this.listaOrdenes = listaOrdenes;
    }
    
    
}
