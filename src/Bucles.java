   import javax.swing.*;
/**
 * Ciclo while para determinar cuando la contraseña ingresada es correcta o incorrecta segun la 
 * contraseña registrada.
 * 
 * @author Sebastian Cespedes Granados
 * @version 1.0.0
 * 
 * 
 * */
public class Bucles {

	public static void main(String[] args) {
	
		
		String a="";
		a = JOptionPane.showInputDialog("Registra tu contraseña");
		String b = "";
		//Ciclo while
		while(a.equals(b)== false)
		{
			b = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if(a.equals(b)== false)
			{
				System.out.println("Contraseña incorrecta");
			}
			
		}

		System.out.println("Contraseña correcta");
	}

}
