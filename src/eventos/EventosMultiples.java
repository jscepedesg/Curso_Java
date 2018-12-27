package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class EventosMultiples extends JFrame{
	
	public EventosMultiples()
	{
		
		setSize(500,500);
		setTitle("Evetos multiples");
		setResizable(false);
		Util.centrarVentana(this);
		
		PanelEventosMultiples panel = new PanelEventosMultiples();
		add(panel);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventosMultiples ventana = new EventosMultiples();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class PanelEventosMultiples extends JPanel{
	
	public PanelEventosMultiples()
	{
		
		ActionColor actionamarillo = new  ActionColor("Amarillo",new ImageIcon("src/imagenes/Amarillo.jpg"),Color.YELLOW);
		ActionColor actionazul = new  ActionColor("Azul",new ImageIcon("src/imagenes/Azul.jpg"),Color.BLUE);
		ActionColor actionrojo = new  ActionColor("Rojo",new ImageIcon("src/imagenes/Rojo.jpg"),Color.RED);
		
		
		//JButton botonamarillo = new JButton(actionamarillo);
		
		add(new JButton(actionamarillo));
		add(new JButton(actionazul));
		add(new JButton(actionrojo));
		
		/*JButton botonamarillo = new JButton("Amarillo");
		JButton botonazul = new JButton("Azul");
		JButton botonrojo = new JButton("Rojo");
		
		add(botonamarillo);add(botonazul);add(botonrojo);*/	
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo", actionamarillo);
		mapaAccion.put("fondo_azul", actionazul);
		mapaAccion.put("fondo_rojo", actionrojo);
		
	}
	
	private class ActionColor extends AbstractAction{

		public ActionColor(String nombre,Icon icono,Color colorboton)
		{
			
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION,"Poner la lamina de color "+nombre);
			putValue("color_de_fondo",colorboton);
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			Color c = (Color) getValue("color_de_fondo");
			setBackground(c);
			System.out.println("Nombre: "+getValue(Action.NAME));
			
			
		}
		
		
		
	}
	
}


