package excepciones;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exepciones3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¿Que deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner leer = new Scanner(System.in);
		int decision=leer.nextInt();
		if(decision==1)
		{
			try
			{
				pedirdatos();
			}
			catch(Exception e)
			{
				System.out.println("Los datos introducidos son incorrectos");
				//System.out.println("Vuelve a intentarlo");
				//try
				//{
					//pedirdatos();
				//}
				//catch(InputMismatchException i)
				//{
					//System.out.println("Los datos introducidos son incorrectos");
					//System.out.println("Intentalo mas tarde");
				//}
			}
		}
		else
		{
			System.out.print("Adios");
			System.exit(0);
		}
		
	}
	
	public static void pedirdatos() throws IOException
	{
		//try
		//{
			Scanner leer = new Scanner(System.in);
			System.out.println("1. Introduce el nombre, por favor");
			String nombre = leer.nextLine();
			System.out.println("1. Introduce edad, por favor");
			int edad=leer.nextInt();
			System.out.println("Hola "+nombre+" El proximo año tendras: "+(edad+1)+" Años.");
			leer.close();
		//}
		//catch(Exception e)
		//{
			//System.out.println("Los datos introducidos son incorrectos");
		//}
		
		System.out.println("Terminamos");
	}

}
