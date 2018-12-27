package layouts;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import eventos.Util;

public class Layouts2Cal extends JFrame {

	Layouts2Cal()
	{
		setTitle("Calculadora");
		setResizable(false);
		setSize(500,300);
		
		Util.centrarVentana(this);
		
		PanelCalculadora pnlCalculadora = new PanelCalculadora();
		add(pnlCalculadora);
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Layouts2Cal jframe = new Layouts2Cal();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}

}

class PanelCalculadora extends JPanel{
	
	private JButton pantalla;
	private JPanel panelteclas;
	private boolean principio;
	private double resultado;
	private String ultimaoperacion;
	
	public PanelCalculadora()
	{
		setLayout(new BorderLayout());
	    pantalla = new JButton("0");
		
	    principio=true;
	    ultimaoperacion="=";
	    
		pantalla.setEnabled(false);//Quitar atributos a boton
		add(pantalla,BorderLayout.NORTH);//Ubicar el boton
		
		panelteclas = new JPanel();
		panelteclas.setLayout(new GridLayout(4,4));
		
		ActionListener insertar= new Insertanumero();
		ActionListener orden = new Accionorden();
		
		setPonerboton("7",insertar);
		setPonerboton("8",insertar);
		setPonerboton("9",insertar);
		setPonerboton("/",orden);
		
		setPonerboton("4",insertar);
		setPonerboton("5",insertar);
		setPonerboton("6",insertar);
		setPonerboton("*",orden);
		
		setPonerboton("1",insertar);
		setPonerboton("2",insertar);
		setPonerboton("3",insertar);
		setPonerboton("-",orden);
		
		setPonerboton("0",insertar);
		setPonerboton(".",orden);
		setPonerboton("=",orden);
		setPonerboton("+",orden);
		
		add(panelteclas, BorderLayout.CENTER);
	}
	
	private void setPonerboton(String rotulo,ActionListener oyente)
	{
		
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente);
		panelteclas.add(boton);
	}
	
	private class Insertanumero implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			String entrada = e.getActionCommand();
			
			if(principio){
				pantalla.setText("");
				principio=false;
			}
			pantalla.setText(pantalla.getText()+entrada);
			
		}
		
	}
	
	private class Accionorden implements  ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			String operacion = e.getActionCommand();
			calcular(Double.parseDouble(pantalla.getText()));
			ultimaoperacion=operacion;
			principio=true;
			
		}
		
		public void calcular(Double x)
		{
			
			if(ultimaoperacion.equals("+"))
			{
				resultado+=x;
			}
			else if(ultimaoperacion.equals("-"))
			{
				resultado-=x;
			}
			else if(ultimaoperacion.equals("*"))
			{
				resultado*=x;
			}
			else if(ultimaoperacion.equals("/"))
			{
				resultado/=x;
			}
			else if(ultimaoperacion.equals("="))
			{
				resultado=x;
			}
			
			pantalla.setText(""+resultado);
		}
		
	}
	
}


