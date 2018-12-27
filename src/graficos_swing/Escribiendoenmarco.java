package graficos_swing;
import javax.swing.*;
import java.awt.*;

public class Escribiendoenmarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marcocontexto framer = new Marcocontexto();
		framer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marcocontexto extends JFrame{
	
	public Marcocontexto(){
		
		setVisible(true);
		setSize(300,400);
		setLocation(400,200);
		setTitle("UPC");
		
		Lamina milamina = new Lamina();
		add(milamina);
	
	     }
	}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
}