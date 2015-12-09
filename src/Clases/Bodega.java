package Clases;

import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Bodega {
    ArrayList<Stack> listaBodega;

    public Bodega() {
        listaBodega = new ArrayList<>();
    }
    
    
    public void addIngrediente(Ingredientes i){
        boolean existe = false;
        for (int j = 0; j < listaBodega.size(); j++) {
            if (((Ingredientes)listaBodega.get(j).peek()).getNombre().contentEquals(i.getNombre()) ) {
                listaBodega.get(j).push(i);
                existe = true;
            }
        }
        
        if (existe == false) {
            Stack temp = new Stack();
            temp.push(i);
            listaBodega.add(temp);
        }
    }
    
    public void addIngrediente(String im){
        boolean existe = false;
        Ingredientes i = new Ingredientes(im);
        for (int j = 0; j < listaBodega.size(); j++) {
            if (((Ingredientes)listaBodega.get(j).peek()).getNombre().contentEquals(i.getNombre()) ) {
                listaBodega.get(j).push(i);
                existe = true;
            }
        }
        
        if (existe == false) {
            Stack temp = new Stack();
            temp.push(i);
            listaBodega.add(temp);
        }
    }
    
    public Ingredientes getIngrediente(String nombre){
        boolean existe = false;
        Ingredientes i = new Ingredientes();
        for (int j = 0; j < listaBodega.size(); j++) {
            if (((Ingredientes)listaBodega.get(j).peek()).getNombre().contentEquals(nombre) ) {
                i = (Ingredientes)listaBodega.get(j).pop();
                existe = true;
            }
        }
        
        if (existe) {
            return i;
        }else{
            JOptionPane.showMessageDialog(null, "No hay existencia del ingrediente en bodega.");
            return null;
        }
    }
    
    
    public Ingredientes getIngrediente(Ingredientes i){
        boolean existe = false;
        Ingredientes in = new Ingredientes();
        for (int j = 0; j < listaBodega.size(); j++) {
            if (((Ingredientes)listaBodega.get(j).peek()).getNombre().contentEquals(i.getNombre()) ) {
                in = (Ingredientes)listaBodega.get(j).pop();
                existe = true;
            }
        }
        
        if (existe) {
            return in;
        }else{
            JOptionPane.showMessageDialog(null, "No hay existencia del ingrediente en bodega.");
            return null;
        }
    }
    
    public int size(){
         return listaBodega.size();
    }
    
    public String getNombre(int i){
        return ((Ingredientes)listaBodega.get(i).peek()).getNombre();
    }
    
    
    
    public Stack get(int i){
        return listaBodega.get(i);
        //return (Ingredientes)listaBodega.get(i).peek();
    }
    
}
