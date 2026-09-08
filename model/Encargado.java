package model;

public class Encargado{
    private int codigoEncargado;
    private String nombre;

    public Encargado(){}

    public Encargado(int codigoEncargado, String nombre){
        this.codigoEncargado = codigoEncargado;
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCodigoEncargado() {
        return codigoEncargado;
    }
    
    @Override
    public String toString() {
        return "Código: " + codigoEncargado + ", Nombre: " + nombre;
    }
}

