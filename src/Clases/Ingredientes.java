package Clases;

public class Ingredientes {
    String nombre;

    public Ingredientes(String nombre) {
        this.nombre = nombre;
    }

    public Ingredientes() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
 
    
}
