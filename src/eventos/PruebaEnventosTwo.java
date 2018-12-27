package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEnventosTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VentanaEventos ventanapri = new VentanaEventos();
		ventanapri.setVisible(true);
		
	}

}

class VentanaEventos extends JFrame{
	
	VentanaEventos(){
		
		setSize(500,500);
		setTitle("UPC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		Util.centrarVentana(this);
		
		Lamina1two milamina = new Lamina1two();
		add(milamina);
	}
}

class Lamina1two extends JPanel{
	
	
	 private JButton botonazul,botonamarillo,botonrojo;
	 
	Lamina1two(){
		
		botonazul= new JButton("AZUL");
		botonamarillo = new JButton("AMARILLO");
		botonrojo = new JButton("ROJO");
		
		Colorfondo azul = new Colorfondo(Color.BLUE);
		Colorfondo amarillo = new Colorfondo(Color.YELLOW);
		Colorfondo rojo = new Colorfondo(Color.RED);
		
		
		botonazul.addActionListener(azul);
		botonamarillo.addActionListener(amarillo);
		botonrojo.addActionListener(rojo);
		
		
		add(botonazul);add(botonamarillo);add(botonrojo);
		
		
	}

	private class Colorfondo implements ActionListener{
		
		private Color colorfondo;
		
		Colorfondo(Color c){
			
			colorfondo = c;

		}

		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorfondo);
			
		}
	}
	
}

