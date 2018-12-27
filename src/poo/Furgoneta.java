package poo;

public class Furgoneta extends Coche{

	private int capacidad_carga;
	private int plazas_extras;
	
	public Furgoneta(int plazas_extras,int capacidad_carga){
		
		super(); //Llamar al constructor de la clase padre
		
		this.capacidad_carga=capacidad_carga;
		this.plazas_extras=plazas_extras;
		
	}
	
	public String getDatos_Furgoneta(){
		
		return "La capacidad de cargar es: "+capacidad_carga+" y las plazas son: "+plazas_extras;
	}
}
