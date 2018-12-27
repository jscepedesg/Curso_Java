package componentes_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import graficos_swing.Util;

public class BotonesDeRadio2 extends JFrame{
 
	BotonesDeRadio2()
	{
		setTitle("UPC-Botones De Radio");
		setResizable(false);
		setSize(500,500);
		
		Util.centrarVentana(this);
		
		
		PanelBotonesradio2 pnlbotone = new PanelBotonesradio2();
		add(pnlbotone);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BotonesDeRadio2 ventana = new BotonesDeRadio2();
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
	}

}
class PanelBotonesradio2 extends JPanel
{
	
	private JLabel texto;
	private JRadioButton boton1,boton2,boton3,boton4;
	
	PanelBotonesradio2()
	{
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("En un lugar de la mancha cuya mancha.....");
		add(texto,BorderLayout.CENTER);
		
		ButtonGroup grupo = new ButtonGroup();
		
		boton1 = new JRadioButton("Pequeño",false);
		boton2 = new JRadioButton("Mediano",true);
		boton3 = new JRadioButton("Grande",false);
		boton4 = new JRadioButton("Muy Grande",false);
		
		JPanel laminaradio = new JPanel();
		
		 enventoradio evento = new  enventoradio();
		 boton1.addActionListener(evento);
		 boton2.addActionListener(evento);
		 boton3.addActionListener(evento);
		 boton4.addActionListener(evento);
		 
		grupo.add(boton1);grupo.add(boton2);grupo.add(boton3);grupo.add(boton4);
		
		laminaradio.add(boton1);laminaradio.add(boton2);laminaradio.add(boton3);
		laminaradio.add(boton4);
		
		add(laminaradio,BorderLayout.SOUTH);
		
		
	}
	
	private class enventoradio implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==boton1)
			{
				//System.out.println("pulso en 1");
				texto.setFont(new Font("Serif",Font.PLAIN,10));
			}
			else if(e.getSource()==boton2)
			{
				//System.out.println("pulso en 1");
				texto.setFont(new Font("Serif",Font.PLAIN,12));
			}
			else if(e.getSource()==boton3)
			{
				//System.out.println("pulso en 1");
				texto.setFont(new Font("Serif",Font.PLAIN,18));
			}
			else if(e.getSource()==boton4)
			{
				//System.out.println("pulso en 1");
				texto.setFont(new Font("Serif",Font.PLAIN,24));
			}
		}
		
	}
	
	
}
