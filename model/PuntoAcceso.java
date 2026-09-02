package model;

import java.util.ArrayList;
public class PuntoAcceso {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private int capacidadMaximaHora;
    private Boolean estado;
    private  ArrayList<Visitante> visitantes;
    
    public PuntoAcceso(){
        visitantes = new ArrayList<>();
    }

    public PuntoAcceso(String codigo, String nombre, String ubicacion, int capacidadMaximaHora, Boolean estado){
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidadMaximaHora = capacidadMaximaHora;
        this.estado = estado;
        visitantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidadMaximaHora() {
        return capacidadMaximaHora;
    }
    
    public void setCapacidadMaximaHora(int capacidadMaximaHora) {
        this.capacidadMaximaHora = capacidadMaximaHora;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(ArrayList<Visitante> visitantes) {
        this.visitantes = visitantes;
    }
}