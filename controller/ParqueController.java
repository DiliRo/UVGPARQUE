package controller;

import model.Encargado;
import model.Parque;
import java.util.ArrayList;

public class ParqueController {

    private ArrayList<Parque> listaDeParques;

    public ParqueController() {
        listaDeParques = new ArrayList<Parque>();
    }

    public void crearParque(String nombre, String codigoIdentificacion, Encargado encargado) {
        Parque parque = new Parque(nombre, codigoIdentificacion, encargado);
        listaDeParques.add(parque);
    }

    public ArrayList<Parque> buscarParques() {
        return listaDeParques;
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
