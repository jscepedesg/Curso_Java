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

public class CampoContrase�a extends JFrame{

	public CampoContrase�a()
	{
		setTitle("UPC-Contrase�a");
		setSize(500,500);
		setResizable(false);
		Util.centrarVentana(this);
		PanelContrase�a pnlcontrase�a = new PanelContrase�a();
		add(pnlcontrase�a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CampoContrase�a ventana = new CampoContrase�a();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		

	}

}
class PanelContrase�a extends JPanel
{
	private JPasswordField contrase�a1;
	
	public PanelContrase�a()
	{
		setLayout(new BorderLayout());
		Comprueba_contrase�a evento = new Comprueba_contrase�a();
		JPanel laminasup = new JPanel();
		laminasup.setLayout(new GridLayout(2,2));
		add(laminasup,BorderLayout.NORTH);
		
		JLabel etiqueta1 = new JLabel("Usuario: ");
		JLabel etiqueta2 = new JLabel("Contrase�a: ");
		
		JTextField usuario = new JTextField(15);
		 contrase�a1 = new JPasswordField(15);
		 contrase�a1.getDocument().addDocumentListener(evento);
		
		laminasup.add(etiqueta1);
		laminasup.add(usuario);
		laminasup.add(etiqueta2);
		laminasup.add(contrase�a1);
		
		JButton enviar = new JButton("Enviar");
		add(enviar,BorderLayout.SOUTH);
	}
	
	private class Comprueba_contrase�a implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			char[] contrase�a;
			contrase�a = contrase�a1.getPassword();
			if(contrase�a.length<8||contrase�a.length>12)
			{
				contrase�a1.setBackground(Color.RED);
			}
			else
			{
				contrase�a1.setBackground(Color.WHITE);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char[] contrase�a;
			contrase�a = contrase�a1.getPassword();
			if(contrase�a.length<8||contrase�a.length>12)
			{
				contrase�a1.setBackground(Color.RED);
			}
			else
			{
				contrase�a1.setBackground(Color.WHITE);
			}
		}
		
	}
}
