package ficheros_directorios;

import java.io.File;

public class Prueba_rutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instancia la clase file y le pasa por parametros la ubicacion del
		// archivo
		File archivo = new File("bin");
		// Imprime la ruta del archivo
		System.out.println(archivo.getAbsolutePath());
		// Mira si el archivo existe
		System.out.println(archivo.exists());
	}

}
