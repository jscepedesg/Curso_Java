package excepciones;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import graficos_swing.Util;

public class Exepciones2 extends JFrame{

	public Exepciones2()
	{
		setTitle("Expciones 2");
		setSize(500,500);
		Util.centrarVentana(this);
		PanelImage panel = new PanelImage();
		add(panel);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Exepciones2 ventana = new  Exepciones2();
		 ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 ventana.setVisible(true);
	}

}
class PanelImage extends JPanel
{
	private Image imagen;
	
	PanelImage()
	{
		
	}
		
	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		imagen=null;
		try{
			imagen=ImageIO.read(new File("src/imagenes/1.pngf"));
			}
			catch(IOException e){
				
				//JOptionPane.showMessageDialog(PanelImage.this,"La imagen no se encuentra","Alerta",3);
				System.out.println("No ha podido encontrace la imagen");
			}
		
		if(imagen==null)
		{
			g.drawString("No podemos cargar la imagen", 10, 20);
		}
		else
		{
			//Saber dimenciones de la imagane
			int anchuraimagen=imagen.getWidth(this);
			int alturaimagen=imagen.getHeight(this);
		
			//Dibujo Imagen
			g.drawImage(imagen, 0, 0, null);
		}
	}
}
