

import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String mensaje="";
		String nombre;
		try{
			System.out.println("Introduce tu nombre: ");
			nombre=sc.nextLine();
			InterfaceServidor obj=(InterfaceServidor) Naming.lookup("//localhost/ObjetoHola");
			mensaje=obj.saludo(nombre);
			System.out.println(mensaje);
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		

	}

}
