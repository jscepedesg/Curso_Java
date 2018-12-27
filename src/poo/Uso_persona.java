package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] laspersonas= new Persona[2];
		
		laspersonas[0]=new Empleado5("luis",50000,2009,02,25);
		laspersonas[1]=new Alumno("Sebastian","sistemas");
		
		for(Persona p: laspersonas){
			
			System.out.println(p.getDame_nombre()+" ,"+p.getDame_descripcion());
		}
	}
	
}

 abstract class Persona{
	 
	 private String nombre;
	 public Persona(String nom){
		 
		 nombre=nom;
		 
	 }
	 public String getDame_nombre(){
		 
		 
		 return nombre;
	 }
	 
	 public abstract String getDame_descripcion();
	 
 }

class Empleado5 extends Persona{
	
    public Empleado5(String nom,double sue,int año,int mes,int dia){
    	
    	super(nom);
    	
    	sueldo=sue;
    	GregorianCalendar calendario = new GregorianCalendar(año,mes-1,dia);
    	altacontrato = calendario.getTime();
    }
    
    public String getDame_descripcion(){
    	
    	return "Este empleado tien un suledo: "+sueldo;
    }

    
    public double dameSueldo(){//getter
    	
    	return sueldo;
    }
    
    public Date dameFechaContrato(){//getter
    	
    	return altacontrato;
    }
    
    public void subeSueldo(double porcentaje){//setter
    	
    	double aumento=sueldo*porcentaje/100;
    	sueldo+= aumento;
    }
    
    private double sueldo;
    private Date altacontrato;
}

class Alumno extends Persona{
	
	private String carrera;
	public Alumno(String nom,String car){
		
		super(nom);
		
		carrera=car;
		
	}
	
	public String getDame_descripcion(){
		
		
		return "Este alumno esta estudiando la carrera de: "+carrera;
		
	}
	
	
	
}