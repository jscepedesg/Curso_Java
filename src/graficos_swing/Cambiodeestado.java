package graficos_swing;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cambiodeestado extends JFrame {
	
	public Cambiodeestado(){
	
		setTitle("Cambio de estado");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Util.centrarVentana(this);
		
		Cambiaestado ventana2 = new Cambiaestado();
		addWindowStateListener(ventana2);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cambiodeestado miventana = new Cambiodeestado();
		miventana.setVisible(true);
		

	}

}

class Cambiaestado implements WindowStateListener{

	
	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("La ventana cambio de estado");
		
		//System.out.println(e.getNewState());
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH)
		{
			System.out.println("La ventana cambio a pantalla completa");
		}
		else if(e.getNewState()==Frame.NORMAL)
		{
			System.out.println("La ventana esta normal");
		}
		else if(e.getNewState()==Frame.ICONIFIED)
		{
			System.out.println("La ventana esta minimizada");
		}
		else if(e.getNewState()==Frame.MAXIMIZED_HORIZ)
		{
			System.out.println("La ventana aumento Horizontalmente");
		}
		else if(e.getNewState()==Frame.MAXIMIZED_VERT)
		{
			
			System.out.println("La ventana aumento verticalmente");
		}
		
	}
	
	
	
}
