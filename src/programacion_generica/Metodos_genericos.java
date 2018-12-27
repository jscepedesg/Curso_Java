package programacion_generica;

public class Metodos_genericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombres[]={"jose","David","Sebastian"};
		String elementos =Mismatrices.<String>getElementos(nombres);
		System.out.println(elementos);
	}
	

}

class Mismatrices
{
	public static <T> String getElementos(T array[])
	{
		return "El array tiene: "+array.length+" elementos.";
	}
}