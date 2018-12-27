package componentes_swing;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import graficos_swing.Util;

public class MenuEmergentes extends JFrame{

	MenuEmergentes()
	{
		setTitle("UPC-Menús Emergentes");
		setResizable(false);
		setSize(500,500);
		
		Util.centrarVentana(this);
		
		 PanelEmergenteMenu pnlemergentemenu = new  PanelEmergenteMenu();
		 add(pnlemergentemenu);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuEmergentes ventana = new MenuEmergentes();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class PanelEmergenteMenu extends JPanel
{
	 PanelEmergenteMenu()
	 {
		 
		 setLayout(new BorderLayout());
		//----------------Crea un lamina para el menu----------------------------------------------------------
				
				JPanel laminamenu = new JPanel();
				
		//----------------Crea un barra para el menu-----------------------------------------------------------
				JMenuBar barra = new JMenuBar();
				
		//----------------Crea los menus que va a tener la barra-----------------------------------------------
			   JMenu fuente = new JMenu("Fuente");
			   JMenu estilo = new JMenu("Estilo");
			   JMenu tamaño = new JMenu("Tamaño");
				
			 //----------------Agrega los menus a la barra----------------------------------------------------------
				barra.add(fuente);barra.add(estilo);barra.add(tamaño);
				add(barra,BorderLayout.NORTH);
				
				JTextPane area = new JTextPane();
				//area.setLineWrap(true);
				//area.setWrapStyleWord(true);
				JScrollPane pnlBarra = new JScrollPane(area);
				
				add(pnlBarra,BorderLayout.CENTER);
				
		 //Creacion de menus emergentes
		 JPopupMenu emergente = new JPopupMenu();
		 
		 JMenuItem cortar = new JMenuItem("Cortar",new ImageIcon("src/imagenes/Cortar.png"));
		 JMenuItem copiar = new JMenuItem("Copiar",new ImageIcon("src/imagenes/Copiar.png"));
		 JMenuItem pegar = new JMenuItem("Pegar",new ImageIcon("src/imagenes/Pegar.png"));
		 emergente.add(cortar);emergente.add(copiar);emergente.add(pegar);
		 //Funcione al hacer click en la lamina
		 area.setComponentPopupMenu(emergente);
	 }
}
