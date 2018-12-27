/***
 * Se utiliza algunos metodos de la clase math.
 * @author Sebastian Cespedes Granados
 * @version 1.0.0
 *
 */
public class Clasemat {

	public static void main(String[] args) {
		double a=4,b=5,c=9,d,e,f,g;
		int h;
		//Raiz
		d =  Math.sqrt(a);
		//Potencia
		e =  Math.pow(b, 2);
		//Contante PI
		f = d*Math.PI;
		//Numero aleatorio
		g = Math.random()*100;
		//Fundicion de un double a un int
		h=(int) g;
	
		

		System.out.println(d+"    "+e+"     "+f+"     "+g+"   "+h);
	}

}
