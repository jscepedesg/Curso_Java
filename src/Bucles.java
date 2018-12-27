   import javax.swing.*;
/**
 * Ciclo while para determinar cuando la contrase�a ingresada es correcta o incorrecta segun la 
 * contrase�a registrada.
 * 
 * @author Sebastian Cespedes Granados
 * @version 1.0.0
 * 
 * 
 * */
public class Bucles {

	public static void main(String[] args) {
	
		
		String a="";
		a = JOptionPane.showInputDialog("Registra tu contrase�a");
		String b = "";
		//Ciclo while
		while(a.equals(b)== false)
		{
			b = JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if(a.equals(b)== false)
			{
				System.out.println("Contrase�a incorrecta");
			}
			
		}

		System.out.println("Contrase�a correcta");
	}

}
