package programacion_generica;
//Clase generica 
public class Creacion_classGene<T> {
	
	private T primero;
	
	public Creacion_classGene()
	{
		primero=null;
	}

	public void setPrimero(T nuevo_V)
	{
		primero=nuevo_V;
	}
	
	public T getPrimero()
	{
		return primero;
	}
}
