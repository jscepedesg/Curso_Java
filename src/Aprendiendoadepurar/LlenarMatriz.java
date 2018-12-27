package Aprendiendoadepurar;

import javax.swing.JOptionPane;

public class LlenarMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la matriz"));
		int vec[] = new int[elementos];
		
		for(int i =0;i<vec.length;i++)
		{
			vec[i]=(int)(Math.random()*100);
		}
		
		/*for(int i=0;i<vec.length;i++)
		{
			System.out.println(vec[i]);
		}*/
		
		for(int e: vec)
		{
			System.out.println(vec[e]);
		}
	}

}
