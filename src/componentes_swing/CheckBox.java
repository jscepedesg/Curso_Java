package componentes_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import eventos.Util;

public class CheckBox extends JFrame{

	
	CheckBox()
	{
		
		setTitle("UPC-Botones Selecionadores");
		setSize(500,500);
		setResizable(false);
		Util.centrarVentana(this);
		
		PanelBotonCheckBox pnlBotonesCheckBox = new PanelBotonCheckBox();
		
		add(pnlBotonesCheckBox);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBox ventana = new CheckBox();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class PanelBotonCheckBox extends JPanel
{
	
	private JLabel texto;
	// Crear Botones de selecion 
	private JCheckBox check1,check2;
	
	
	
	PanelBotonCheckBox()
	{
		setLayout(new BorderLayout());
		
		Font letras = new Font("Serif",Font.PLAIN,24);
		
		texto = new JLabel("En un lugar de la mancha cuyo nombre.......");
		texto.setFont(letras);
		
		JPanel paneltexto = new JPanel();
		paneltexto.add(texto);
		
		add(paneltexto,BorderLayout.CENTER);
		
		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");
		
		ManejaCheckBox evento = new ManejaCheckBox();
		
		check1.addActionListener(evento);
		check2.addActionListener(evento);
		
		JPanel panelchecks = new JPanel();
		panelchecks.add(check1);panelchecks.add(check2);
		add(panelchecks,BorderLayout.SOUTH);
		
	}
	
	private class ManejaCheckBox implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			int tipo = 0;
			
			if(check1.isSelected())
			{
				tipo+=Font.BOLD;
			}
			
			if(check2.isSelected())
			{
				tipo+=Font.ITALIC;
			}
			
			texto.setFont(new Font("Serif",tipo,24));
		}
		
	}
	
	
}
