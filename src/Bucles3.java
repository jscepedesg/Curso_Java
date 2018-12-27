  import javax.swing.*;
  
  /***
   * Demostracion ciclo do while, determina el peso corporal apropiado segun la estatura.
   * 
   * @author Sebastian Cespedes Granados
   * @version 1.0.0
   */
public class Bucles3 {

	public static void main(String[] args) {
		
       String genero ="";
		
		do
		{
			genero =JOptionPane.showInputDialog("Introduce tu genero (H/M)");
			
			
			

		}while(genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M") == false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu al tura en cm"));
		
		int pesoideal =0;
		if(genero.equalsIgnoreCase("H"))
		{
			pesoideal = altura-110;
		}
		else if(genero.equalsIgnoreCase("M"))
		{
			
			pesoideal= altura-120;
			
		}
		
		System.out.println("Tu peso ideal es: "+pesoideal+" Kg");
	}

}
