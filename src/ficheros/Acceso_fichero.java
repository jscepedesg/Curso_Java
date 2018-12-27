package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_fichero accediendo = new Leer_fichero();
		accediendo.lee();
	}

}
class Leer_fichero 
{
	public void lee()
	{
		try {
			
			FileReader entrada = new FileReader("C:/Users/Usuario/Desktop/hola.txt");
			BufferedReader mibuffer = new BufferedReader(entrada);
			
			String linea="";
			
			
			while(linea!= null)
			{
				linea=mibuffer.readLine();
				if(linea!=null)
				{
					System.out.println(linea);
				}
				
			}
			
			entrada.close();
		}catch (IOException e) 
		{
			System.out.println("No se ha encontrado el archivo");	
		}
	}
}
