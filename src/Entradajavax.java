   import javax.swing.*;
   /***
    * Entrada de datos JOptionPane, saca la raiz de un numero.
    * @author Sebastian Cespedes Granados
    * @version 1.0.0
    *
    */
public class Entradajavax {

	public static void main(String[] args) {
		
        String a= JOptionPane.showInputDialog("Escriba el Digito");
		
		double b = Double.parseDouble(a);
		
		System.out.println("La raiz del numero es: "+(Math.sqrt(b)));

	}

}
