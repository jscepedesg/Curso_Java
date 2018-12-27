package colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class Mundo_prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <String> paises = new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
		LinkedList <String> capitales = new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");
		
		ListIterator<String> interA = paises.listIterator();
		ListIterator<String> interB = capitales.listIterator();
		
		while(interB.hasNext())
		{
			if(interA.hasNext())
			{
				interA.next();
			}
			interA.add(interB.next());
		}
		
		System.out.println(paises);
		
		interB=capitales.listIterator();
		
		while(interB.hasNext())
		{
			interB.next();
			if(interB.hasNext())
			{
				interB.next();
				interB.remove();
			}
		}
		
		System.out.println(capitales);
		
		paises.removeAll(capitales);
		
		System.out.println(paises);
	}

}
