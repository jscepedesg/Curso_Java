package excepciones;

import javax.swing.JOptionPane;

public class Exepcion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vec[] = new int[5];
		
		for(int i=0;i<=vec.length;i++)
		{
			vec[i]=i;
		}
		
		String nombre= JOptionPane.showInputDialog("Digite su nombre: ");
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
		
		System.out.println("Hola "+nombre+" Tu edad es: "+edad+", Fin de la ejecución del programa");
	}

}
