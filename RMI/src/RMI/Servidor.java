package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor extends UnicastRemoteObject implements InterfaceServidor {

	protected Servidor() throws RemoteException{
		super();
		
	}
	public String saludo(String nombre)throws RemoteException{
		return "Hola"+nombre;
	}
	
	public static void main(String[] args) {
		try{
			LocateRegistry.createRegistry(1099);
			Servidor obj = new Servidor();
			Naming.rebind("//localhost/ObjetoHola", obj);
			
		}catch(RemoteException | MalformedURLException e){
			System.out.println("error en el servidor");
			e.printStackTrace();
		}
		System.out.println("Objeto hola registrado");
		

	}

}
