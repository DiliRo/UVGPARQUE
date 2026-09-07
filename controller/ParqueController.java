package controller;

import java.util.ArrayList;
import model.Parque;
import model.PuntoAcceso;
import controller.EncargadoController;

public class ParqueController {
    private Parque parque;

    private ArrayList<Parque> listaDeParques;

    EncargadoController encargadoController = new EncargadoController();

    public ParqueController() {
        listaDeParques = new ArrayList<>();
    }

    public void crearParque(String nombre, String codigoIdentificacion, String nombreEncargado) {
        parque = new Parque(nombre, codigoIdentificacion, nombreEncargado);
        encargadoController.agregarEncargado(nombreEncargado);
        listaDeParques.add(parque);
    }

    public ArrayList<Parque> buscarParques() {
        return listaDeParques;
    }

    public PuntoAcceso[] buscarPuntosAccesos(){
        return parque.getPuntosAcceso();
    }

    public Parque buscarParquePorId(String codigoIdentificacion) {
        for (Parque parque : listaDeParques) {
            if (parque.getCodigoIdentificacion().equalsIgnoreCase(codigoIdentificacion)) {
                return parque;
            }
        }
        return null;
    }
}
