package controller;

import java.util.Random;
import model.Encargado;

public class EncargadoController {

    Random random = new Random();

    public void agregarEncargado(String nombreEncargado) {

        try {
            if (nombreEncargado == null|| nombreEncargado.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre del encargado no puede estar vacío.");
            }
            int id = random.nextInt(900000) + 100000;
            Encargado encargado = new Encargado(id, nombreEncargado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}