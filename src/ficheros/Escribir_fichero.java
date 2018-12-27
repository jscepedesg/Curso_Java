package ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir_fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escribiendo es = new Escribiendo();
		es.escribir();
	}

}
class Escribiendo
{
	public void escribir()
	{
		String frase="Esto es una prueba de escritura 3";
		try {
			FileWriter escritura = new FileWriter("C:/Users/Usuario/Desktop/nuevo.txt");
			
			for(int i = 0;i<frase.length();i++)
			{
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
