package componentes_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import graficos_swing.Util;

public class Areasdetexto extends JFrame{

	public Areasdetexto()
	{
		setSize(500,500);
		setTitle("UPC-Areas de texto");
		setResizable(false);
		
		Util.centrarVentana(this);
		
		PanelTexto1 pnltexto = new PanelTexto1();
		add(pnltexto);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Areasdetexto ventana = new Areasdetexto();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class PanelTexto1 extends JPanel implements ActionListener {
	
	private JTextArea miarea;
	public PanelTexto1()
	{
	    miarea = new JTextArea(8,20);
		JScrollPane barras = new JScrollPane(miarea);
		miarea.setLineWrap(true);//NO crece en su anchura
		add(barras);
		JButton boton1 = new JButton("Click");
		boton1.addActionListener(this);
		add(boton1);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(miarea.getText());
	}
	
}
