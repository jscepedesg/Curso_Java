
 import java.util.*;
 /***
  * Demostracion de entrada por scanner, ingresa nombre y edad y le dice que edad tendra en un
  * a�o.
  * @author Sebastian Cespedes Granados
  * @version 1.0.0
  *
  */
public class Entreda {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String a = entrada.nextLine();
		
		System.out.println("Digite su edad");
		
		int b = entrada.nextInt();
		
		System.out.println("Hola"+" "+a+" "+"Tu edad en un a�o sera: "+(b+1)+" "+"a�os");
	
		
		

	}

}
