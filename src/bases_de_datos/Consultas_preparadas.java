package bases_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas_preparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			//1.Crear la conexion 
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
			//2. Preparar la consulta
			PreparedStatement mi_sentencia=conexion.prepareStatement("SELECT clave_c,nom_c,durac_c FROM carrera WHERE durac_c=?");
			//3. Establecer parametros de consulta
			mi_sentencia.setFloat(1,3);
			//4. Ejecutar y recorer consulta
			ResultSet miresultset = mi_sentencia.executeQuery();
			while(miresultset.next())
			{
				System.out.println(miresultset.getString(1)+" "+miresultset.getString(2)+" "+miresultset.getString(3));
			}
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de conexion");
		}
	}

}
