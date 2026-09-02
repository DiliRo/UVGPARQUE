package model;

public class Parque {
    private String nombre;
    private String codigoIdentificacion;
    private Encargado encargado;
    private PuntoAcceso[] puntosAcceso;

    public Parque(){
        puntosAcceso = new PuntoAcceso[5];
    }

    public Parque(String nombre, String codigoIdentificacion, Encargado encargado){
        this.nombre = nombre;
        this.codigoIdentificacion = codigoIdentificacion;
        this.encargado = encargado;
        puntosAcceso = new PuntoAcceso[5];
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

    public Encargado getEncargado() {
        return encargado;
    }

    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }

    public PuntoAcceso[] getPuntosAcceso() {
        return puntosAcceso;
    }

    public void setPuntosAcceso(PuntoAcceso[] puntosAcceso) {
        this.puntosAcceso = puntosAcceso;
    }

}
