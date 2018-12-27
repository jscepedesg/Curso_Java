package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado extends JFrame{
	
	public EventosTeclado()
	{
		setTitle("UPC-Enventos Teclado");
		setSize(500,500);
		setResizable(false);
		Util.centrarVentana(this);
		
		EnventoDeTeclado tecla = new EnventoDeTeclado();
		
		addKeyListener(tecla);
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventosTeclado ventana = new EventosTeclado();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);

	}

}

class EnventoDeTeclado implements KeyListener{

	
	public void keyPressed(KeyEvent e) {//Presiona la tecla
		// TODO Auto-generated method stub
		/*int codigo= e.getKeyCode();
		System.out.println(codigo);
		if(codigo==73)
		{
			System.out.println("Instruciones");
		}
		*/
		
	}

	
	public void keyReleased(KeyEvent e) {//La suelta
		// TODO Auto-generated method stub
		
		int codigo= e.getKeyCode();
		
		  System.out.println(codigo);
		  
		  if(codigo==10){
			  
			  System.out.println("Muy bien");
		  }
		
	}

	
	public void keyTyped(KeyEvent e) {//La ha presionado la ha soltado 
		// TODO Auto-generated method stub
	
		//char letra=e.getKeyChar();
		
		//System.out.println(letra);
		
	}
	
}
