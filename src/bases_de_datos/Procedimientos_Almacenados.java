package bases_de_datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Procedimientos_Almacenados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			//1. Crear conexion 
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
			//Ejecutar procedimientos almacenados
			CallableStatement sentencia = conexion.prepareCall("{call muestra_mat}");
			ResultSet miresultset = sentencia.executeQuery();
			
			while(miresultset.next())
			{
				System.out.println(miresultset.getString(1)+"  "+miresultset.getString(2)+"  "+miresultset.getString(3));
			}
			miresultset.close();
		}
		catch(Exception e)
		{
			
		}
	}
	
	private static Connection  conexion;

}


