  import javax.swing.*;
  
  /***
   * Demostracion Condicional if, Ingresa la edad y dice si es mayor o menor de edad.
   * @author Sebastian Cespedes Granados
   * @version 1.0.0
   *
   */
public class Condicional {

	public static void main(String[] args) {
		
		String edad;
		int edad2;
		edad = JOptionPane.showInputDialog("Digite su edad");
		edad2 =  Integer.parseInt(edad);
		
		
		if(edad2<0||edad2>150)
		{
			System.out.println("Digito incorrecto o sobre pasa el estandar elegido");
		}
		else
		{
			if(edad2>=18)
			{
				System.out.println("Eres mayor de edad");
			}
			else
			{
				System.out.println("Eres menor de edad");
			}
			
		}

	}

}
