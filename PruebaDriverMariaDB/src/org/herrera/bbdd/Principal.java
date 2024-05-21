package org.herrera.bbdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		try {
			// Establezco la conexión
			Connection conexion = DriverManager.getConnection("jdbc:mariadb://192.168.1.200:3306/?user=boss&password=b123");
			
			// Statement: Objeto utilizado para lanzar sentencias a través de esa conexión
			Statement sentencia = conexion.createStatement();
			
			sentencia.execute("USE liga");
			
			// Resultset: Objeto utilizado para guardar conjuntos de resultados
			ResultSet resultados = sentencia.executeQuery("SELECT * FROM sedes");
			while (resultados.next()) {
				System.out.printf("%-12s %-12s %-15s %-12s \n", resultados.getString(1), resultados.getString(2), resultados.getString(3), resultados.getString(4));
			}

			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
