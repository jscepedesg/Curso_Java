package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

import graficos_swing.Util;

public class DisposicionMuelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamina ventana = new Lamina();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

}

class Lamina extends JFrame
{
	Lamina()
	{
		setTitle("Muelle");
		setSize(500,500);
		Util.centrarVentana(this);
		lamina2 lamina = new lamina2();
		add(lamina);
	}
	
}

class lamina2 extends JPanel
{
	public lamina2()
	{
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");
		JButton boton3 = new JButton("Boton 3");
		
		//Instancia la clase 
		SpringLayout milayuot = new SpringLayout();
		setLayout(milayuot);
		add(boton1);add(boton2);add(boton3);
		//Crea los muelles
		Spring mimuelle =  Spring.constant(0, 10, 100);
		Spring mimueller =  Spring.constant(20);
		//referencia del objecto,objecto,referencia del 2 objecto,objecto2
		milayuot.putConstraint(SpringLayout.WEST, boton1, mimuelle,SpringLayout.WEST , this);
		milayuot.putConstraint(SpringLayout.WEST, boton2, mimueller,SpringLayout.EAST , boton1);
		milayuot.putConstraint(SpringLayout.WEST, boton3, mimueller,SpringLayout.EAST , boton2);
		milayuot.putConstraint(SpringLayout.EAST, this, mimuelle,SpringLayout.EAST , boton3);
		
	}

}