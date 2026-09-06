package model;

public class Encargado{
    private String nombre;
    private int edad;
    private String codigoEncargado;

    public Encargado(){}

    public Encargado(String nombre, int edad, String codigoEncargado){
        this.nombre = nombre;
        this.edad = edad;
        this.codigoEncargado = codigoEncargado;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getCodigoEncargado() {
        return codigoEncargado;
    }
    
    @Override
    public String toString() {
        return "Código: " + codigoEncargado + ", Nombre: " + nombre + ", Edad: " + edad;
    }
}

