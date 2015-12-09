package Clases;

import java.util.ArrayList;

public class Producto {
    ArrayList <Ingredientes> listaIngredientes;
    int tiempo;
    String nombre;
    double precio;
    String estado;

    public Producto(int tiempo, String nombre, double precio) {
        listaIngredientes = new ArrayList<>();
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = "menu";
    }

    public Producto(ArrayList<Ingredientes> listaIngredientes, int tiempo, String nombre, double precio) {
        this.listaIngredientes = listaIngredientes;
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = "menu";
    }

    
    
    public Producto() {
    }

    public ArrayList<Ingredientes> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingredientes> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public void addIngrediente(Ingredientes i){
        listaIngredientes.add(i);
    }
    
    public void addIngrediente(String nombre){
        listaIngredientes.add(new Ingredientes(nombre));
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
