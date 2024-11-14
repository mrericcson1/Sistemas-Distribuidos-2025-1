//Crear el servidor RMI

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorCalculadora {
    public static void main(String[] args) {
        try {
	    System.setProperty("java.rmi.server.hostname", "10.86.15.243");

            // Crear instancia del servicio
            Calculadora calculadora = new CalculadoraImpl();

            // Iniciar el registro RMI en el puerto 1099
            LocateRegistry.createRegistry(1099);
	    Naming.rebind("Calculadora", calculadora);

            System.out.println("Servidor RMI de Calculadora listo y esperando...");
        } catch (Exception e) {
            System.err.println("Error en el servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
