package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marcobotones mimarco = new Marcobotones();
		mimarco.setVisible(true);
		

	}

}
class Marcobotones extends JFrame{
	
	
	Marcobotones(){
		
		setSize(500,500);
		setTitle("UPC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		Util.centrarVentana(this);
		
		Laminabotones milamina = new Laminabotones();
		add(milamina);
		
	}
}

class Laminabotones extends JPanel implements ActionListener{
	
	
	JButton botonazul = new JButton("Azul");
	JButton botonamarillo = new JButton("Amarillo");
	JButton botonrojo = new JButton("Rojo");
	public Laminabotones(){
		
		add(botonazul);add(botonamarillo);add(botonrojo);
		
		botonazul.addActionListener(this);
		botonamarillo.addActionListener(this);
		botonrojo.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		
		
		Object botonpulsado = e.getSource();
		
		if(botonpulsado==botonazul)
		{
		
			setBackground(Color.BLUE);
		
		}
		else if(botonpulsado == botonamarillo)
		{
			setBackground(Color.YELLOW);
		}
		else
		{
			setBackground(Color.RED);
		}
	}
	
	
	
}