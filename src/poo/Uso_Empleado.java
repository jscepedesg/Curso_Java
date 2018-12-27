package poo;

import java.util.*;
import javax.swing.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String nombre1 = JOptionPane.showInputDialog("Dijite nombre del empleado");
		int sueldo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el suledo"));
		int añofecha = Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
		int mesfecha = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
		int diafecha = Integer.parseInt(JOptionPane.showInputDialog("Digite el día"));
		
		String nombre2 = JOptionPane.showInputDialog("Dijite nombre del empleado");
		int sueldo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el suledo"));
		int añofecha2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
		int mesfecha2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
		int diafecha2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el día"));
		
		String nombre3 = JOptionPane.showInputDialog("Dijite nombre del empleado");
		int sueldo3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el suledo"));
		int añofecha3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
		int mesfecha3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
		int diafecha3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el día"));
		
		
		empleado empleado1 = new empleado(nombre1,sueldo1,añofecha,mesfecha,diafecha);
		empleado empleado2 = new empleado(nombre2,sueldo2,añofecha2,mesfecha2,diafecha2);
		empleado empleado3 = new empleado(nombre3,sueldo3,añofecha3,mesfecha3,diafecha3);
		
		empleado1.subeSueldo(4);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(6);
		
		System.out.println(empleado1.dameNombre()+" sueldo: "+empleado1.dameSueldo()+ " fecha: "+empleado1.dameFechaContrato());
		System.out.println(empleado2.dameNombre()+" sueldo: "+empleado2.dameSueldo()+ " fecha: "+empleado2.dameFechaContrato());
		System.out.println(empleado3.dameNombre()+" sueldo: "+empleado3.dameSueldo()+ " fecha: "+empleado3.dameFechaContrato());*/
		
		empleado misempleado[]= new empleado[6];
		Jefe jefeRRHH = new Jefe("Sebastian",5000000,1998,06,20);
		
		jefeRRHH.setEstableceincentivo(250000);
		
		for(int i =0;i<3;i++)
		{
			String nombre1 = JOptionPane.showInputDialog("Dijite nombre del empleado");
			int sueldo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el suledo"));
			int añofecha = Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
			int mesfecha = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
			int diafecha = Integer.parseInt(JOptionPane.showInputDialog("Digite el día"));
			
			misempleado[i] = new empleado(nombre1,sueldo1,añofecha,mesfecha,diafecha);
		}
		
		misempleado[3]=new empleado("Jorge Paez");
		misempleado[4]=jefeRRHH;//Polimorfismo 
		misempleado[5]=new Jefe("Maria",300000,2000,03,03);
		
		Jefe jefe_finanzas =(Jefe) misempleado[5];//Refundicion de objetos
		
		jefe_finanzas.setEstableceincentivo(45000);
		jefe_finanzas.getEstablece_bonus(50000);
		
		empleado director_comercial = new Jefe("Sandra",5000,2000,04,04);
		
		Comparable ejemplo= new empleado("Santiago",2000,2017,03,07);
		
		
		
		if(director_comercial instanceof empleado)
		{
			System.out.println("Es de tipo jefe");
		}
		
		if(ejemplo instanceof Comparable)
		{
			System.out.println("Implementa interfaces comparable");
		}
		
		for(int i = 0;i<3;i++)
		{
			int porcentaje = Integer.parseInt(JOptionPane.showInputDialog("ingrese porcentaje"+" "+ (i+1)));
			misempleado[i].subeSueldo(porcentaje);
		}
		
		Arrays.sort(misempleado);
		
		for(int i = 0;i<6;i++)
		{
			System.out.println(misempleado[i].dameNombre()+" sueldo: "+misempleado[i].dameSueldo()+ "  fecha: "+misempleado[i].dameFechaContrato());
		}
	}

}



class empleado implements Comparable,Trabajadores{
	
    public empleado(String nom,double sue,int año,int mes,int dia){
    	
    	nombre=nom;
    	sueldo=sue;
    	GregorianCalendar calendario = new GregorianCalendar(año,mes-1,dia);
    	altacontrato = calendario.getTime();
    }
    
    
    
    public empleado(String nom){
    	
    	this(nom,30000,2000,01,01);
    	
    }
    
    
    public String dameNombre(){//getter
    	
    	return nombre;
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
    
    public int compareTo(Object miObjeto){
    	
    	empleado otro_empleado=(empleado) miObjeto;
    	
    	if(this.sueldo<otro_empleado.sueldo)
    	{
    		return -1;
    	}
    	if(this.sueldo>otro_empleado.sueldo)
    	{
    		return 1;
    	}
    	 
    	return 0;
    }
    
     public double getEstablece_bonus(double gratificacion) {
		
		      return Trabajadores.bonus_base+gratificacion;
	     }

    
    private String nombre;
    private double sueldo;
    private Date altacontrato;
	
    
	
	
}