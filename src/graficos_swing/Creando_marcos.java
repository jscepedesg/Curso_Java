package graficos_swing;
import java.awt.Frame;

import javax.swing.*;



   
public class Creando_marcos {
	 
	 
	public static void main(String[] args) {
		
		Mimarco marco1=new Mimarco();
		marco1.setVisible(true);

	}

}

 class Mimarco extends JFrame{
	
	 public Mimarco(){
		 
		 //Configuracion framer
		 
	    // setSize(500,300);  //Tama�o de el frame
	    //setLocation(500,300);   //Localizacion del framer
		// setResizable(false);  //Evita redimencional el framer
		// setExtendedState(Frame.MAXIMIZED_BOTH);  // abrir a tama�o completo
		 setBounds(500,300,550,250);   //Tama�o y localizacion del framer
		 setTitle("UPC");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminar programa al cerrar la ventana
	
		 
	 }

	
	 
}
