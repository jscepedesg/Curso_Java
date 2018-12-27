package colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class Prueba_tree {

	public static void main(String[] args) {

		
		/*TreeSet<String> ordena_perso = new TreeSet<String>();
		
		ordena_perso.add("Sandra");
		ordena_perso.add("Amanda");
		ordena_perso.add("Diana");
		
		for (String string : ordena_perso) {
			
			System.out.println(string);
		}
		*/
		
		Articulo pri = new Articulo(1,"Jabón");
		Articulo seg = new Articulo(2,"Aromatel");
		Articulo ter = new Articulo(3,"Bio");
		
		TreeSet<Articulo> ordena_perso = new TreeSet<Articulo>();
		
		ordena_perso.add(ter);
		ordena_perso.add(seg);
		ordena_perso.add(pri);
		
		
		for (Articulo string : ordena_perso) 
			{
				System.out.println(string.getDesc());
			}
		System.out.println();
		
		Articulo comparador_art = new Articulo();
		TreeSet<Articulo> ordena_perso2 = new TreeSet<Articulo>(comparador_art);
		ordena_perso2.add(pri);
		ordena_perso2.add(seg);
		ordena_perso2.add(ter);
		
		for (Articulo articulo : ordena_perso2) 
		{
			System.out.println(articulo.getDesc());
		}
	}
	
	
	
}

class Articulo implements Comparable<Articulo>,Comparator<Articulo>
{

	private int num;
	private String desc;
	
	public Articulo()
	{
		
	}
	
	public Articulo(int num,String desc)
	{
		this.num=num;
		this.desc=desc;
		
	}
	
	public int getNum() {
		return num;
	}


	public String getDesc() {
		return desc;
	}


	public int compareTo(Articulo e) 
	{
		
		return num - e.num;
	}

	public int compare(Articulo e1, Articulo e2) {
		// TODO Auto-generated method stub
		String descripcionA=e1.getDesc();
		String descripcionb=e2.getDesc();
		
		return descripcionA.compareTo(descripcionb);
	}
	
}
