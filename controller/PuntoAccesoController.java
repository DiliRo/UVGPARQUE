package controller;

import model.PuntoAcceso;
public class PuntoAccesoController {
    private ParqueController parqueController;
    private PuntoAcceso puntoAcceso;

     

    public boolean agregarPuntoAcceso(PuntoAcceso[] puntos, int posicion, String codigo, String nombre, String ubicacion, int capacidadMaximaHora) {
        try {
            if (posicion < 0 || posicion > 5) {
                throw new ArrayIndexOutOfBoundsException("La posición debe estar entre 1 y 5");
            }

            if (puntos[posicion] != null) {
                return false;
            }

            puntoAcceso = new PuntoAcceso(codigo, nombre, ubicacion, capacidadMaximaHora);
            
            if (puntoAcceso.getCapacidadMaximaHora() <= 0) {
                throw new IllegalArgumentException("La capacidad debe ser mayor que 0.");
            }

            puntos[posicion] = puntoAcceso;
            return true;
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Error: La posición debe estar entre 1 y 5");
            return false;
        }
    }

    public PuntoAcceso buscarPorPosicion(PuntoAcceso[] puntos, int posicion) {
        try {
            return puntos[posicion];
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    public boolean actualizarPuntoAcceso(PuntoAcceso[] puntos, int posicion, int nuevaCapacidad, boolean nuevoEstado) {
        try {
            if (puntos[posicion] == null) {
                return false;
            }
            if (nuevaCapacidad <= 0) {
                throw new IllegalArgumentException("La capacidad debe ser mayor que 0.");
            }
            puntos[posicion].setCapacidadMaximaHora(nuevaCapacidad);
            puntos[posicion].setEstado(nuevoEstado);
            return true;
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            return false;
        }
    }

    public String eliminarPuntoAcceso(PuntoAcceso[] puntos, int posicion) {
        try {
            if (puntos[posicion] == null) {
                return "No hay un punto de acceso en esa posición.";
            }
            puntos[posicion] = null;
            return "Se cerró correctamente.";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Posición inválida.";
        }
    }

    public int contarHabilitados(PuntoAcceso[] puntos) {
        int contador = 0;
        for (PuntoAcceso p : puntos) {
            if (p != null) {
                contador++;
            }
        }
        return contador;
    }

    public int contarDisponibles(PuntoAcceso[] puntos) {
        return puntos.length - contarHabilitados(puntos);
    }

    public PuntoAcceso obtenerMayorCapacidad(PuntoAcceso[] puntos) {
        PuntoAcceso mayor = null;
        for (PuntoAcceso p : puntos) {
            if (p != null && (mayor == null || p.getCapacidadMaximaHora() > mayor.getCapacidadMaximaHora())) {
                mayor = p;
            }
        }
        return mayor;
    }


    
}