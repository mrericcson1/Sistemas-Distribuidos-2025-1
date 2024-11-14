//Crear el cliente RMI

import java.rmi.Naming;
import java.util.Scanner;

public class ClienteCalculadora {
    public static void main(String[] args) {
        try {
	    Calculadora calculadora = (Calculadora) Naming.lookup("rmi://10.86.15.243/Calculadora");
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Introduce el primer número:");
	    float num1 = scanner.nextFloat();

	    System.out.println("Introduce el segundo número:");
	    float num2 = scanner.nextFloat();

	    System.out.println("Elige una operación: suma, resta, multipliacion, division");
	    String operacion = scanner.next().toLowerCase();

	    float resultado = 0;
	    switch (operacion) {
	    	case "suma":
		    resultado = calculadora.sumar(num1, num2);
		    break;
		case "resta":
		    resultado = calculadora.restar(num1, num2);
		    break;
		case "multiplicacion":
		    resultado = calculadora.multiplicar(num1, num2);
		    break;
		case "division": 
		    if (num2 != 0) {
		    resultado = calculadora.dividir(num1, num2);
		    } else {
			System.out.println("Error: Division por cero");
			return;
		    }
		    break;
		default:
		    System.out.println("Operacion no valida");
		    return;
		}

		System.out.println("Resultado: " + resultado);
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}















