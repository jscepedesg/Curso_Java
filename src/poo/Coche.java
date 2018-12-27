package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero,climatizador;
	
	public Coche(){
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
		
		
	}
	public String dime_datos_generales(){ // Getter
		
		
		return"La plataforma del vehiculo tiene: "+ruedas+" Ruedas."+largo+" Largo."+
		ancho+" Ancho."+motor+" Motor."+peso_plataforma+" Peso plataforma.";
	}
	
	
	public void establece_color(String color_coche){//Setter
		
		color = color_coche;
		
	}
	
	public String dime_color_coche(){
		
		return "El color del coche es: "+color;
	}
	
	public void configuracion_asientos(String asientos_cuero){
		
		if(asientos_cuero.equalsIgnoreCase("si"))
		{
			this.asientos_cuero=true;
		}
		else
		{
			this.asientos_cuero=false;
		}
		
		
	}
	
	public String dime_asientos(){
		
		if(asientos_cuero==true)
		{
			return "Tiene asientos de cuero";
		}
		else
		{
			return "Tiene asientos de serie";
		}
	}
	
	public void configuracion_climatizador(String climatizador){
		
		if(climatizador.equalsIgnoreCase("si"))
		{
			this.climatizador=true;
		}
		else
		{
			this.climatizador=false;
		}
		
	}
	
	public String dime_climatizador(){
		
		if(climatizador==true)
		{
			return "Tiene climatizador";
		}
		else
		{
			return "No tiene climatizador";
		}
	}
	
	public String dime_peso_coche(){
		
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true)
		{
			peso_total=peso_total+50;
		}
		if(climatizador==true)
		{
			peso_total=peso_total+20;
		}
		
		return "El peso del vehiculo es: "+peso_total;
		
	}
	
	public int precio_coche(){
		
		int precio_final=10000;
		
		if(asientos_cuero==true)
		{
			precio_final=precio_final+2000;
		}
		if(climatizador==true)
		{
			precio_final=precio_final+1500;
		}
		return precio_final;
	}

}
