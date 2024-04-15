package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prueba {

	public static void main(String[] args) {


		try {
			Connection conex = DriverManager
					.getConnection("jdbc:sqlite:L:\\Programacion\\nuevoEclipseWorkspace\\emb\\Lite");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try  {

			System.out.println("¡Conexión exitosa lite!");

		} catch (Exception e) {
			System.out.println("Error en la conexión:" + e.toString());
		}
		
		try (Connection conex2 = DriverManager
				.getConnection("jdbc:h2:L:\\Programacion\\nuevoEclipseWorkspace\\emb\\h2emb")) {

			System.out.println("¡Conexión exitosa h2!");

		} catch (Exception e) {
			System.out.println("Error en la conexión:" + e.toString());
		}
		
		
		try ( Connection conex2 = DriverManager
				.getConnection("jdbc:sqlite:L:\\Programacion\\nuevoEclipseWorkspace\\emb\\Lite"); Statement stmt = conex2.createStatement();) {
			
			String selectSql = "SELECT * FROM NewTable"; 
			try (ResultSet resultSet = stmt.executeQuery(selectSql)) {
				while (resultSet.next()) {
					System.out.println(resultSet.getInt("id"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		

	}

}
