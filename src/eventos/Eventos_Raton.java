package eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Eventos_Raton extends JFrame {
	
	public Eventos_Raton()
	{
		
		setTitle("UPC-Eventos de raton");
		setSize(500,500);
		setResizable(false);
		Util.centrarVentana(this);
		
		Eventos_de_raton raton = new Eventos_de_raton();
		
		addMouseListener(raton);
		addMouseMotionListener(raton);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eventos_Raton ventana = new Eventos_Raton();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);

	}

}

class Eventos_de_raton implements MouseListener, MouseMotionListener{

	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Coordenada x: "+e.getX()+" Coordenada y: "+e.getY());//Coordenadas del click
		
		//System.out.println(e.getClickCount());//Cuantas veces hizo click
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("acabas de entrar");
	}

	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("acabas de salir");
	}

	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Acabas de presionar");
		//System.out.println(e.getModifiersEx());//Click derecho, Click Izquierdo, Boton del centro
		
		
	}

	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("acabas de levantar");
		
	}
	
	
	

	//Metodos de  MouseMotionListener
	
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando");
	}

	
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo");
		
	}
	
	
}