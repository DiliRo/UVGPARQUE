package controller;

import model.Parque;
import model.PuntoAcceso;

public class ParqueController {
    private Parque parque;

    EncargadoController encargadoController = new EncargadoController();


    public void crearParque(String nombre, String codigoIdentificacion, String nombreEncargado) {
        parque = new Parque(nombre, codigoIdentificacion, nombreEncargado);
        encargadoController.agregarEncargado(nombreEncargado);
        
    }
    
    public PuntoAcceso[] buscarPuntosAccesos(){
        return parque.getPuntosAcceso();
    }

}
