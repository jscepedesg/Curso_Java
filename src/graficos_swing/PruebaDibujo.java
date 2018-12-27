package graficos_swing;

import java.awt.*;
import javax.swing.*;



public class PruebaDibujo {

	public static void main(String[] args) {
		

		MarcoConDibujos ventana = new MarcoConDibujos();
		ventana.setVisible(true);
		
	}

}

class MarcoConDibujos extends JFrame{
	
	MarcoConDibujos(){
		
		//Configurando Framer
		setTitle("UPC");
		setSize(400,400);
		setResizable( false );	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Centrar ventana
	     Util.centrarVentana( this );
	     
	     //Añadiendo triangulo
	     
	     LaminaFigura milamina=new LaminaFigura();
	     add(milamina);
	}
}

class LaminaFigura extends JPanel{
	
public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		g.drawRect(50, 50, 200, 200);
		g.drawLine(100, 100, 100, 400);
		g.drawArc(50, 100, 100, 200, 120, 150);
	}
	
}