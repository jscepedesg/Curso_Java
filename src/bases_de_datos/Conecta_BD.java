package bases_de_datos;

import java.sql.*;
import java.sql.DriverManager;

public class Conecta_BD {

	public static void main(String[] args) {
		
		try
		{
			//1. Crear conexion 
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
			//2.Crear objecto Statement
			Statement mistatement = conexion.createStatement();
			//Ejecutar Sql
			//String ca="carrera";
			ResultSet miresultset = mistatement.executeQuery("select * from carrera");
			//Recorrer el resulset
			while(miresultset.next())
			{
				System.out.println(miresultset.getString("clave_c")+" "+miresultset.getString("nom_c")+" "+miresultset.getString("durac_c"));
			}
			conexion.close();
		}
		catch(Exception e)
		{
			System.out.println("No se pudo conectar");
		}

	}

}
