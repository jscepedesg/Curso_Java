package componentes_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import graficos_swing.Util;

public class Barra_de_herramientas extends JFrame
{

	
	private JPanel lamina;
	
	public Barra_de_herramientas()
	{
		
		setTitle("Marco con Barra");
		setSize(500,500);
		setResizable(false);
		Util.centrarVentana(this);
		
		lamina=new JPanel();
		
		add(lamina);
		
		// configuración de acciones
		
		Action accionAzul =new AccionColor("Azul", new ImageIcon("src/imagenes/Azul.jpg"), Color.BLUE);
		
		Action accionAmarillo =new AccionColor("Amarillo", new ImageIcon("src/imagenes/Amarillo.jpg"), Color.YELLOW);
		
		Action accionRojo =new AccionColor("Rojo", new ImageIcon("src/imagenes/Rojo.jpg"), Color.RED);
		Action salir = new AbstractAction("Salir",new ImageIcon("src/imagenes/Salir.png")){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		};
		JMenu menu = new JMenu("Color");
		menu.add(accionAzul);menu.add(accionAmarillo);menu.add(accionRojo);
		JMenuBar barramenu = new JMenuBar();
		barramenu.add(menu);
		setJMenuBar(barramenu);
		
		//-------------Construcion de la barra de herramientas-----------------------------------
		JToolBar barra = new JToolBar();
		barra.add(accionAzul);
		barra.add(accionAmarillo);
		barra.add(accionRojo);
		barra.addSeparator();
		barra.add(salir);
		add(barra,BorderLayout.NORTH);
		
		
	}
		
	
	private class AccionColor extends AbstractAction
	{
		
		public AccionColor(String nombre, Icon icono, Color c){
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);
			
			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Color c=(Color) getValue("Color");
			
			lamina.setBackground(c);
			
		}		
		
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barra_de_herramientas mimarco=new Barra_de_herramientas();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
