package db_tarea_ud9;

import java.sql.Connection;

import java.sql.SQLException;

import userAndMenu.Menu;
import userAndMenu.Usuario;

public class App {

	public static void main(String[] args) {

		try (Connection con = AccessToDB.getInstance()) {
			System.out.println("Conexión establecida con la Base de Datos");
			
			ModifyDB tasks = new ModifyDB();
			Usuario user = new Usuario();
			Menu menu = new Menu();
			
			menu.seleccionarAccion(tasks, user);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
