package model;

public class Encargado{
    private String nombre;
    private String edad;
    private String codigoEncargado;

    public Encargado(){}

    public Encargado(String nombre, String edad, String codigoEncargado){
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String getCodigoEncargado() {
        return codigoEncargado;
    }

}
