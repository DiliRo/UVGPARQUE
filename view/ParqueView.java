package view;

import java.util.Scanner;
import controller.ParqueController;
import controller.PuntoAccesoController;

public class ParqueView {
    Scanner sc = new Scanner(System.in);
    ParqueController parqueController = new ParqueController();
    

    public void crearParque(){
        System.out.println("Ingrese el nombre del parque");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el codigo del parque");
        String codigoIdentificacion = sc.nextLine();
        System.out.println("Ingrese el nombre del encargado");
        String codigoEncargado = sc.nextLine();

        parqueController.crearParque(nombre, codigoIdentificacion, codigoEncargado);
    }

    public void obtenerParques(){
        System.out.println(parqueController.buscarParques());
    }
}
