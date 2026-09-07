package controller;

import model.Encargado;
import java.util.Random;
public class EncargadoController {

    Random random = new Random();

    public void agregarEncargado(String nombreEncargado){
        int id = random.nextInt(900000)+100000;
        Encargado encargado = new Encargado(id,nombreEncargado);
    }

}
