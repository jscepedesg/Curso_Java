  import java.util.*;
  import javax.swing.*;

/**
 * Calcula el area de unas figuras geometricas en especifico, utilizando condicionales 
 * Switch,Scanner, JOptionPane.
 * 
 * @author Sebastian Cespedes Granados
 * @version 1.0.0
 * 
 * */  
public class Areas {

	public static void main(String[] args) {
		
		//Lectura Scanner
        //Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escoja la opcion que desea consultar: \n1:Cuadrado \n2:Rectangulo \n3:Triangulo"
				+ "\n4:Circulo");
		//lectura JOptionPane
		String a = JOptionPane.showInputDialog("Digite el numero de la opcion que desea");
		int l = Integer.parseInt(a);
		switch(l)
		{
		
		case 1:
			
			String b = JOptionPane.showInputDialog("Digite el lado");
			double c = Double.parseDouble(b);
			c = c*c;
			
			System.out.println("El area es: "+c);
			
			break;
			
		case 2:
			String d = JOptionPane.showInputDialog("Introdusca la altura");
			double e = Double.parseDouble(d);
			
			String f = JOptionPane.showInputDialog("Introdusca la base");
			double g = Double.parseDouble(f);
		     g = g*e;
		     
		     System.out.println("El area es: "+ g);
			
		     break;
		     
		case 3:
			
			String h = JOptionPane.showInputDialog("Introdusca la altura");
			double i = Double.parseDouble(h);
			
			String j = JOptionPane.showInputDialog("Introdusca la base");
			double q = Double.parseDouble(j);
		     q = (q*i)/2;
		     
		     System.out.println("El area es: "+ q);
		     
		     break;
			
		case 4:
			String radio = JOptionPane.showInputDialog("Introdusca el radio");
			double radio1 = Double.parseDouble(radio);
			radio1 = Math.PI*(Math.pow(radio1, 2));
			
			System.out.println("El area es: "+ radio1);
			break;
			default:
				System.out.println("Opcion incorrecta");	
		}
	

	}

}
