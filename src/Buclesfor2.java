  import javax.swing.*;
  
  /***
   * Ciclo for con longitud length, verifica que un correo tenga los requerimientos necesarios.
   * @author Usuario
   * @version 1.0.0
   */
public class Buclesfor2 {

	public static void main(String[] args) {
		
		int  arroba = 0;
		boolean punto =false;
		
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		for(int i=0;i<mail.length();i++)
		{
			if(mail.charAt(i) == '@')
			{
				arroba++;
			}
			if(mail.charAt(i)=='.')
			{
				punto = true;
			}
			
		}
		
		
		if(arroba == 1 && punto == true)
		{
			System.out.println("El email es correcto");
		}
		else
		{
			System.out.println("El email es incorrecto");
		}
	}
	

}
