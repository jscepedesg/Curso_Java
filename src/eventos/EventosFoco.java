package eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventosFoco extends JFrame{
	

	 EventosFoco()
	{
		setTitle("UPC-FOCO");
		setSize(500,500);
		setResizable(false);
		
		Util.centrarVentana(this);
		
		add(new PanelFoco());
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EventosFoco ventana = new EventosFoco();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
	}

}

class PanelFoco extends JPanel
{
	
	JTextField cuadro1;
	JTextField cuadro2;
	
	public void paintComponent(Graphics g)
	{

		super.paintComponent(g);
		
		setLayout(null);
		
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120,50,150,20);
		add(cuadro1);add(cuadro2);
		
		LanzaFocos elfoco = new LanzaFocos();
		cuadro1.addFocusListener(elfoco);
		
	}
	
	private class LanzaFocos implements FocusListener
	{

		public void focusGained(FocusEvent e) {//objecto esta en escucha
			// TODO Auto-generated method stub
			
		}

		public void focusLost(FocusEvent e) {//objecto pierde el foco
			// TODO Auto-generated method stub
			
			String email=cuadro1.getText();
			
			boolean comprobacion = false;
			
			for(int i=0;i<email.length();i++)
			{
				
				if(email.charAt(i)=='@')
				{
					comprobacion=true;
				}
				
			}
			
			if(comprobacion)
			{
				
				System.out.println("Es correcto");
				
			}
			else
			{
				System.out.println("Es incorrecto");
			}
		}
		
		
		
	}
	
}


