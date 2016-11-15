package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servidor extends UnicastRemoteObject implements InterfaceServidor {

	protected Servidor() throws RemoteException{
		return "Hola"+nombre;
	}
	
	public static void main(String[] args) {
		try{
			Servidor obj = new Servidor();
			Naming.rebind("rmi://localhost", obj);
			
		}catch(RemoteException | MalformedURLException e){
			System.out.println("error en el servidor");
			e.printStackTrace();
		}
		System.out.println("Objeto hola registrado");
		

	}

}
