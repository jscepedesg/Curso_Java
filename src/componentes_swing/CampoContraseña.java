package componentes_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import eventos.Util;

public class CampoContraseņa extends JFrame{

	public CampoContraseņa()
	{
		setTitle("UPC-Contraseņa");
		setSize(500,500);
		setResizable(false);
		Util.centrarVentana(this);
		PanelContraseņa pnlcontraseņa = new PanelContraseņa();
		add(pnlcontraseņa);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CampoContraseņa ventana = new CampoContraseņa();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		

	}

}
class PanelContraseņa extends JPanel
{
	private JPasswordField contraseņa1;
	
	public PanelContraseņa()
	{
		setLayout(new BorderLayout());
		Comprueba_contraseņa evento = new Comprueba_contraseņa();
		JPanel laminasup = new JPanel();
		laminasup.setLayout(new GridLayout(2,2));
		add(laminasup,BorderLayout.NORTH);
		
		JLabel etiqueta1 = new JLabel("Usuario: ");
		JLabel etiqueta2 = new JLabel("Contraseņa: ");
		
		JTextField usuario = new JTextField(15);
		 contraseņa1 = new JPasswordField(15);
		 contraseņa1.getDocument().addDocumentListener(evento);
		
		laminasup.add(etiqueta1);
		laminasup.add(usuario);
		laminasup.add(etiqueta2);
		laminasup.add(contraseņa1);
		
		JButton enviar = new JButton("Enviar");
		add(enviar,BorderLayout.SOUTH);
	}
	
	private class Comprueba_contraseņa implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			char[] contraseņa;
			contraseņa = contraseņa1.getPassword();
			if(contraseņa.length<8||contraseņa.length>12)
			{
				contraseņa1.setBackground(Color.RED);
			}
			else
			{
				contraseņa1.setBackground(Color.WHITE);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char[] contraseņa;
			contraseņa = contraseņa1.getPassword();
			if(contraseņa.length<8||contraseņa.length>12)
			{
				contraseņa1.setBackground(Color.RED);
			}
			else
			{
				contraseņa1.setBackground(Color.WHITE);
			}
		}
		
	}
}
