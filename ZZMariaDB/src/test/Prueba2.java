package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Prueba2 {

	Connection con = null;
	String sURL = "jdbc:mariadb://dbalumnos.sanclemente.local:3319/test";
	{
		try {

			con = (Connection) DriverManager.getConnection(sURL, "xxxx", "xxxx");
			System.out.println("¡Conexión exitosa!");

		} catch (Exception e) {
			System.out.println("Error en la conexión:" + e.toString());
		} finally {
			try {
				// Cerramos posibles conexiones abiertas
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println("Error cerrando conexiones: " + e.toString());
			}
		}
	}
}
