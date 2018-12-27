package colecciones;

import java.util.HashMap;

public class Prueba_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Empleado> mapa = new HashMap<String,Empleado>();
		
		mapa.put("145", new Empleado("Javier"));
		mapa.put("146", new Empleado("Juan"));
		mapa.put("147", new Empleado("Ana"));
		mapa.put("148", new Empleado("Antonio"));
		System.out.println(mapa);
		mapa.remove("147");
		System.out.println();
		System.out.println(mapa);
		//Iterar con el mapa
		mapa.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
	}

}

class Empleado
{
	private String nom;
	private double suel;
	
	
	public Empleado(String nom)
	{
		this.nom=nom;
		suel=2000;
	}
	
	public String toString()
	{
		return "[Nombre=" + nom +", Sueldo="+suel+"]";
	}
}