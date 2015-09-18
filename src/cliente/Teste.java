package cliente;

import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import ws.CalculadoraServerProxy;

public class Teste {
	public static void main(String[] args) throws AxisFault, RemoteException {
		float subtracao = new CalculadoraServerProxy().multiplicacao(100, 22);
		System.out.println(subtracao);
	}
}
