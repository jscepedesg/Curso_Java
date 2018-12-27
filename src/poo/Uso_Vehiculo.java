package poo;
import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		/*Coche mazda = new Coche(); //Instanciar una clase
		
		mazda.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(mazda.dime_datos_generales());
		
		System.out.println(mazda.dime_color_coche());
		 
		mazda.configuracion_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		System.out.println(mazda.dime_asientos());
		
		mazda.configuracion_climatizador(JOptionPane.showInputDialog("Tiene climatizador"));
		
		System.out.println(mazda.dime_climatizador());
		
		System.out.println(mazda.dime_peso_coche());
		
		System.out.println("El precio final es: "+mazda.precio_coche());*/
		
		Coche micoche1 = new Coche();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7,580);
		
		mifurgoneta1.establece_color("Azul.");
		
		mifurgoneta1.configuracion_asientos("Si");
		mifurgoneta1.configuracion_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales()+" "+micoche1.dime_color_coche());
	  
		System.out.println(mifurgoneta1.dime_datos_generales()+" "+mifurgoneta1.dime_color_coche()+" "+mifurgoneta1.getDatos_Furgoneta());

	}

}
