package view;

import controller.ParqueController;
import controller.PuntoAccesoController;
import java.util.Scanner;
import model.PuntoAcceso;
public class PuntoAccesoView {
    private PuntoAcceso puntoAcceso;
    private ParqueController parqueController;


    Scanner sc = new Scanner(System.in);
    PuntoAccesoController puntoAccesoController = new PuntoAccesoController();

        public PuntoAccesoView(ParqueController parqueController) {
            this.parqueController = parqueController;        
        }
    


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
        System.out.println("arreglo");
        puntoAccesoController.agregarPuntoAcceso(parqueController.buscarPuntosAccesos(), (posicion - 1), codigo, nombre, ubicacion, capacidad);
    }

    public void buscarPuntoAcceso(){
        PuntoAcceso[] puntos = parqueController.buscarPuntosAccesos();
        for (int i = 0; i < puntos.length; i++) {
            if (puntos[i] != null) {
                System.out.println("Posición " + (i + 1)+ ": " + puntos[i]);
            }
        }
    }

    public void buscarPunto(){
        
        System.out.println("Ingrese el numero de punto de acceso que desea ver");
        int id = sc.nextInt();
        PuntoAcceso puntos = puntoAccesoController.buscarPorPosicion(parqueController.buscarPuntosAccesos(), (id-1));
        System.out.println("Posición " + (id)+ ": " + puntos);
    }

    public void modificarPuntoAcceso(){
        System.out.println("Ingrese el numero de punto de acceso que deseas modificar");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la nueva capacidad");
        int capacidad = sc.nextInt();
        System.out.println("Ingrese el nuevo estado 1) True, 2) False");
        int estado = sc.nextInt();

        sc.nextLine();
        
        PuntoAcceso[] puntos = parqueController.buscarPuntosAccesos();
        puntoAccesoController.actualizarPuntoAcceso(puntos,(id-1), capacidad, (estado == 1? true :false));
    }


    public void eliminarPuntoAcceso(){
        PuntoAcceso[] puntos = parqueController.buscarPuntosAccesos();
        System.out.println("Ingrese el numero de punto de acceso que desea eliminar");
        int id = sc.nextInt();

        puntoAccesoController.eliminarPuntoAcceso(puntos, (id-1));
    }

    public void mostrarPuntosAccesoHabilitados(){
        PuntoAcceso[] puntos = parqueController.buscarPuntosAccesos();
        for (int i = 0; i < puntos.length; i++) {
            if (puntos[i] != null && puntos[i].getEstado() != false) {
                System.out.println(i);
            }
        }
    }



}
