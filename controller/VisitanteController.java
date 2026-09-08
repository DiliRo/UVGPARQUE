package controller;
import java.util.ArrayList;
import  model.Parque;
import model.Visitante;
public class VisitanteController{
    private ParqueController parqueController;
    private Parque parqueGlobal;
    
    private  ArrayList<Visitante> visitantes;
    
  
    public VisitanteController() {
        visitantes = new ArrayList<>();
       
    }
    



    public boolean  crearVisitante( Parque parque, String nombre, int edad, String codigoEntrada){
        try {
            if (edad < 0) {
                throw  new IllegalArgumentException("No puede ingresar");
            }
            parqueGlobal = parque;
            
            for (Visitante visitante : parqueGlobal.getVisitantes()) {
                if (visitante.getCodigoEntrada().equalsIgnoreCase(codigoEntrada)) {
                    return false;
                }
            }
            Visitante visitante = new Visitante(nombre, edad, codigoEntrada);
            visitantes.add(visitante);
            parqueGlobal.setVisitantes(visitantes);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return  true;
    }

    public void obtenerVistantes(){
        ArrayList<Visitante> visitantesTotales = parqueGlobal.getVisitantes();
        for (int i = 0; i<visitantesTotales.size(); i++) {
            if (visitantesTotales.isEmpty()) {
                System.err.println("No hay visitantes registrados al parque");
            }else{
                System.out.println("Numero visitante: " + (i + 1) + visitantesTotales.get(i).toString());
            }
        }
       
    }

    public String buscarVisitante(String codigoEntrada){
        for (Visitante visitante : visitantes) {
                if (visitante.getCodigoEntrada().equalsIgnoreCase(codigoEntrada)) {
                    return visitante.toString();
                }
            }
    return  "No se encontro visitante";
    }

    public void  editarVisitante(String nombre, int edad, String codigoEntrada, int puntosAcumulados,int cantidadAtracciones){
        for (Visitante visitante : visitantes) {
                if (visitante.getCodigoEntrada().equalsIgnoreCase(codigoEntrada)) {
                    visitante.setNombre(nombre);
                    visitante.setEdad(edad);
                    visitante.setCantidadAtracciones(cantidadAtracciones);
                    visitante.setPuntosAcumulados(puntosAcumulados);
                } 
            }
        parqueGlobal.setVisitantes(visitantes);
    }

    public String eliminarVisitante(String codigoEntrada){
            for (Visitante visitante : visitantes) {
                if (visitante.getCodigoEntrada().equalsIgnoreCase(codigoEntrada)) {
                    visitantes.remove(visitante);
                    parqueGlobal.setVisitantes(visitantes);
                    return "Visitante eliminado";
                }
            }
            parqueGlobal.setVisitantes(visitantes);
            return "Visitante no eliminado";
    }
    
    public void cantidadVisitantes(){
        System.out.println("Cantidad de visitantes:" + visitantes.size());
    }

    public void obtenerVisitanteMayorPuntos() {
            if (visitantes.isEmpty()) {
                System.out.println("No hay visitantes registrados.");
                return;
            }

        Visitante mayor = visitantes.get(0);

        for (Visitante visitante : visitantes) {
            if (visitante.getPuntosAcumulados()> mayor.getPuntosAcumulados()) {
                mayor = visitante;
            }
        }

        System.out.println("Visitante con mayor cantidad de puntos: " + mayor);
    }

    public void obtenerVisitanteMayorAtracciones() {
    
        if (visitantes.isEmpty()) {
            System.out.println("No hay visitantes registrados.");
            return;
        }

        Visitante mayor = visitantes.get(0);

        for (Visitante visitante : visitantes) {
            if (visitante.getCantidadAtracciones() > mayor.getCantidadAtracciones()) {
                mayor = visitante;
            }
        }

        System.out.println("Visitante con mayor cantidad de atracciones: " + mayor);
    }

    public void promedioEdadVisitante(){
        int edad = 0;
        for(Visitante visitante: visitantes){
            edad = edad + visitante.getEdad();
        }

        System.out.println("Promedio de edad de los visitantes: " + (edad / visitantes.size()));

    }
}