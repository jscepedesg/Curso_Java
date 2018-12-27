package procesador_de_texto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

import graficos_swing.Util;

public class InterfazApp_Procesador extends JFrame{
	
	InterfazApp_Procesador()
	{
		
		setSize(500,500);
		setTitle("UPC-Procesador de texto");
		setResizable(true);
		
		Util.centrarVentana(this);
		
		PanelProcesador pnlProcesador = new PanelProcesador();
		add(pnlProcesador);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfazApp_Procesador ventana = new InterfazApp_Procesador();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class PanelProcesador extends JPanel 
{
	//Atributos
	private JTextPane area;
	private Font letras;
	private JMenu fuente,estilo,tamaño;
	private JScrollPane pnlBarra;
	
	PanelProcesador()
	{
		setLayout(new BorderLayout());
//----------------Crea un lamina para el menu----------------------------------------------------------
		
		JPanel laminamenu = new JPanel();
		
//----------------Crea un barra para el menu-----------------------------------------------------------
		JMenuBar barra = new JMenuBar();
		
//----------------Crea los menus que va a tener la barra-----------------------------------------------
	    fuente = new JMenu("Fuente");
	    estilo = new JMenu("Estilo");
		tamaño = new JMenu("Tamaño");
		
		configura_menu("Arial","fuente","Arial",9,10,"");
		configura_menu("Courier","fuente","Courier",9,10,"");
		configura_menu("Verdana","fuente","Verdana",9,10,"");
		//Forma Normal
		configura_menu("Negrita","estilo","",Font.BOLD,10,"src/imagenes/Negrita.png");
		configura_menu("Cursiva","estilo","",Font.ITALIC,10,"src/imagenes/Cursiva.png");
		{/*
		//Forma con checkbox----------------------
		JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita",new ImageIcon("src/imagenes/Negrita.png"));
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva",new ImageIcon("src/imagenes/Cursiva.png"));
		estilo.add(negrita);estilo.add(cursiva);
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		*/
		}
		//Forma normal
		configura_menu("12","tamaño","",9,12,"");
		configura_menu("16","tamaño","",9,16,"");
		configura_menu("20","tamaño","",9,20,"");
		configura_menu("24","tamaño","",9,24,"");
		{/*
		//Forma con RadioButton-------------------------
		ButtonGroup grupo = new ButtonGroup();
		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem diese = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem ven = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem vencu = new JRadioButtonMenuItem("24");
		
		grupo.add(doce);grupo.add(diese);grupo.add(ven);grupo.add(vencu);
		tamaño.add(doce);tamaño.add(diese);tamaño.add(ven);tamaño.add(vencu);
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 12));
		diese.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 16));
		ven.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 20));
		vencu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 24));*/
			
			
		}
		
//----------------Agrega los menus a la barra----------------------------------------------------------
		barra.add(fuente);barra.add(estilo);barra.add(tamaño);
//----------------Agrega la barra al panel del menu----------------------------------------------------
		/*laminamenu.*/add(barra,BorderLayout.NORTH);
//----------------Agrega la lamina del menu al panel principal-----------------------------------------
		//add(laminamenu,BorderLayout.NORTH);
		area = new JTextPane();
		//area.setLineWrap(true);
		//area.setWrapStyleWord(true);
		pnlBarra = new JScrollPane(area);
		
		add(pnlBarra,BorderLayout.CENTER);
				
        JPopupMenu emergente = new JPopupMenu();
		 //
		 JMenuItem negritae = new JMenuItem("Negrita",new ImageIcon("src/imagenes/Negrita.png"));
		 JMenuItem cursivae = new JMenuItem("Cursiva",new ImageIcon("src/imagenes/Cursiva.png"));
		 
		 //
		 negritae.addActionListener(new StyledEditorKit.BoldAction());
		 cursivae.addActionListener(new StyledEditorKit.ItalicAction());
		 emergente.add(negritae);emergente.add(cursivae);
		 //
		 emergente.addSeparator();
		 //
         JMenu fuente = new JMenu("Fuente");
		 
		 JMenuItem arial = new JMenuItem("Arial");
		 JMenuItem courier = new JMenuItem("Courier");
		 JMenuItem verdana = new JMenuItem("Verdana");
		 
		 arial.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
			courier.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier"));
			verdana.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
			emergente.add(fuente);
			fuente.add(arial);fuente.add(courier);fuente.add(verdana);
		 //
			 emergente.addSeparator();
	     //
		 JMenu tamaño = new JMenu("Tamaño");
		 
		 JMenuItem doce = new JMenuItem("12");
		 JMenuItem diese = new JMenuItem("16");
		 JMenuItem ven = new JMenuItem("20");
		 JMenuItem vencu = new JMenuItem("24");
		 
		 doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 12));
			diese.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 16));
			ven.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 20));
			vencu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 24));
			emergente.add(tamaño);
			tamaño.add(doce);tamaño.add(diese);tamaño.add(ven);tamaño.add(vencu);
		 
		 //Funcione al hacer click en la lamina
		 area.setComponentPopupMenu(emergente);
		 
		 //----------------Construccion barra de herramientas-------------------------------
		 
		 //Instacia la clase
		 JToolBar barrah = new JToolBar();
		 //Crea botones
		 JButton negritabarra = new JButton(new ImageIcon("src/imagenes/Negrita.png"));
		 JButton cursivabarra = new JButton(new ImageIcon("src/imagenes/Cursiva.png"));
		 JButton subrabarra = new JButton(new ImageIcon("src/imagenes/subrayado.png"));
		 
		 JButton azulbarra = new JButton(new ImageIcon("src/imagenes/Azul.jpg"));
		 JButton rojabarra = new JButton(new ImageIcon("src/imagenes/Rojo.jpg"));
		 JButton amarillabarra = new JButton(new ImageIcon("src/imagenes/Amarillo.jpg"));
		 
		 JButton cenbarra = new JButton(new ImageIcon("src/imagenes/cen.png"));
		 JButton izqbarra = new JButton(new ImageIcon("src/imagenes/izq.png"));
		 JButton derbarra = new JButton(new ImageIcon("src/imagenes/der.png"));
		 JButton jusbarra = new JButton(new ImageIcon("src/imagenes/jus.png"));
		 
		 negritabarra.addActionListener(new StyledEditorKit.BoldAction());
		 cursivabarra.addActionListener(new StyledEditorKit.ItalicAction());
		 subrabarra.addActionListener(new StyledEditorKit.UnderlineAction());
		 
		 azulbarra.addActionListener(new StyledEditorKit.ForegroundAction("Azul", Color.BLUE));
		 rojabarra.addActionListener(new StyledEditorKit.ForegroundAction("Rojo", Color.RED));
		 amarillabarra.addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.YELLOW));
		 
		 cenbarra.addActionListener(new StyledEditorKit.AlignmentAction("Centrado", 1));
		 izqbarra.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
		 derbarra.addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
		 jusbarra.addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
		 //Agrega botones al la barra
		 barrah.add(negritabarra);
		 barrah.add(cursivabarra);
		 barrah.add(subrabarra);
		 barrah.addSeparator();
		 barrah.add(azulbarra);
		 barrah.add(rojabarra);
		 barrah.add(amarillabarra);
		 barrah.addSeparator();
		 barrah.add(cenbarra);
		 barrah.add(izqbarra);
		 barrah.add(derbarra);
		 barrah.add(jusbarra);
		 barrah.setOrientation(1);
		 
		 //Agrega barrah
		 add(barrah,BorderLayout.WEST);
		 
		 
	}
	public void configura_menu(String rotulo,String menu,String tipo_letra,int estilos,int tam,String ruta_img)
	{
		JMenuItem elem_menu = new JMenuItem(rotulo,new ImageIcon(ruta_img));
		if(menu=="fuente")
		{
			fuente.add(elem_menu);
			if(tipo_letra=="Arial")
			{
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
			}
			else if(tipo_letra=="Courier")
			{
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier"));
			}
			else if(tipo_letra=="Verdana")
			{
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
			}
		}
		else if (menu=="estilo")
		{
			estilo.add(elem_menu);
			if(estilos==Font.BOLD)
			{
				//Atajos de teclado del evento
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}
			else if(estilos==Font.ITALIC)
			{
				elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
		}
		else if (menu=="tamaño")
		{
			tamaño.add(elem_menu);
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));
		}
		
		//elem_menu.addActionListener(new Gestion_menu(rotulo,tipo_letra,estilos,tam));
	}
	
	private class Gestion_menu implements ActionListener
	{

		String tipo_texto,menu;
		int estilo_letra,tamaño_letra;
		
		Gestion_menu(String elemento,String texto2,int estilo2,int tam_letra)
		{
			this.tipo_texto=texto2;
			this.estilo_letra=estilo2;
			this.tamaño_letra=tam_letra;
			this.menu=elemento;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			letras=area.getFont();
			if(menu=="Arial"|| menu=="Courier"||menu=="Verdana")
			{
				estilo_letra=letras.getStyle();
				tamaño_letra=letras.getSize();
			}
			else if(menu=="Cursiva"||menu=="Negrita")
			{
				if(letras.getStyle()==1||letras.getStyle()==2)
				{
					estilo_letra=3;
				}
				tipo_texto=letras.getFontName();
				tamaño_letra=letras.getSize();
			}
			else if(menu=="12"||menu=="16"||menu=="20"||menu=="24")
			{
				estilo_letra=letras.getStyle();
				tipo_texto=letras.getFontName(); 
			}
			area.setFont(new Font(tipo_texto,estilo_letra,tamaño_letra));
			
			
			
		}
		
	}
}