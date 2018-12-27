package excepciones;

import javax.swing.JOptionPane;

public class Exepciones4 {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		
		
		String mail = JOptionPane.showInputDialog("Introduce mail");
		try
		{
			setVery(mail);
		}
		catch(LongitudMailError e)
		{
			System.out.println("El email es demasiado corto");
			e.printStackTrace();
		}
		
		
	}
	//Cactura la excepcion
 static void setVery(String mail) throws LongitudMailError
 {
	 int  arroba = 0;
	 boolean punto =false;
	 if(mail.length()<=3)
		{
			//ArrayIndexOutOfBoundsException miexepcion = new  ArrayIndexOutOfBoundsException();
		 //LLama la excepcion
			throw new  LongitudMailError("El mail es demasiado corto");
		}
		else
		{
			
		
		
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

}

//Creanado una excepcion propia 
class LongitudMailError extends Exception
{
	
	public LongitudMailError()
	{
		
	}
	
	public LongitudMailError(String msj)
	{
		super(msj);
	}
}