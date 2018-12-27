package excepciones;

import javax.swing.JOptionPane;

public class Excepciones5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Captura varias excepciones
		try
		{
			setDivicion();
		}
		catch(NumberFormatException e)
		{
			System.out.println("No estas dividiendo por un numero");
			//Especifica mas sobre el erro
			System.out.println(e.getMessage());
			System.out.println("Se a generado un error de esta tipo. "+e.getClass().getName());
		}
		catch(ArithmeticException e)
		{
			System.out.println("La divicion por cero no esta permitida");
		}
		
	}

	static void setDivicion()
	{
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer valor"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo valor"));
		
		System.out.println("El resultado es:"+(num1/num2));
	}
}
