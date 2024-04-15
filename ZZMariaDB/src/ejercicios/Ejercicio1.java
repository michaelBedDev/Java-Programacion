package ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio1 {
	public static void main(String[] args) {
		String sURL = "jdbc:mariadb://dbalumnos.sanclemente.local:3314/MCMEmpresa";

		try (Connection connection = DriverManager.getConnection(sURL, "alumno", "abc123..");) {

			String consulta1 = "SELECT salary, posicion FROM employees where emp_id = ?";
			try (PreparedStatement sentencia = connection.prepareStatement(consulta1)) {

				// SALARIO Y POSICION
				sentencia.setInt(1, /* PEDIR ID EMPLEADO */ 100);
				try (ResultSet resultSet = sentencia.executeQuery()) { //AQUI NO VA LA CONSULTA PORQUE ESTA PREPARADA
					while (resultSet.next()) {
						Empleado emp = new Empleado();
						emp.setSalary(resultSet.getDouble("salary")); //AQUI VA SIN COMILLAS numero de columna o nombre
						emp.setPosicion(resultSet.getString("posicion"));
						System.out.println(emp.toString());
					}
				}

			}

			// SALARIO TOTAL DE EMPLEADOS
			String consulta2 = "SELECT sum(salary) from employees";
			try (Statement sentencia = connection.createStatement()) {
				try (ResultSet resultSet = sentencia.executeQuery(consulta2)) {
					while (resultSet.next()) {
						System.out.println("El salario total es de " + resultSet.getDouble(1));
					}
				}
			}

			// NUMERO DE EMPLEADOS POR CONDICION
			String consulta3 = "Select count(emp_id) from employees where salary > ? " + "and posicion = ?";
			try (PreparedStatement sentencia = connection.prepareStatement(consulta3)) {
				sentencia.setDouble(1, /* PEDIR SALARIO */20000);
				sentencia.setString(2, "secretario");
				try (ResultSet resultSet = sentencia.executeQuery()) {
					while (resultSet.next()) {
						System.out.println(
								"El total de empleados por condición es de " + resultSet.getInt(1) + " empleados");
					}
				}
			}
		}
		// Handle any errors that may have occurred.
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

//Partiendo del ejemplo anterior, nos piden una pequeña aplicación 
//que nos permita conocer el salario y su posición 
//a partir del id del empleado (se recoge por teclado). 
//Resultado por pantalla.
//
//Posteriormente el total del gasto en salario de la empresa.
//
//Y por último cuantos empleados tienen más que un salario 
//(se pide por teclado) y una posición (también se pide por teclado).