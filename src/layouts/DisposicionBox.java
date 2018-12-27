package layouts;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import graficos_swing.Util;

public class DisposicionBox {

	
	
	public static void main(String[] args) {
		
		MarcoPrueba ventana = new MarcoPrueba();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

	
}

class MarcoPrueba extends JFrame
{
	public MarcoPrueba()
	{
		setTitle("Box");
		setSize(500,500);
		Util.centrarVentana(this);
		
		JLabel rotulo1 = new JLabel("Nombre");
		JTextField texto1 = new JTextField(5);
		texto1.setMaximumSize(texto1.getPreferredSize());
		
		Box caja1 = Box.createHorizontalBox();
		caja1.add(rotulo1);
		caja1.add(Box.createHorizontalStrut(10));
		caja1.add(texto1);
		
		JLabel rotulo2 = new JLabel("Contraseña");
		JTextField texto2 = new JTextField(10);
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		Box caja2 = Box.createHorizontalBox();
		
		caja2.add(rotulo2);
		caja2.add(Box.createHorizontalStrut(10));
		caja2.add(texto2);
		
		JButton boton1= new JButton("Ok");
		JButton boton2= new JButton("Cancelar");
		
		Box caja3 = Box.createHorizontalBox();
		
		caja3.add(boton1);
		caja3.add(Box.createGlue());
		caja3.add(boton2);
		
		Box cajaver = Box.createVerticalBox();
		cajaver.add(caja1);
		cajaver.add(caja2);
		cajaver.add(caja3);
		
		add(cajaver,BorderLayout.CENTER);
	}
}