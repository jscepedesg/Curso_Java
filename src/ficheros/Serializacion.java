package ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administrador jefe = new Administrador("Juan",8000000,2015,12,15);
		jefe.setIncetivo(500000);
		Empleado[] personal= new Empleado[4];
		personal[0]=jefe;
		personal[1]=new Empleado("Ana",1000000,2016,6,23);
		personal[2]=new Empleado("Luis",1500000,2015,9,13);
		personal[3]=new Empleado("Sebastian",1800000,2008,6,20);
		
		try
		{
			//Guardando Objecto en bytes, abriendo flujo de archivos
			ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/Users/Usuario/Desktop/empleado.dat"));
			escribiendo_fichero.writeObject(personal);
			escribiendo_fichero.close();
			
			//Recibe objecto guardado en bytes en disco duro
			ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C:/Users/Usuario/Desktop/empleado.dat"));
			Empleado[] personalrecuperado= (Empleado[])recuperando_fichero.readObject();
			recuperando_fichero.close();
			
			for(Empleado e: personalrecuperado)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
		
	}

}
class Empleado implements Serializable
{
	/**
	 * 
	 *///Constante de Serializacion para actualizar sin error
	private static final long serialVersionUID = 1L;
	String nombre;
	double sueldos;
	Date fecha_contrato;
	public Empleado(String n,double s,int año,int mes, int dia)
	{
		nombre=n;
		sueldos=s;
		GregorianCalendar calendario = new GregorianCalendar(año,mes-1,dia);
		fecha_contrato=calendario.getTime();
	}
	public String getNombre() {
		return nombre;
	}
	public double getSueldos() {
		return sueldos;
	}
	public Date getFecha_contrato() {
		return fecha_contrato;
	}
	public void setSubirsueldo(double porcentaje)
	{
		double aumento=sueldos*porcentaje/100;
		sueldos+=aumento;
	}
	public String toString()
	{
		return "Nombre: "+nombre+",Sueldo: "+sueldos+", Fecha de contratacion: "+fecha_contrato;
	}
}
class Administrador extends Empleado
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double incetivo;
	public  Administrador(String nom,double suel,int año,int mes,int dia)
	{
		super(nom,suel,año,mes,dia);
		incetivo=0;
	}
	
	public double getSueldo()
	{
		double sueldobase=super.getSueldos();
		return sueldobase+incetivo;
	}
	public void setIncetivo(double b)
	{
		incetivo=b;
	}
	public String toString()
	{
		return super.toString()+" Incetivo: "+incetivo;
	}
}
