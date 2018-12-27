package eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class Eventos_ventanaone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marcoventana miventana = new Marcoventana();
		miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Marcoventana miventana2 = new Marcoventana();
		miventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		miventana.setTitle("Ventana1-UPC");
		miventana2.setTitle("Ventana2-UPC");
		miventana.setBounds(100, 200, 500, 350);
		miventana2.setBounds(700, 200, 500, 350);
	}

}
class Marcoventana extends JFrame{
	
	Marcoventana(){
		
		setSize(500,500);
		//setTitle("UPC");
		setVisible(true);
		
		//Util.centrarVentana(this);
		
		 M_ventana oyenteventana = new  M_ventana();
		 addWindowListener(oyenteventana);
	
		
		
	}
}
class M_ventana extends WindowAdapter{

	
	public void windowActivated(WindowEvent e) {
		System.out.println("ventana activa");
	}
	
	public void windowClosed(WindowEvent e) { 
		
		System.out.println("La ventana a sido cerrada");
	}
	
	public void windowClosing(WindowEvent e) {
		System.out.println("ventana cerrada");
	}
	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("ventana desactivada"); }
	
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("ventana restaurada");
	}
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("ventana minimizada");
	}
	
	public void windowOpened(WindowEvent e) {
		System.out.println("ventana abierta");
		
	}
	
	
}