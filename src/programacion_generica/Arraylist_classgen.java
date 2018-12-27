package programacion_generica;

public class Arraylist_classgen {

	private Object[] elementos;
	private int i=0;
	public Arraylist_classgen(int z)
	{
		elementos=new Object[z];
	}
	
	public Object get(int i)
	{
		return elementos[i];
	}
	
	public void add(Object o)
	{
		elementos[i]=o;
		i++;
	}
}
