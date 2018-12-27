/**
 * Imprime asignacion de una serie de matrices, con un ciclo for. Muestra dos maneras de crear
 * matrices o arreglos.
 * 
 * @author Sebastian Cespedes Granados
 * @version 1.0.0
 * 
 * */
public class Arreglos {

	public static void main(String[] args) {
		//Declaracion de matrices mas comunes..
		int vec[] = new int [5];
		vec[0] = 5;
		vec[1] = 4;
		vec[2] = 3;
		vec[3] = 7;
		vec[4] = 9;
		//Declaracion de matrices especiales
		int vec1[] = {6,8,1,3,10};
		//Ciclo que imprime el contenido de las matrices
		  for(int i = 0; i<vec.length;i++)
		  {
			  System.out.print("vector 1: "+i+" "+vec1[i]+"     ");
			  System.out.println("vectro 2: "+vec[i]);
			
		  }
		
		

	}

}
