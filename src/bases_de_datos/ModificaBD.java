package bases_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ModificaBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			//1. Crear conexion 
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
			//2.Crear objecto Statement
			Statement mistatement = conexion.createStatement();
			
			//Insertar valores
			//String instruccion_sql = "insert into carrera values (5,'Ing de Mercados',4)";
			
			//Modificar valores
			String instruccion_sql = "update carrera set durac_c=5 where clave_c=5";
			//Eliminar valores
		//	String instruccion_sql = "delete from carrera where clave_c=5";
		    mistatement.executeUpdate(instruccion_sql);
			//System.out.println("Datos insertados correctamente");
		   // System.out.println("Datos actualizados correctamente");
		    System.out.println("Datos Eliminados");
		    
		}
		catch(Exception e)
		{
			System.out.println("No se pudo conectar");
		}
	}

}
