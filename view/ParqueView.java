package view;

import controller.ParqueController;
import java.util.Scanner;

public class ParqueView {
    private ParqueController parqueController;
    Scanner sc = new Scanner(System.in);
    
    

    public ParqueView(
        ParqueController parqueController) {
            this.parqueController = parqueController;
        }   

    public void crearParque(){
        System.out.println("Ingrese el nombre del parque");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el codigo del parque");
        String codigoIdentificacion = sc.nextLine();
        System.out.println("Ingrese el nombre del encargado");
        String codigoEncargado = sc.nextLine();

        parqueController.crearParque(nombre, codigoIdentificacion, codigoEncargado);
    }

    
}
