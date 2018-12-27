  import java.util.*;
  
  /**
   * Demostracion de ciclo do while, se guarda un numero aleatorio de 1 a 100 y se tiene que 
   * adivinar cual es.
   * @author Sebastian Cespedes Granados
   * @version 1.0.0
   * 
   * */
public class Bucles2 {

	public static void main(String[] args) {
		
		int aleratorio = (int)(Math.random()*100);
		Scanner entrada = new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		 System.out.println("Introduce un numero por favor, del 1 al 100");
		do{
			 intentos++;
			
			 numero=entrada.nextInt();
			 if(aleratorio<numero)
			 {
				 System.out.println("Es mas bajo");
			 }
			 else if(aleratorio>numero)
			 {
				 System.out.println("Es mas alto");
			 }
		   }while(numero!=aleratorio);
		
		System.out.println("Correcto. Lo has conseguido "+intentos+" intentos");

	}

}
