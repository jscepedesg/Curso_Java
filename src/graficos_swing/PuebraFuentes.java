package graficos_swing;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class PuebraFuentes {

	public static void main(String[] args) {
		
		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		boolean estalafuente=false;
		
		//Almacenar todas las fuentes de mis ordenador
		String [] nombresdefuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for(String nombrelafuente: nombresdefuentes){
			
			if(nombrelafuente.equals(fuente)){
				
				estalafuente=true;
				
			}
		}
		
		if(estalafuente){
			System.out.println("Fuente instalada");
			
		}
		else{
			
			System.out.println("No esta la fuente instalada");
		}
	}

}
