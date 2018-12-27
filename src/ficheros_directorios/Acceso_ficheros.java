package ficheros_directorios;

import java.io.File;

public class Acceso_ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instancia la clase file y le pasa por parametros la ubicacion del archivo
		//Asegura la compatibilidad en cualquier sistema operativo
		File archivo = new File("C:"+File.separator+"Users"+File.separator+"Usuario"+File.separator+"Desktop"+File.separator+"Renovacion 2018-1");
		// Imprime la ruta de la carpeta
		System.out.println(archivo.getAbsolutePath());
		// Guarda en un Vector String la lista de elementos que hay en la ruta
		String nombre[] = archivo.list();

		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);
			// Examina subcarpetas y su contenido
			File f = new File(archivo.getAbsoluteFile(), nombre[i]);

			if (f.isDirectory()) {
				String nom[] = f.list();
				for (int j = 0; j < nom.length; j++) {
					System.out.println(nom[j]);
				}
			}
		}

	}

}
