 import javax.swing.*;
 
 /**
  * Calcula la raiz de un numero, utilzando JOptionpane, Utiliza casting y metodos de la clase
  * Math.
  * @author Sebasian Cespedes
  * @version 1.0.0
  * */
public class Raizdeunnumero {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Digite primer numero");
		
		double c = Double.parseDouble(a);
		
		 c = Math.sqrt(c);
		 
		  System.out.print("La raiz de: "+a+" es:");
		  System.out.print(c);
		

	}

}
