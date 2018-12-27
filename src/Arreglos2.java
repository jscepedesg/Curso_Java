import javax.swing.*;
/**
 * Imprime el nombre de 8 paises guardados en una array con un for normal y un for especial
 * 
 * @author Sebastian Cespedes Granados
 * @version 1.0.0
 * */

public class Arreglos2 {

	public static void main(String[] args) {
		//Declaracion de array 
		String paises[] = new String[8];
		int contador = 0;
		//For normal 
		for(int i = 0;i<paises.length;i++)
		{
			paises[i] = JOptionPane.showInputDialog("Introduce país"+" "+(i+1));
		}
		//For especial para arrays
		for(String a:paises)
		{
			contador++;
			System.out.println(contador+" "+a);
		}

	}

}
