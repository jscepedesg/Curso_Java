package programacion_generica;

import java.util.*;
public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Producto fac[] = new Producto[5];
		fac[0]= new Producto(1,2000,"Sopas");
		fac[1]= new Producto(2,3000,"Suntea");
		fac[2]= new Producto(3,1000,"Popetas");
		fac[3]= new Producto(4,600,"Vivi 100");
		fac[4]= new Producto(5,10000,"Savital");*/
		
		//Creacio de arraList
		ArrayList <Producto> listaProducto = new ArrayList <Producto>();
		//Crea anticipadamente el tamaño para evitar la copia y mejor la optimizacion
		listaProducto.ensureCapacity(12);
		//Agrega datos en la array list
		listaProducto.add(new Producto(1,2000,"Sopas"));
		listaProducto.add(new Producto(2,3000,"Suntea"));
		listaProducto.add(new Producto(3,1000,"Popetas"));
		listaProducto.add(new Producto(4,600,"Vivi 100"));
		listaProducto.add(new Producto(5,10000,"Savital"));
		listaProducto.add(new Producto(6,5000,"Quipitos"));
		listaProducto.add(new Producto(1,2000,"Sopas"));
		listaProducto.add(new Producto(2,3000,"Suntea"));
		listaProducto.add(new Producto(3,1000,"Popetas"));
		listaProducto.add(new Producto(4,600,"Vivi 100"));
		//Le da la ubicacion 
		listaProducto.add(2,new Producto(5,10000,"Savital"));
		//Escoger el lugar donde se va ubicar y lo remplaza 
		listaProducto.set(1,new Producto(12,5000,"Quipitos"));
		//Imprime el tamaño del arraylist
		System.out.println(listaProducto.size());
		//Elimina un elemento del arraylist
		listaProducto.remove(0);
		
		//Iterador
		Iterator <Producto> mi_iterador= listaProducto.iterator();
		//Recore la array list
		while(mi_iterador.hasNext())
		{
			System.out.println(mi_iterador.next().getNom());
		}
	/*for (Producto producto : listaProducto) 
		{
			System.out.println("Id: "+producto.getId()+" Nombre: "+producto.getNom()+" Precio: "+producto.getPrecio());
		}
		
		System.out.println();
		//Me muetra un objecto en una pocion especifica 
		System.out.println(listaProducto.get(3).getNom());*/

	}
}

 class Producto 
{
	int id;
	double precio;
	String nom;
	
	Producto(int id,double precio,String nom)
	{
		this.id=id;
		this.precio=precio;
		this.nom=nom;
	}

	public int getId() {
		return id;
	}

	public double getPrecio() {
		return precio;
	}

	public String getNom() {
		return nom;
	}
	
	
	
}