package Clases;

import java.util.ArrayList;

public class Orden {
    ArrayList <Producto> listaOrden;
    String estado;

    public Orden() {
        listaOrden = new ArrayList<>();
    }

    public Orden(ArrayList<Producto> listaOrden) {
        this.listaOrden = listaOrden;
        estado = "ordenado";
    }
    
    
    
    public void addProducto(Producto p){
        listaOrden.add(p);
    }
    
    public int getCantidad(){
        return listaOrden.size();
    }
    
    public Producto get(int num){
        return listaOrden.get(num);
    }
}
