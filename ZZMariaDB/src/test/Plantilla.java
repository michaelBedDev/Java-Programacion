package test;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Plantilla {
	public static void main(String[] args) {
		String sURL = "jdbc:mariadb://dbalumnos.sanclemente.local:3314/MCMEmpresa";

		try (Connection connection = DriverManager.getConnection(sURL, "alumno", "abc123..");) {
			// Code here
		}
		// Handle any errors that may have occurred.
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void openConnection() {
		String sURL = "jdbc:mariadb://dbalumnos.sanclemente.local:3319/test";
		try {

			Connection con = DriverManager.getConnection(sURL, "xxxx", "xxxx");
			System.out.println("¡Conexión exitosa!");

		} catch (Exception e) {
			System.out.println("Error en la conexión:" + e.toString());
		}
	}

	public void closeConnection(Connection con) {
		try {

			if (con != null)
				con.close();
		} catch (Exception e) {
			System.out.println("Error cerrando conexiones: " + e.toString());
		}
	}

	//RESULTSET ES SOLO PARA CONSULTAS NO PARA ACTUALIZAR INFO
}
