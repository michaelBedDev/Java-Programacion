package controller;

import java.sql.Connection;
import java.sql.SQLException;

import data.AccessToDB;
import data.ModifyDB;
import view.View;

public class App {

	public static void main(String[] args) {

		try (Connection con = AccessToDB.getInstance()) {
			System.out.println("Conexión establecida con la Base de Datos");

			ModifyDB tasks = new ModifyDB();
			View view = new View();
			Controller controller = new Controller(tasks, view);
			controller.seleccionarAccion();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
