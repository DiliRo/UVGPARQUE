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
    
    public boolean crearVisitante(Parque parque, String nombre, int edad, String codigoEntrada){
        try {
            if (parque == null) {
                throw new IllegalArgumentException("El parque no puede ser nulo");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre del visitante no puede estar vacío");
            }

            if (edad <= 0) {
                throw new IllegalArgumentException("La edad debe ser mayor que 0");
            }

            if (codigoEntrada == null || codigoEntrada.trim().isEmpty()) {
                throw new IllegalArgumentException("El código de entrada no puede estar vacío");
            }



            parqueGlobal = parque;
                
            for (Visitante visitante : parqueGlobal.getVisitantes()) {
                if (visitante.getCodigoEntrada().equalsIgnoreCase(codigoEntrada)) {
                    System.out.println("Codigo de entrada ya existente, no se pudo completar la acción");
                    return false;
                }
            }

            Visitante visitante = new Visitante(nombre, edad, codigoEntrada);
            visitantes.add(visitante);
            parqueGlobal.setVisitantes(visitantes);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

        return true;
    }   

    public void obtenerVistantes(){
        try {
            if (parqueGlobal == null) {
                throw new IllegalArgumentException("No hay un parque creado");
            }

            ArrayList<Visitante> visitantesTotales = parqueGlobal.getVisitantes();

            if (visitantesTotales == null || visitantesTotales.isEmpty()) {
                System.err.println("No hay visitantes registrados al parque");
                return;
            }

            for (int i = 0; i < visitantesTotales.size(); i++) {
                System.out.println("Numero visitante: " + (i + 1) + "\n" + visitantesTotales.get(i).toString());
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public String buscarVisitante(String codigoEntrada){
        try {
            if (codigoEntrada == null || codigoEntrada.trim().isEmpty()) {
                throw new IllegalArgumentException("El código de entrada no puede estar vacío");
            }

            if (visitantes.isEmpty()) {
                return "No hay visitantes registrados";
            }

            for (Visitante visitante : parqueGlobal.getVisitantes()) {
                if (visitante.getCodigoEntrada().equalsIgnoreCase(codigoEntrada)) {
                    return visitante.toString();
                }
            }
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }

        return "No se encontró visitante";
    }

    public void editarVisitante(String nombre, int edad, String codigoEntrada, int puntosAcumulados, int cantidadAtracciones){
        try {
            if (parqueGlobal == null) {
                throw new IllegalArgumentException("No hay un parque creado");
            }

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío");
            }

            if (codigoEntrada == null || codigoEntrada.trim().isEmpty()) {
                throw new IllegalArgumentException("El código de entrada no puede estar vacío");
            }

            if (edad <= 0) {
                throw new IllegalArgumentException("La edad debe ser mayor que 0");
            }

            if (cantidadAtracciones < 0) {
                throw new IllegalArgumentException("La cantidad de atracciones no puede ser negativa");
            }

            if (puntosAcumulados < 0) {
                throw new IllegalArgumentException("Los puntos acumulados no pueden ser negativos");
            }

            if (visitantes.isEmpty()) {
                throw new IllegalArgumentException("No hay visitantes registrados");
            }

            boolean encontrado = false;

            for (Visitante visitante : parqueGlobal.getVisitantes()) {
                if (visitante.getCodigoEntrada().equalsIgnoreCase(codigoEntrada)) {
                    visitante.setNombre(nombre);
                    visitante.setEdad(edad);
                    visitante.setCantidadAtracciones(cantidadAtracciones);
                    visitante.setPuntosAcumulados(puntosAcumulados);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                throw new IllegalArgumentException("No se encontró el visitante");
            }

            parqueGlobal.setVisitantes(visitantes);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public String eliminarVisitante(String codigoEntrada){
        try {
            if (parqueGlobal == null) {
                throw new IllegalArgumentException("No hay un parque creado");
            }

            if (codigoEntrada == null || codigoEntrada.trim().isEmpty()) {
                throw new IllegalArgumentException("El código de entrada no puede estar vacío");
            }
            

            if (visitantes.isEmpty()) {
                throw new IllegalArgumentException("No hay visitantes registrados");
            }

            for (Visitante visitante : parqueGlobal.getVisitantes()) {
                if (visitante.getCodigoEntrada().equalsIgnoreCase(codigoEntrada)) {
                    visitantes.remove(visitante);
                    parqueGlobal.setVisitantes(visitantes);
                    return "Visitante eliminado";
                }
            }

            parqueGlobal.setVisitantes(visitantes);
            throw new IllegalArgumentException("No existe un visitante con el código ingresado");
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }
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

        for (Visitante visitante : parqueGlobal.getVisitantes()) {
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

        for (Visitante visitante : parqueGlobal.getVisitantes()) {
            if (visitante.getCantidadAtracciones() > mayor.getCantidadAtracciones()) {
                mayor = visitante;
            }
        }

        System.out.println("Visitante con mayor cantidad de atracciones: " + mayor);
    }

    public void promedioEdadVisitante(){
        if (visitantes == null || visitantes.isEmpty()) {
            System.out.println("No hay visitantes registrados.");
            return;
        }

        int edad = 0;

        for(Visitante visitante: parqueGlobal.getVisitantes()){
            edad = edad + visitante.getEdad();
        }

        System.out.println("Promedio de edad de los visitantes: " + ((double) edad / visitantes.size()));
    }

    public void cambiarParque(Parque parque){
        parqueGlobal = parque;
        visitantes = parqueGlobal.getVisitantes();
    }
}