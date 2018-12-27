package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosMultiplesOyentes extends JFrame{
	
	public EventosMultiplesOyentes()
	{
		
		setTitle("UPC-oyentes multiples");
		setSize(300,100);
		setResizable(false);
		
		Util.centrarVentana(this);
		
		PanelEventosMultiplesOyentes lamina = new PanelEventosMultiplesOyentes();
		add(lamina);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventosMultiplesOyentes ventana = new EventosMultiplesOyentes();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class PanelEventosMultiplesOyentes extends JPanel{
	
	JButton boton_cerrar;
	
	public PanelEventosMultiplesOyentes()
	{
		
		JButton boton_nuevo = new JButton("Nuevo");
		add(boton_nuevo);
		
		boton_cerrar = new JButton("Cerrar todo");
		add(boton_cerrar);
		
		Oyente_nuevo oyente = new Oyente_nuevo();
		boton_nuevo.addActionListener(oyente);
		
	}
	
	private class Oyente_nuevo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Marco_emergente marco = new Marco_emergente(/*boton_cerrar*/);
			marco.setVisible(true);
		}
		
		
		
	}
	
	
}

class Marco_emergente extends JFrame{
	
	private static int contador=0;
	public Marco_emergente(/*JButton boton_principal*/)
	{
		
	
		contador++;
		setTitle("Ventana "+contador);
		setBounds(40*contador,40*contador,300,150);
		//Cerrar_todos cerrar = new Cerrar_todos();
		//boton_principal.addActionListener(cerrar);
	}
	
	private class Cerrar_todos implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
			contador =0;
			
		}
		
	}
	
}