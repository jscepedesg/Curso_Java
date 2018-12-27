package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class EventosFocoVentana extends JFrame implements WindowFocusListener{
	
	
	EventosFocoVentana marco1;
	EventosFocoVentana marco2;
	
	EventosFocoVentana()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EventosFocoVentana ventana = new EventosFocoVentana();
		ventana.Iniciar();
		
	}
	
	public void Iniciar()
	{
		marco1 = new EventosFocoVentana();
		marco2 = new EventosFocoVentana();
		marco1.setVisible(true);
		marco2.setVisible(true);
		marco1.setBounds(100, 100, 600, 350);
		marco2.setBounds(700, 100, 600, 350);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setTitle("UPC-Focos de ventana 1-Eventos");
		marco2.setTitle("UPC-Focos de ventana 2-Eventos");
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
	}

	
	public void windowGainedFocus(WindowEvent e)
	{
		
		if(e.getSource()==marco1)
		{
			
			marco1.setTitle("Tengo el foco");
			
		}
		else
		{
			
			marco2.setTitle("Tengo el foco");
			
		}
		
	}

	
	public void windowLostFocus(WindowEvent e)
	{
		if(e.getSource()==marco1)
		{
			
			marco1.setTitle(" ");
			
		}
		else
		{
			
			marco2.setTitle(" ");
			
		}
		
		
	}

}
