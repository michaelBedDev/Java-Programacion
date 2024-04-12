package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnectToMariaDB {

	public static void main(String[] args) {
		String url = "jdbc:mariadb://dbalumnos.sanclemente.local:3314/MCMEmpresa";

		Connection con = null;
		try {

			con = (Connection) DriverManager.getConnection(url, "alumno", "abc123..");
			System.out.println("¡Conexión exitosa!");

			try (Statement stmt = con.createStatement()) {
				String selectSql = "SELECT * emp_id, name, posicion, salary FROM employees";
				List<Employee> employees = new ArrayList<>();
				try (ResultSet resultSet = stmt.executeQuery(selectSql)) {
					while (resultSet.next()) {
						Employee emp = new Employee();
						emp.setId(resultSet.getInt("id"));
						emp.setName(resultSet.getString("name"));
						emp.setPosicion(resultSet.getString("posicion"));
						emp.setSalary(resultSet.getDouble(4));
						employees.add(emp);
					}
					employees.forEach(System.out::println);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

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
