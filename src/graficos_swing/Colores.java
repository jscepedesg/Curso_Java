package graficos_swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Colores {

	public static void main(String[] args) {
		
		Ventana ventanaprin = new Ventana();
		ventanaprin.setVisible(true);
		

	}

}

class Ventana extends JFrame{
	
	Ventana(){
		
		//Configuracion JFrame
		
		setSize(500,500);
		setTitle("UPC");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Centar JFramer
		
		Util.centrarVentana(this);
		
		//Instanciar lamina
		Lamina1ven pnl =new Lamina1ven();
		add(pnl);
		
		//Color pnl
		pnl.setBackground(Color.BLACK);//o SystemColor.widows
		
	}
	
	
}

class Lamina1ven extends JPanel{
	
	public void paintComponent(Graphics g){
		
		
		super.paintComponent(g);
		
		//Crear objecto
		Graphics2D g2=(Graphics2D) g;
		//Creando Rectangulo
		Rectangle2D rectangulo = new Rectangle2D.Double(140,140,200,150);
		g2.draw(rectangulo);
		//Colores
		g2.setPaint(Color.GRAY.darker().darker());//Crea Color
		g2.fill(rectangulo);//Rellena objecto
		
		g2.setPaint(Color.WHITE);//Crea Color
		g2.draw(rectangulo);//Color Borde objecto
		//Rectangulo Circulo
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		//Colores
		g2.setPaint(new Color(33,120,148).brighter());
		g2.fill(elipse);
		g2.setPaint(Color.BLACK);
		g2.draw(elipse);
		
		//Crear color
		Color micolor = new Color(33,120,148);
		
	}
	
	
}