package poo;
import javax.swing.*;

public class Prueba_temporizador {

	public static void main(String[] args) {
		
		Dame_la_hora oyente= new Dame_la_hora();
		
		Timer temporizador=new Timer(5000,oyente);
		
		temporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		System.exit(0);
	
		

	}

}
