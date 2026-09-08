package view;
import java.util.Scanner;
import controller.VisitanteController;
public class VisitanteView {
    Scanner sc = new Scanner(System.in);
    VisitanteController visitanteController = new VisitanteController();

    public void crearVisitante(){
        System.out.println("Ingrese el nombre del visitante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad del visitante: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el codigo de entrada del visitante: ");
        String codigoEntrada = sc.nextLine();
        visitanteController.crearVisitante(nombre, edad, codigoEntrada);
    }

    public void buscarVisitante(){
        System.out.println(visitanteController.buscarVisitante());
    }

    public void buscarVisitante(String codigoEntrada){
        System.out.println(visitanteController.buscarVisitante(codigoEntrada));
    }

    public void editarVisitante(){
        System.out.println("Ingrese el nombre del visitante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad del visitante: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el codigo de entrada del visitante: ");
        String codigoEntrada = sc.nextLine();
        System.out.println("Ingrese los puntos acumulados del visitante: ");
        int puntosAcumulados = sc.nextInt();
        System.out.println("Ingrese la cantidad de atracciones del visitante: ");
        int cantidadAtracciones = sc.nextInt();
        visitanteController.editarVisitante(nombre, edad, codigoEntrada, puntosAcumulados, cantidadAtracciones);
    }

    public void eliminarVisitante(String codigoEntrada){
        visitanteController.eliminarVisitante(codigoEntrada);
    }



}