package ficheros_directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = new File("C:" + File.separator + "Users" + File.separator + "Usuario" + File.separator
				+ "Desktop" + File.separator + "Renovacion 2018-1" + File.separator + "oo");
		
		archivo.delete();
	}

}
