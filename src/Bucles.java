   import javax.swing.*;
/**
 * Ciclo while para determinar cuando la contraseņa ingresada es correcta o incorrecta segun la 
 * contraseņa registrada.
 * 
 * @author Sebastian Cespedes Granados
 * @version 1.0.0
 * 
 * 
 * */
public class Bucles {

	public static void main(String[] args) {
	
		
		String a="";
		a = JOptionPane.showInputDialog("Registra tu contraseņa");
		String b = "";
		//Ciclo while
		while(a.equals(b)== false)
		{
			b = JOptionPane.showInputDialog("Introduce la contraseņa, por favor");
			
			if(a.equals(b)== false)
			{
				System.out.println("Contraseņa incorrecta");
			}
			
		}

		System.out.println("Contraseņa correcta");
	}

}
