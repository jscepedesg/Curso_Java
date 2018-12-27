package componentes_swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import eventos.Util;

public class PruebaTexto extends JFrame{
	
	public PruebaTexto()
	{
		setTitle("UPC-Textos");
		setSize(400,200);
		setResizable(false);
		Util.centrarVentana(this);
		
		PanelTexto pnlTexto = new PanelTexto();
		add(pnlTexto);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PruebaTexto ventanaprin = new PruebaTexto();
		ventanaprin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaprin.setVisible(true);

	}

}

class PanelTexto extends JPanel{
	
	private JTextField campo1;
	private JLabel resultado;
	
	public PanelTexto()
	{
		setLayout(new BorderLayout());
		
		JPanel PanelResultado = new JPanel();
		 PanelResultado.setLayout(new FlowLayout());
		
		resultado= new JLabel("",JLabel.CENTER);
		JLabel texto = new JLabel("Email : ");
		PanelResultado.add(texto);
		 campo1 = new JTextField(20);
		 PanelResultado.add(campo1);
		add(resultado,BorderLayout.CENTER);
		JButton boton1 = new JButton("Click");
		//System.out.println(campo1.getText().trim());
		DameTexto evento = new DameTexto();
		boton1.addActionListener(evento);
		PanelResultado.add(boton1);
		add(PanelResultado,BorderLayout.NORTH);
	}
	
	private class DameTexto implements ActionListener{
		
		public  DameTexto(){
			
		}

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int correcto = 0,correcto1=0;
			String email=campo1.getText().trim();
			
			for(int i = 0;i<email.length();i++)
			{
				if(email.charAt(i)=='@')
				{
					correcto++;
				}
				if(email.charAt(i)=='.')
				{
					correcto1++;
				}
			}
			
			if(correcto ==1 && correcto1==1)
			{
				resultado.setText("Correcto");
			}
			else
			{
				resultado.setText("Incorrecto");
			}
			//System.out.println(campo1.getText());
		}
		
	}
}

