package poo;

import javax.swing.*;

public class Final {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados("jose");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Jaime");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.setCambiaseccion("RRHH");
		
		
		System.out.println(trabajador1.getDevuelvedatos());
		
		System.out.println(trabajador2.getDevuelvedatos());
		
		System.out.println(trabajador3.getDevuelvedatos());
		
		System.out.println(trabajador4.getDevuelvedatos());
		
		System.out.println(Empleados.getIdsiguiente());

	}

}
 class Empleados{
	 
	 private final String nombre;
	 private String seccion;
	 private int Id;
	 public static int Idsiguiente=1;
	 
	 public Empleados(String nom){
		 
		
		 nombre=nom;
		 seccion="Administración";
		 Id=Idsiguiente;
		 Idsiguiente++;
	 }
	 
	 public void setCambiaseccion(String seccion){
		 
		 this.seccion=seccion;
	 }
	 
	 
	 public String getDevuelvedatos(){
		 
		 
		 
		 return "El nombre es: "+nombre+" y la seccion es: "+seccion+" y Id = "+Id;
	 }
	 
	 public static String getIdsiguiente(){
		 
		 
		 return "El ID siguiente es: "+Idsiguiente;
	 }
 }