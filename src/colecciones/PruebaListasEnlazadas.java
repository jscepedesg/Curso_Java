package colecciones;

import java.util.LinkedList;

public class PruebaListasEnlazadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <String> personas = new LinkedList<String>();
		
		personas.add("Jorge");
		personas.add("Jose");
		personas.add("Alvaro");
		personas.add("Daniela");
		
		System.out.println(personas.size());
		
		for (String string : personas) {
			
			System.out.println(string);
		}
	}

}
