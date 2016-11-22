

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServidor extends Remote {
	String saludo (String nombre) throws RemoteException;
	

}
