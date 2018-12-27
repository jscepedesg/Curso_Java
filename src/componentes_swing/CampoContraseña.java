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

public class CampoContraseña extends JFrame{

	public CampoContraseña()
	{
		setTitle("UPC-Contraseña");
		setSize(500,500);
		setResizable(false);
		Util.centrarVentana(this);
		PanelContraseña pnlcontraseña = new PanelContraseña();
		add(pnlcontraseña);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CampoContraseña ventana = new CampoContraseña();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		

	}

}
class PanelContraseña extends JPanel
{
	private JPasswordField contraseña1;
	
	public PanelContraseña()
	{
		setLayout(new BorderLayout());
		Comprueba_contraseña evento = new Comprueba_contraseña();
		JPanel laminasup = new JPanel();
		laminasup.setLayout(new GridLayout(2,2));
		add(laminasup,BorderLayout.NORTH);
		
		JLabel etiqueta1 = new JLabel("Usuario: ");
		JLabel etiqueta2 = new JLabel("Contraseña: ");
		
		JTextField usuario = new JTextField(15);
		 contraseña1 = new JPasswordField(15);
		 contraseña1.getDocument().addDocumentListener(evento);
		
		laminasup.add(etiqueta1);
		laminasup.add(usuario);
		laminasup.add(etiqueta2);
		laminasup.add(contraseña1);
		
		JButton enviar = new JButton("Enviar");
		add(enviar,BorderLayout.SOUTH);
	}
	
	private class Comprueba_contraseña implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			char[] contraseña;
			contraseña = contraseña1.getPassword();
			if(contraseña.length<8||contraseña.length>12)
			{
				contraseña1.setBackground(Color.RED);
			}
			else
			{
				contraseña1.setBackground(Color.WHITE);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char[] contraseña;
			contraseña = contraseña1.getPassword();
			if(contraseña.length<8||contraseña.length>12)
			{
				contraseña1.setBackground(Color.RED);
			}
			else
			{
				contraseña1.setBackground(Color.WHITE);
			}
		}
		
	}
}
