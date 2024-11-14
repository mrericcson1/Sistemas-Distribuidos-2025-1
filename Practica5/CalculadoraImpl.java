//Implementar la interfaz en el servidor RMI


import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {
    public CalculadoraImpl() throws RemoteException {
        super();
    }

    @Override
    public float sumar(float a, float b) throws RemoteException {
        return a + b;
    }

    @Override
    public float restar(float a, float b) throws RemoteException {
        return a - b;
    }

    @Override
    public float multiplicar(float a, float b) throws RemoteException {
        return a * b;
    }

    @Override
    public float dividir(float a, float b) throws RemoteException {
        if (b == 0) throw new ArithmeticException("División por cero");
        return a / b;
    }
}

