package view;

import java.util.Scanner;
import model.PuntoAcceso;
import controller.ParqueController;
import controller.PuntoAccesoController;
public class PuntoAccesoView {
    private PuntoAcceso puntoAcceso;

    Scanner sc = new Scanner(System.in);

    ParqueController parqueController = new ParqueController();

    PuntoAccesoController puntoAccesoController = new PuntoAccesoController();

    public void crearPuntoAcceso(){


        System.out.println("Ingrese cual de los siguientes 5 accesos quiere agregar");
        int posicion = sc.nextInt();

        sc.nextLine();

        System.out.println("Ingrese el codigo del punto de acceso");
        String codigo = sc.nextLine();

        System.out.println("Ingrese el nombre del punto de acceso");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la ubicación");
        String ubicacion = sc.nextLine();

        System.out.println("Ingrese la capacidad maxima por hora");
        int capacidad = sc.nextInt();

        puntoAccesoController.agregarPuntoAcceso(parqueController.buscarPuntosAccesos(), (posicion - 1), codigo, nombre, ubicacion, capacidad);
    }

    public void buscarPuntoAcceso(){
        System.out.println(parqueController.buscarPuntosAccesos().toString());
        
    }



}
