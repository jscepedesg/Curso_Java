import java.util.*;

/**
 * 
 * 
 * 
 * */
public class Uso_tallas {

	
	//enum Talla{Mini,Mediano,Grande,Muy_Grande};
	
	enum Talla{
		
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		
		private Talla(String abreviatura)
		{
			this.abreviatura=abreviatura;
		}
		
		
		public String getAbreviatura(){
			
			
			return abreviatura;
		}
		private String abreviatura;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Talla s = Talla.Mini;
		Talla m = Talla.Mediano;
		Talla l = Talla.Grande;
		Talla xl = Talla.Muy_Grande;*/
		
		Scanner  Entrada = new Scanner(System.in); 
		
		System.out.println("Escribe una talla : Mini, Mediano, Grande, Muy_grande");
		
		String entrada_datos=Entrada.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
		
		System.out.println("Talla="+la_talla);
		
		System.out.println("Abreviatura es = "+la_talla.getAbreviatura());
		
		
		
	}
	
	

}
