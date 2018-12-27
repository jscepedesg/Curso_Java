 import javax.swing.*;
 /***
  * Entrada de datos utilizando JOptionPane, dice al edad que tendra en un año.
  * @author Sebastian Cespedes Granados
  * @version 1.0.0
  *
  */
public class Entrada2 {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		String b = JOptionPane.showInputDialog("Introduce tu edad");
		//Se pasa un String a un int
		 int c = Integer.parseInt(b);
		 c++;
		System.out.println("Hola "+a+" en un año tendras  "+(c)+" años");

	}

}
