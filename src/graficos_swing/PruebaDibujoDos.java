package graficos_swing;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;


public class PruebaDibujoDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dibujo1 Pantalla = new Dibujo1();
		Pantalla.setVisible(true);
	}

}

class Dibujo1 extends JFrame{
	
	Dibujo1(){
		
		//Configuracion JFrame
		
		setTitle("UPC");
		setSize(400,500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Centrar pantalla
		Util.centrarVentana(this);
		
		Lamina1 lamina =new Lamina1();
		add(lamina);
		
		
		
	}
	
	
}

class Lamina1 extends JPanel{
	
public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		g2.draw(new Line2D.Double(100,100,300,250));
		
		double centrox = rectangulo.getCenterX();
		double centroy = rectangulo.getCenterY();
		double radio=150;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centrox, centroy, centrox+radio, centroy+radio);
		g2.draw(circulo);
		
	}
	
	
}