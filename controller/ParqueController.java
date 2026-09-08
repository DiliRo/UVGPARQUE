package controller;

import java.util.ArrayList;
import model.Parque;
import model.PuntoAcceso;
import model.Visitante;


public class ParqueController {
    private Parque parque;
    private  ArrayList<Visitante> visitantes;

    public ParqueController(){
        visitantes = new ArrayList<>();
    }

    EncargadoController encargadoController = new EncargadoController();

    public void crearParque(String nombre, String codigoIdentificacion, String nombreEncargado) {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre del parque no puede estar vacío.");
            }

            if (codigoIdentificacion == null || codigoIdentificacion.trim().isEmpty()) {
                throw new IllegalArgumentException("El código de identificación no puede estar vacío.");
            }

            if (nombreEncargado == null || nombreEncargado.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre del encargado no puede estar vacío.");
            }


            parque = new Parque(nombre, codigoIdentificacion, nombreEncargado);
            encargadoController.agregarEncargado(nombreEncargado);
        } catch (IllegalArgumentException e ) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public Parque mandarParque(){
        return parque;
    }

    public PuntoAcceso[] buscarPuntosAccesos(){
        return parque.getPuntosAcceso();
    }

}
