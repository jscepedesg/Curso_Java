package componentes_swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import graficos_swing.Util;

public class Menus extends JFrame{

	
	Menus()
	{
		setTitle("UPC-Menus");
		setSize(500,500);
		setResizable(false);
		
		Util.centrarVentana(this);
		
		PanelMenu pnlMenu = new PanelMenu();
		add(pnlMenu);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menus ventana = new Menus();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

}
class PanelMenu extends JPanel
{
	
	PanelMenu()
	{
		
		setLayout(new BorderLayout());
		JMenuBar barramenu = new JMenuBar();//Crear la barra del menu
		JMenu archivo = new JMenu("Archivo");//Crear una un menu
		JMenu edicion = new JMenu("Edicion");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu("Opciones");
		
		JMenuItem guardar = new JMenuItem("Guardar");//Agrega un item a un menu
		JMenuItem guardarcomo = new JMenuItem("Guardar Como");
		archivo.add(guardar);archivo.add(guardarcomo);
		
		JMenuItem cortar = new JMenuItem("Cortar",new ImageIcon("src/imagenes/Cortar.png"));
		JMenuItem copiar = new JMenuItem("Copiar",new ImageIcon("src/imagenes/Copiar.png"));
		JMenuItem pegar = new JMenuItem("Pegar",new ImageIcon("src/imagenes/Pegar.png"));
		//pegar.setHorizontalTextPosition(SwingConstants.LEFT);
		edicion.add(cortar);edicion.add(copiar);edicion.add(pegar);
		edicion.addSeparator();//Crear una separacion entre elementos
		edicion.add(opciones);
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		JMenuItem generales = new JMenuItem("Generales");
		herramientas.add(generales);
		
		barramenu.add(archivo);barramenu.add(edicion);barramenu.add(herramientas);
		add(barramenu,BorderLayout.NORTH);
		
		
	}
	
}