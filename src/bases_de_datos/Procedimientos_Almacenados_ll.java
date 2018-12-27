package bases_de_datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Procedimientos_Almacenados_ll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tiempo = Float.parseFloat(JOptionPane.showInputDialog("Introduce tiempo"));
		String carrera=JOptionPane.showInputDialog("Introduce nombre articulo");
		
		try
		{
			//1. Crear conexion 
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
			//Ejecutar procedimientos almacenados con envio de parametros
			CallableStatement sentencia = conexion.prepareCall("{call Actualiza_pre(?, ?)}");
			sentencia.setFloat(1, tiempo);
			sentencia.setString(2, carrera);
			sentencia.execute();
		}
		catch(Exception e)
		{
			
		}
	}
	private static Connection  conexion;
}
