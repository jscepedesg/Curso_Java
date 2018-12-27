package componentes_swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import eventos.Util;

public class Areasdetexto2 extends JFrame implements ActionListener{

	
	private JPanel PanelBotones;
	private JButton boton1,boton2;
	private JTextArea areatexto;
	private JScrollPane pnlBarra;
	
	public Areasdetexto2()
	{
		setSize(500,500);
		setTitle("UPC-Areas de texto");
		setResizable(false);
		
		setLayout(new BorderLayout());
		Util.centrarVentana(this);
		new JPanel();
		
		PanelBotones = new JPanel();
		
		boton1 = new JButton("Insertar");
		boton1.addActionListener(this);
		PanelBotones.add(boton1);
		
		boton2= new JButton("Salto linea");
		boton2.addActionListener(this);
		PanelBotones.add(boton2);
		add(PanelBotones,BorderLayout.SOUTH);
		
		areatexto = new JTextArea(8,20);
		
		pnlBarra = new JScrollPane(areatexto);
		add(pnlBarra,BorderLayout.CENTER);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Areasdetexto2 ventana = new Areasdetexto2();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object btnpuch = e.getSource();
		if(btnpuch==boton1)
		{
			areatexto.append("En un lugar de la mancha el nombre no quiero acordarme.....");//Agrega un texto
		}
		else
		{
			boolean saltar = !areatexto.getLineWrap();
			areatexto.setLineWrap(saltar);
			if(saltar==true)
			{
				boton2.setText("Quitar salto");
			}
			else
			{
				boton2.setText("Salto linea");
			}
		}
		
	}

	
}
