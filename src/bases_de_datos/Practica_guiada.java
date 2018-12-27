package bases_de_datos;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;



public class Practica_guiada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame mimarco=new Marco_Aplicacion();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Aplicacion extends JFrame{
	
	public Marco_Aplicacion(){
		
		setTitle ("Consulta BBDD");
		
		setBounds(500,300,400,400);
		
		setLayout(new BorderLayout());
		
		JPanel menus=new JPanel();
		
		menus.setLayout(new FlowLayout());
		
		secciones=new JComboBox();
		
		secciones.setEditable(false);
		
		secciones.addItem("Todos");
		
		paises=new JComboBox();
		
		paises.setEditable(false);
		
		paises.addItem("Todos");
		
		resultado= new JTextArea(4,50);
		
		resultado.setEditable(false);
		
		add(resultado);
		
		menus.add(secciones);
		
		menus.add(paises);	
		
		add(menus, BorderLayout.NORTH);
		
		add(resultado, BorderLayout.CENTER);
		
		JButton botonConsulta=new JButton("Consulta");	
		
		add(botonConsulta, BorderLayout.SOUTH);
		botonConsulta.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) {
						
						resultado.setText("");
						setEjecutarCon();
					}
					
				});
		
		//Conecion con base de datos
		
		try
		{
			//1. Crear conexion 
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
			//2.Crear objecto Statement
			Statement mistatement = conexion.createStatement();
			//Realiza la consulta sin que se repitn valores
			String instruccion_sql = "select distinctrow nom_c from carrera";
			
			ResultSet miresultset = mistatement.executeQuery(instruccion_sql);
			
			while(miresultset.next())
			{
				secciones.addItem(miresultset.getString(1));
			}
			miresultset.close();
			//--------------------------------------------------------------------------
			//Realiza la consulta sin que se repitn valores
			instruccion_sql = "select distinctrow durac_c from carrera";
			
			miresultset = mistatement.executeQuery(instruccion_sql);
			
			while(miresultset.next())
			{
				paises.addItem(miresultset.getString(1));
			}
			miresultset.close();
		}
		catch(Exception e)
		{
			
		}
		
	}	
	
	private void setEjecutarCon()
	{
		ResultSet miresultset1 = null;
		
		try
		{
			String carrera=(String) secciones.getSelectedItem();
			String semestre=(String)paises.getSelectedItem();
			if(!carrera.equals("Todos") && semestre.equals("Todos"))
			{
				envia_con=conexion.prepareStatement(consul_carrera);
				envia_con.setString(1, carrera);
				miresultset1=envia_con.executeQuery();
			}
			else if(carrera.equals("Todos") && !semestre.equals("Todos"))
			{
				envia_semestre=conexion.prepareStatement(consul_semestre);
				envia_semestre.setString(1, semestre);
				miresultset1=envia_semestre.executeQuery();
			}
			else if(!carrera.equals("Todos") && !semestre.equals("Todos"))
			{
				envia_todo=conexion.prepareStatement(consul_todo);
				envia_todo.setString(1, carrera);
				envia_todo.setString(2, semestre);
				miresultset1=envia_todo.executeQuery();	
			}
			
			while(miresultset1.next())
			{
				resultado.append(miresultset1.getString(1));
				resultado.append(", ");
				resultado.append(miresultset1.getString(2));
				resultado.append(", ");
				resultado.append(miresultset1.getString(3));
				resultado.append("\n");
			}
			
		}
		catch(Exception e)
		{
			
		}
		
		
	}
		

	private Connection  conexion;
	private JComboBox secciones;
	private JComboBox paises;
	private JTextArea resultado;
	private PreparedStatement envia_con;
	private PreparedStatement envia_semestre;
	private PreparedStatement envia_todo;
	private final String consul_carrera="SELECT clave_c,nom_c,durac_c FROM carrera WHERE nom_c=? "; 
	private final String consul_semestre="SELECT clave_c,nom_c,durac_c FROM carrera WHERE durac_c=? ";
	private final String consul_todo="SELECT clave_c,nom_c,durac_c FROM carrera WHERE nom_c=? AND durac_c=?";

	
}
