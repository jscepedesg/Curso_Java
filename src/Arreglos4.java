/**
 * Matriz con for que modifica y opera su contenido.
 * 
 * @author Sebastian Cespedes
 * @version 1.0.0
 * 
 * */
public class Arreglos4 {

	public static void main(String[] args) {
		
		double acumulado;
		double interes = 0.6;
		double saldo[][] = new double [6][5];
		for(int i = 0;i<6;i++)
		{
			saldo[i][0]=10000;
			acumulado = 10000;
			
			for(int j = 0;j<5;j++)
			{
				acumulado =acumulado+(acumulado*interes);
				
				saldo[i][j] = acumulado;
			}
			
			interes = interes+0.01;
		}
		for(int i = 0;i<6;i++)
		{
			System.out.println();
			for(int j = 0;j<5;j++)
			{
				System.out.print(saldo[i][j]);
				System.out.print("           ");
			}
		}
		
		

	}

}
