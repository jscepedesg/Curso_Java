package graficos_swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FuentesLetras {

	public static void main(String[] args) {
	
		//Instanciar Clase Letras
		Letras misletras = new Letras();
		misletras.setVisible(true);
		

	}

}

class Letras extends JFrame{
	
	Letras(){
		
		//Configuracion JFrame
		
		setSize(500,500);
		setTitle("UPC");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Centar JFrame
		Util.centrarVentana(this);
		
		//instanciar Clase Panelfuetes
			Panelfuentes fuentes = new Panelfuentes();
			add(fuentes);
			//Establecer un color fijo en el panel
			fuentes.setForeground(Color.GRAY.darker());
		
		
		
	}
	
}

class Panelfuentes extends JPanel{
	
	
   public void paintComponent(Graphics g){
		
			super.paintComponent(g);
			
			//Crear objecto Graphis2D
			Graphics2D g2=(Graphics2D) g;
			
			//Primer texto con color y fuente
			Font mifuente = new Font("Arial",Font.BOLD, 26);
			g2.setFont(mifuente);
			//g2.setColor(Color.BLUE);
			g2.drawString("Sebastian", 100, 100);
			
			//Segundo texto con color y fuente
			g2.setFont(new Font("Algerian", Font.ITALIC, 30));
			//g2.setColor(Color.GRAY);
			g2.drawString("Laura", 100, 200);
			
			
			
		
		
}

	
	
}