package ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escritura_byte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int con=0;
		int datos[] = new int[31302];
			try
			{
				FileInputStream archivolectura = new FileInputStream("C:/Users/Usuario/Desktop/PROBLEMA DE LA RUTA AMS CORTA.xlsx");
				
				boolean final_fal = false;
				
				while(!final_fal)
				{
					int byte_entrada =archivolectura.read();
					System.out.println(byte_entrada);
					if(byte_entrada!=-1)
					{
						
						datos[con]=byte_entrada;
					}
					else
					{
						final_fal=true;
					}
					System.out.print(datos[con]);
					con++;
					
				}
				
				archivolectura.close();
			}
			catch(IOException e)
			{
				System.out.println("Error al acceder a la imagen");
			}
			
			System.out.println("Numero de byte "+con);
			
			setCrearFichero(datos);
	}
	
	public static void setCrearFichero(int a[])
	{
		try
		{
			FileOutputStream nuevo = new FileOutputStream("C:/Users/Usuario/Desktop/copia.xlsx");
			
			for(int i=0;i<a.length;i++)
			{
				nuevo.write(a[i]);
				if(i==a.length-1)
				{
					System.out.println(i+"h");
				}
				
			}
			nuevo.close();
		}
		catch(IOException d)
		{
			System.out.println("Error al crear el archivo");
		}
	}
}
