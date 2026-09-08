package model;

import java.util.ArrayList;
public class Parque {
    private String nombre;
    private String codigoIdentificacion;
    private String nombreEncargado;
    private PuntoAcceso[] puntosAcceso;
    private  ArrayList<Visitante> visitantes;

    public Parque(){
        visitantes = new ArrayList<>();
        puntosAcceso = new PuntoAcceso[5];
    }

    public Parque(String nombre, String codigoIdentificacion, String nombreEncargado){
        this.nombre = nombre;
        this.codigoIdentificacion = codigoIdentificacion;
        this.nombreEncargado = nombreEncargado;
        puntosAcceso = new PuntoAcceso[5];
        visitantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public void setCodigoIdentificacion(String codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public String getEncargado() {
        return nombreEncargado;
    }

    public void setEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public PuntoAcceso[] getPuntosAcceso() {
        return puntosAcceso;
    }

    public void setPuntosAcceso(PuntoAcceso[] puntosAcceso) {
        this.puntosAcceso = puntosAcceso;
    }

    public ArrayList<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(ArrayList<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    @Override
    public String toString() {
        return "Nombre del Parque: " + nombre + "\nCodigo de Identificacion: " + codigoIdentificacion + "\nEncargado: " + nombreEncargado + "\nPuntos de Acceso: " + puntosAcceso.length;
    }

}
