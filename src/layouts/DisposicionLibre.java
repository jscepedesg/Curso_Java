package layouts;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import graficos_swing.Util;

public class DisposicionLibre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana ventana = new Ventana();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

}

class Ventana extends JFrame
{
	public Ventana()
	{
		setTitle("Libre");
		setSize(300,500);
		Util.centrarVentana(this);
		
		Lamina1 lamina = new Lamina1();
		add(lamina);
	}
}

class Lamina1 extends JPanel
{
	public Lamina1()
	{
		//setLayout(null);
		setLayout(new Encolumnas());
		
		JButton boton1 = new JButton("Boton 1");
		//boton1.setBounds(10, 10, 150, 50);
		add(boton1);
		JButton boton2 = new JButton("Boton 2");
		//boton1.setBounds(10, 10, 150, 50);
		add(boton2);
		JButton boton3 = new JButton("Boton 3");
		//boton1.setBounds(10, 10, 150, 50);
		add(boton3);
		JButton boton4 = new JButton("Boton 4");
		//boton1.setBounds(10, 10, 150, 50);
		add(boton4);
	}
}

class Encolumnas implements LayoutManager
{

	private int x;
	private int y=20;
	
	public void addLayoutComponent(String e, Component arg1) {
		
		
	}

	
	public void layoutContainer(Container e) {
		
		int d=e.getWidth();
		x=d/2;
		int contador =0;
		int n=e.getComponentCount();
		for(int i =0;i<n;i++)
		{
			contador++;
			Component c =e.getComponent(i);
			c.setBounds(x-100, y, 100, 20);
			x+=110;
			
			if(contador%2==0)
			{
				x=d/2;
				y+=40;
			}
		}
	}

	
	public Dimension minimumLayoutSize(Container e) {
		
		return null;
	}

	
	public Dimension preferredLayoutSize(Container e) {
		
		return null;
	}

	
	public void removeLayoutComponent(Component e) {
		
		
	}
	
}