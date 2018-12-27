package excepciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Excepciones6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1:Cuadrado\n2:Rectangulo\n3:Triangulo\n4:Circulo");
		
		try
		{
			int h = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			//entrada.close();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error!!");
		}
		//Se ejecuta siempre sin importar la excepcion
		finally
		{
			entrada.close();
			System.out.println("Adios");
		}
	}

}
