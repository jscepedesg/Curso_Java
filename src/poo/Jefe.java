package poo;

public  class Jefe extends empleado implements JefesInter {
	
	private double incentivo;

	public Jefe(String nom,double sue,int año,int mes,int dia){
		
		super(nom,sue,año,mes,dia);
		
	}
	
	public String getTomaDeciciones(String decicion){
		
		
		
		return "Un miembro de la direccion a tomado la decicion de:"+decicion;
		
	}
	
	public double getEstablece_bonus(double gratificacion){
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
		
		
	}
	
	public void setEstableceincentivo(double b){
		
		incentivo=b;
		
	}
	
	public double dameSueldo(){
		
		
		double sueldo_jefe;
		
		sueldo_jefe=super.dameSueldo();
		
		return sueldo_jefe+incentivo;
		
	}
}
