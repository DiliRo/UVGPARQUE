package view;

import controller.EncargadoController;
import controller.ParqueController;
import java.util.Scanner;
public class MenuView {
    Scanner sc = new Scanner(System.in);
        
    ParqueController parqueController = new ParqueController();
    ParqueView parqueView = new ParqueView(parqueController);
    PuntoAccesoView puntoAccesoView = new PuntoAccesoView(parqueController);
    EncargadoController encargadoController = new EncargadoController();
    VisitanteView visitanteView = new VisitanteView();




    public void Menu(){
        int opcion = 0;
        parqueView.crearParque();
        do{
        System.out.println("----------------------- UVGPARQUE -----------");
        System.out.println("Opcion 1: Nuevo parque");
        System.out.println("Opcion 2: Habilitar un punto de acceso");
        System.out.println("Opcion 3: Consultar puntos de acceso");
        System.out.println("Opcion 4: Consultar un punto de acceso");
        System.out.println("Opcion 5: Modificar un punto de acceso");
        System.out.println("Opcion 6: Cerrar un punto de acceso");
        System.out.println("Opcion 7: Registrar un visitante ");
        System.out.println("Opcion 8: Consultar visitantes");
        System.out.println("Opcion 9: Buscar visitante");
        System.out.println("Opcion 10: Modificar visitante");
        System.out.println("Opcion 11: Eliminar visitante");
        System.out.println("Opcion 12: Mostrar reporte del parque");
        System.out.println("Opcion 13: Salir");
        opcion = sc.nextInt();

        
            switch(opcion){
                case 1:
                    parqueView.crearParque();
                    break;
                case 2:
                    puntoAccesoView.crearPuntoAcceso();
                    break;
                case 3:
                    puntoAccesoView.buscarPuntoAcceso();
                    break;
                case 4:
                    puntoAccesoView.buscarPunto();
                    break;
                case 5:
                    puntoAccesoView.modificarPuntoAcceso();
                    break;
                case 6:
                    puntoAccesoView.eliminarPuntoAcceso();
                    break;     
                case 7:
                    visitanteView.crearVisitante();
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        }while(opcion != 13);
    }
}
