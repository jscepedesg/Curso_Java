package ficheros_directorios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instancia la clase file y le pasa por parametros la ubicacion del
		// archivo
		// Asegura la compatibilidad en cualquier sistema operativo
		File archivo = new File("C:" + File.separator + "Users" + File.separator + "Usuario" + File.separator
				+ "Desktop" + File.separator + "Renovacion 2018-1" + File.separator + "Nuevotex.txt");
		//Crea un directorio
		//archivo.mkdir();
		
		String archivo_destino=archivo.getAbsolutePath();
		//Crea un Achivo
		/*try {
			archivo.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Escribiendo accede = new Escribiendo();
		accede.setEscribir(archivo_destino);
	}

}

class Escribiendo
{
	
	public void setEscribir(String ruta)
	{
		String frase="esto es un ejemplo";
		
		try{
				FileWriter escritura= new FileWriter(ruta);
				for (int i = 0; i < frase.length(); i++)
				{
					escritura.write(frase.charAt(i));
				}
				escritura.close();
			}catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}
