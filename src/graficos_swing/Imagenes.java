package graficos_swing;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.*;
public class Imagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ventanaimg miventana = new Ventanaimg();
		miventana.setVisible(true);
		
	
	}

}

class Ventanaimg extends JFrame{
	
	Ventanaimg(){
		
		setSize(500,450);
		setTitle("UPC");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Util.centrarVentana(this);
		
		
		Panelimg primerpanel = new Panelimg();
		add(primerpanel);
		primerpanel.setBackground(Color.GRAY.darker());
		
	}
	
}

class Panelimg extends JPanel{
	
	   public void paintComponent(Graphics g){
			
				super.paintComponent(g);
				//Instancia la clase File y crea un objecto .... parametros ubicacion imagen
				//File miimagen = new File("src/imagenes/1.png");
				
				
				
				//Exepciones de imagen en caso x
				try{
				imagen=ImageIO.read(new File("src/imagenes/1.png"));
				}
				catch(IOException e){
					
					System.out.println("No ha podido encontrace la imagen");
				}
				
				//Saber dimenciones de la imagane
				int anchuraimagen=imagen.getWidth(this);
				int alturaimagen=imagen.getHeight(this);
				
				//Dibujo Imagen
				g.drawImage(imagen, 0, 0, null);
				//Compiando imagen
				g.copyArea(0, 0, 100, 100, 350, 300);
	   }
	   
	   private Image imagen;
	   
	
	
}