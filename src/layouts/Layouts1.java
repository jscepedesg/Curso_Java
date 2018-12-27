package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import eventos.Util;

public class Layouts1 extends JFrame{

	private Layouts1()
	{
		setTitle("UPC-Layouts");
		setSize(500,500);
		//setResizable(false);
		
		Util.centrarVentana(this);
		
		PanelLayouts panellau = new PanelLayouts();
		//FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT,50,20);
		add(panellau,BorderLayout.NORTH);
		//panellau.setLayout(disposicion);
		PanelLayout2 panel2 = new PanelLayout2();
		add(panel2,BorderLayout.SOUTH);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layouts1 ventana = new Layouts1();

		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class PanelLayouts extends JPanel{
	
	public PanelLayouts()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Amarillo"),BorderLayout.NORTH);
		add(new JButton("Azul"), BorderLayout.SOUTH);
		
	}
	
}

class PanelLayout2 extends JPanel{
	
	public PanelLayout2()
	{
		setLayout(new BorderLayout());
		add(new JButton("Rojo"),BorderLayout.WEST);
		add(new JButton("Verde"),BorderLayout.EAST);
		add(new JButton("Negro"),BorderLayout.CENTER);
	}
}