package view;

import controller.ParqueController;
import controller.PuntoAccesoController;
import java.util.InputMismatchException;
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
        try {
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

            sc.nextLine();
            puntoAccesoController.agregarPuntoAcceso(parqueController.buscarPuntosAccesos(), (posicion - 1), codigo, nombre, ubicacion, capacidad);
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un valor numerico");
            sc.nextLine();
        } finally {
            System.out.println("Metodo finalizado");
        }
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
        try {
            System.out.println("Ingrese la posición del punto de acceso que desea ver (1,2,3,4,5)");
            int id = sc.nextInt();

            sc.nextLine();

            PuntoAcceso puntos = puntoAccesoController.buscarPorPosicion(parqueController.buscarPuntosAccesos(), (id - 1));

            if (puntos == null) {
                System.out.println("La posición es inválida o no contiene un punto de acceso");
                return;
            }

            System.out.println("Posición " + id + ": " + puntos);
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un valor numerico");
            sc.nextLine();
        }
    }

    public void modificarPuntoAcceso(){
        try {
            System.out.println("Ingrese el numero de punto de acceso que deseas modificar");
            int id = sc.nextInt();
            sc.nextLine();

            if (id < 1 || id > 5) {
                throw new IllegalArgumentException("La posición debe estar entre 1 y 5");
            }   

            System.out.println("Ingrese la nueva capacidad");
            int capacidad = sc.nextInt();

            System.out.println("Ingrese el nuevo estado 1) True, 2) False");
            int estado = sc.nextInt();
            sc.nextLine();

            if (estado != 1 && estado != 2) {
                throw new IllegalArgumentException("El estado solamente puede ser 1 o 2");
            }

            PuntoAcceso[] puntos = parqueController.buscarPuntosAccesos();
            puntoAccesoController.actualizarPuntoAcceso(puntos, (id - 1), capacidad, (estado == 1 ? true : false));
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un valor numerico");
            sc.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public void eliminarPuntoAcceso(){
        try {
            PuntoAcceso[] puntos = parqueController.buscarPuntosAccesos();

            if (puntos == null) {
                System.out.println("No hay un parque creado");
                return;
            }

            System.out.println("Ingrese el numero de punto de acceso que desea eliminar");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println(puntoAccesoController.eliminarPuntoAcceso(puntos, (id - 1)));
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un valor numerico");
            sc.nextLine();
        }
    }

    public void mostrarPuntosAccesoHabilitados(){
        PuntoAcceso[] puntos = parqueController.buscarPuntosAccesos();
        System.out.println("Cantidad de puntos de acceso habilitados: " + puntoAccesoController.contarHabilitados(puntos));
    }

    public void mostrarPuntosAccesosDisponibles(){
        PuntoAcceso[] puntos = parqueController.buscarPuntosAccesos();
        System.out.println("Puntos de acceso disponibles: " + puntoAccesoController.contarDisponibles(puntos));
    }

    public void puntoAccesoConMayorCapacidad(){
        PuntoAcceso[] puntos = parqueController.buscarPuntosAccesos();
        System.out.println("Punto de acceso con mayor capacidad: " + puntoAccesoController.obtenerMayorCapacidad(puntos));
    }



}
