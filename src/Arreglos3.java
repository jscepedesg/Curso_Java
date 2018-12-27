import javax.swing.*;

/**
 * Guarda y imprime numeros aleatorios que son guardados en uns array.
 * 
 * @author Sebastian Cespedes Granados
 * @version 1.0.0
 * 
 * */
public class Arreglos3 {

	public static void main(String[] args) {
		 int a = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));
		 int b = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
		
		int vec[][] = new int[a][b]; 
		
		for(int i = 0;i<a;i++)
		{
			for(int j = 0;j<b;j++)
			{
				vec[i][j] = (int)Math.round(Math.random()*100);
			}
		}
		
		for(int i = 0;i<a;i++)
		{
			for(int j = 0;j<b;j++)
			{
				System.out.print(vec[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}

}
