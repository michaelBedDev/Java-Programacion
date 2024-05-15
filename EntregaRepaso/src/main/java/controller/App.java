package controller;

import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		try {
			Controller controller = new Controller();
			controller.start();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
