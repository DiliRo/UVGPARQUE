package controller;

import java.util.ArrayList;
import model.Encargado;

public class EncargadoController {

    private ArrayList<Encargado> listaEncargados;

    public EncargadoController() {
        listaEncargados = new ArrayList<>();
    }

    public boolean agregarEncargado(String nombre, int edad, String codigoEncargado){
        for (Encargado e : listaEncargados) {
            if (e.getCodigoEncargado() == codigoEncargado) {
                return false;
            }
        }
        Encargado encargado = new Encargado(nombre, edad, codigoEncargado);
        listaEncargados.add(encargado);
        return true;
    }

    public ArrayList<Encargado> obtenerEncargados() {
        return new ArrayList<>(listaEncargados);
    }

    public Encargado buscarEncargado(String codigoEncargado) {
        for (Encargado encargado : listaEncargados) {
            if (encargado.getCodigoEncargado()
                    .equalsIgnoreCase(codigoEncargado)) {
                return encargado;
            }
        }
        return null;
    }
}
