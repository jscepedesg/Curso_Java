package componentes_swing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import eventos.Util;

public class BotonesDeRadio extends JFrame {

	
	BotonesDeRadio()
	{
	
		setSize(500,500);
		setResizable(false);
		setTitle("UPC-RadioButton");
		Util.centrarVentana(this);
		
		PanelBotones pnlBotonesradio = new PanelBotones();
		add(pnlBotonesradio);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BotonesDeRadio ventana = new BotonesDeRadio();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);

	}

}

class PanelBotones  extends JPanel
{
	
	PanelBotones()
	{
		
		ButtonGroup grupo1 = new ButtonGroup();
		ButtonGroup grupo2 = new ButtonGroup();
		
		JRadioButton boton1 = new  JRadioButton("Azul",false);
		JRadioButton boton2 = new  JRadioButton("Rojo",false);
		JRadioButton boton3 = new  JRadioButton("Verde",false);
		
		JRadioButton boton4 = new  JRadioButton("Masculino",false);
		JRadioButton boton5 = new  JRadioButton("Femenino",false);
		
		
		grupo1.add(boton1);grupo1.add(boton2);grupo1.add(boton3);
		grupo2.add(boton4);grupo2.add(boton5);
		
		add(boton1);add(boton2);add(boton3);add(boton4);add(boton5);
		
	}
	
}
