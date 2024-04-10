package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) {
		
		
		
		Connection con = null;
		String sURL = "jdbc:mariadb://dbalumnos.sanclemente.local:3314/test";
		  try {

		      con = (Connection) DriverManager.getConnection(sURL,"alumno","abc123..");
		      System.out.println ("¡Conexión exitosa!");

		        } catch (Exception e) { 
		     System.out.println("Error en la conexión:" + e.toString() );
		  } finally {
		  try {
		      // Cerramos posibles conexiones abiertas
		      if (con!=null) con.close();    
		  } catch (Exception e) {
		      System.out.println("Error cerrando conexiones: "
		        + e.toString());
		  } 
		}
		
	}
}
