package graficos_swing;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Creando_marcos2 {

	public static void main(String[] args) {
		
		Marcocentrado Marco =new Marcocentrado();
		Marco.setVisible(true);

	}

}

class Marcocentrado extends JFrame{
	
	
	public Marcocentrado(){
		
		Toolkit mipantalla=  Toolkit.getDefaultToolkit();
		Dimension tamañopantalla= mipantalla.getScreenSize();
		int alturapantalla=tamañopantalla.height;
		int anchopantalla= tamañopantalla.width;
		setSize(anchopantalla/2, alturapantalla/2);
		setLocation(anchopantalla/4, alturapantalla/4);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setResizable( false );	
		setTitle("UPC");
		Image MiIcono=mipantalla.getImage("Icono.png");//Icono
		setIconImage(MiIcono);//icono
		
	}
}
