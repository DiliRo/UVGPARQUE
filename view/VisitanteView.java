package view;
import controller.ParqueController;
import controller.VisitanteController;
import java.util.InputMismatchException;
import java.util.Scanner;
public class VisitanteView {
    private ParqueController parqueController;

    Scanner sc = new Scanner(System.in);
    VisitanteController visitanteController = new VisitanteController();

        public VisitanteView(ParqueController parqueController) {
            this.parqueController =parqueController;
        }
    

    public void crearVisitante(){
        try {
            System.out.println("Ingrese el nombre del visitante: ");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la edad del visitante: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el codigo de entrada del visitante: ");
            String codigoEntrada = sc.nextLine();

            visitanteController.crearVisitante(parqueController.mandarParque(), nombre, edad, codigoEntrada);
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar un valor numerico para la edad");
            sc.nextLine();
        }
    }

    public void obtenerVisitantes(){
        visitanteController.obtenerVistantes();
    }

    public void buscarVisitante(){
        System.out.println("Ingrese el codigo del visitante");
        String codigoEntrada = sc.nextLine();
        System.out.println(visitanteController.buscarVisitante(codigoEntrada));
    }

   public void editarVisitante(){
        try {
            System.out.println("Ingrese el codigo de entrada del visitante: ");
            String codigoEntrada = sc.nextLine();

            System.out.println("Ingrese el nombre del visitante: ");
            String nombre = sc.nextLine();

            System.out.println("Ingrese la edad del visitante: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese los puntos acumulados del visitante: ");
            int puntosAcumulados = sc.nextInt();

            System.out.println("Ingrese la cantidad de atracciones del visitante: ");
            int cantidadAtracciones = sc.nextInt();
            sc.nextLine();

            visitanteController.editarVisitante(nombre, edad, codigoEntrada, puntosAcumulados, cantidadAtracciones);
        } catch (InputMismatchException e) {
            System.out.println("Error: debe ingresar valores numericos para la edad, los puntos y las atracciones");
            sc.nextLine();
        }
    }   

    public void eliminarVisitante(){
        System.out.println("Ingrese el codigo del visitante: ");
        String codigoEntrada = sc.nextLine();

        System.out.println(visitanteController.eliminarVisitante(codigoEntrada));
    }

    public void obtenerVisitanteMayorAtracciones(){
        visitanteController.obtenerVisitanteMayorAtracciones();
    }

    public void obtenerVisitanteMayorPuntos(){
        visitanteController.obtenerVisitanteMayorPuntos();
    }

    public void promedioEdadVisitante(){
        visitanteController.promedioEdadVisitante();
    }

    public void cantidadVisitante(){
        visitanteController.cantidadVisitantes();
    }



}