package ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

public class Ejercicio2 implements IPerson<Person> {

	public static void main(String[] args) {

		Ejercicio2 main = new Ejercicio2();

		try (Connection con = main.openConnectionPool()) {

			Person miguel = new Person(99, "Miguel", "Caamaño", 23);
			main.insertPerson(con, miguel);

			main.updatePersonAgeById(con, 99, 24);
			List<Person> listaPersonas = main.selectAllPeople(con);
			System.out.println(Arrays.asList(listaPersonas));

			main.deletePerson(con, 99);
			System.out.println(main.maxAgePerson(con).toString());

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Connection openConnection() throws SQLException {
		String sURL = "jdbc:mariadb://dbalumnos.sanclemente.local:3314/MCMEmpresa";

		Connection con = DriverManager.getConnection(sURL, "alumno", "abc123..");
		System.out.println("¡Conexión exitosa!");
		return con;
	}

	public Connection openConnectionPool() throws SQLException {

		try (// Configurar el pool de conexiones
				BasicDataSource dataSource = new BasicDataSource()) {
			dataSource.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/MCMEmpresa");
			dataSource.setUsername("alumno");
			dataSource.setPassword("abc123..");
			dataSource.setInitialSize(5);
			dataSource.setMaxTotal(10);

			// Obtener una conexión del pool
			return dataSource.getConnection();
		}

	}

	@Override
	public int insertPerson(Connection connection, Person person) throws SQLException {
		try (PreparedStatement stmt = connection
				.prepareStatement("INSERT INTO person " + "(id, name, lastname, age) " + "values(?,?,?,?)")) {

			stmt.setInt(1, person.getId());
			stmt.setString(2, person.getName());
			stmt.setString(3, person.getLastName());
			stmt.setInt(4, person.getAge());

			return stmt.executeUpdate();
		}
	}

	@Override
	public void updatePersonAgeById(Connection connection, int id, int newAge) throws SQLException {

		try (PreparedStatement stmt = connection.prepareStatement("UPDATE person SET age = ? WHERE id = ? ")) {
			stmt.setInt(1, newAge);
			stmt.setInt(2, id);

			stmt.executeUpdate();
		}
	}

	@Override
	public List<Person> selectAllPeople(Connection connection) throws SQLException {

		List<Person> listOfPeople = new ArrayList<>();

		try (Statement stmt = connection.createStatement()) {
			try (ResultSet res = stmt.executeQuery("SELECT id,name,lastname,age FROM person")) {
				while (res.next()) {
					Person person = new Person(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4));
					listOfPeople.add(person);
				}
			}
		}
		return listOfPeople;
	}

	@Override
	public int deletePerson(Connection connection, int id) throws SQLException {

		try (PreparedStatement stmt = connection.prepareStatement("DELETE FROM person WHERE id = ?")) {
			stmt.setInt(1, id);

			return stmt.executeUpdate();
		}
	}

	@Override
	public Person maxAgePerson(Connection connection) throws SQLException {

		Person person = null;
		try (Statement stmt = connection.createStatement()) {
			try (ResultSet result = stmt
					.executeQuery("Select id,name,lastname,age from person order by age desc limit 1")) {

				result.next(); //Necesario while si son varios
				person = new Person(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4));
			}
		}

		return person;
	}
}
