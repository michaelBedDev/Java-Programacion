package db_tarea_ud9;

import java.sql.Connection;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {

		try (Connection con = AccessToDB.getInstance()) {
			System.out.println("Conexión establecida");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
