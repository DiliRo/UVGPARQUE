package controller;
import java.util.ArrayList;
import  model.Parque;
import model.Visitante;

public class VisitanteController{
    private Parque parque;
    private  ArrayList<Visitante> visitantes;

    public VisitanteController(){
        visitantes = new ArrayList<>();
    }
    



    public boolean  crearVisitante(String nombre, int edad, String codigoEntrada){
        try {
            if (edad < 0) {
                throw  new IllegalArgumentException("No puede ingresar");
            }
            
            for (Visitante visitante : parque.getVisitantes()) {
                if (visitante.getCodigoEntrada().equalsIgnoreCase(codigoEntrada)) {
                    return false;
                }
            }
            Visitante visitante = new Visitante(nombre, edad, codigoEntrada);
            visitantes.add(visitante);
            parque.setVisitantes(visitantes);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return  true;
    }

    public String buscarVisitante(){
        ArrayList<Visitante> visitantesTotales = parque.getVisitantes();
        for (int i = 0; i<visitantesTotales.size(); i++) {
            if (visitantesTotales.isEmpty()) {
                return "No hay visitantes registrados al parque";
            }else{
                return "Numero visitante: " + (i + 1) + visitantesTotales.get(i).toString();
            }
        }
    return "Hola";
    }

    public String buscarVisitante(String codigoEntrada){
         for (Visitante visitante : visitantes) {
                if (visitante.getCodigoEntrada().equalsIgnoreCase(codigoEntrada)) {
                    return visitante.toString();
                }
            }
    return  "No se encontro visitante";
    }

    public boolean  editarVisitante(String nombre, int edad, String codigoEntrada, int puntosAcumulados,int cantidadAtracciones){
        
        try {
            if (edad <18 || puntosAcumulados< 0 || cantidadAtracciones < 0) {
                throw new IllegalArgumentException("Cantidad invalida");
            }


            
        } catch (IllegalArgumentException e) {
        }
        return true;
    }


    
}