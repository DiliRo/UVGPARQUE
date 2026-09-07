package model;

public class Visitante{
    private String nombre;
    private int edad;
    private int puntosAcumulados;
    private int cantidadAtracciones;
    private String codigoEntrada;

    public Visitante(){}

    public Visitante(String nombre, int edad, String codigoEntrada){
        this.nombre = nombre;
        this.edad = edad;
        this.codigoEntrada = codigoEntrada;
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

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public int getCantidadAtracciones() {
        return cantidadAtracciones;
    }

    public void setCantidadAtracciones(int cantidadAtracciones) {
        this.cantidadAtracciones = cantidadAtracciones;
    }

    public String getCodigoEntrada() {
        return codigoEntrada;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigoEntrada + ", Nombre: " + nombre + ", Edad: " + edad + ", Puntos Acumulados: " + puntosAcumulados + ", Cantidad de Atracciones: " + cantidadAtracciones;
    }
   
}