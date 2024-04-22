package ejercicioRowSet;

import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class AccessToBD {

	private static AccessToBD instance;

	private AccessToBD() throws SQLException {
		JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
		rs.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/MCMEmpresa");
		rs.setUsername("alumno");
		rs.setPassword("abc123..");
	}

	private AccessToBD(String URL, String username, String password) throws SQLException {
		JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
		rs.setUrl(URL);
		rs.setUsername(username);
		rs.setPassword(password);
	}

	public static AccessToBD getInstance(String URL, String username, String password) throws SQLException {

		if (instance == null) {
			instance = new AccessToBD(URL, username, password);
		}
		return instance;
	}

	public static AccessToBD getInstance() throws SQLException {
		if (instance == null) {
			instance = new AccessToBD();
		}
		return instance;

	}

	//SuperMethod
	private void executeQueryNoParameters(JdbcRowSet rs, String query) throws SQLException {
		rs.setCommand(query);
		rs.execute();
	}

//	Mostrar todos los registros.
	public void showPeople(JdbcRowSet rs) throws SQLException {
		String query = "select id, name, lastname, age from person";
		executeQueryNoParameters(rs, query);

		while (rs.next()) {
			Person person = new Person(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			System.out.println(person.toString());
		}
	}

//	Mostrar el número de personas de la empresa (cantidad).
	public void showPeopleAndEmployees(JdbcRowSet rs) throws SQLException {
		String query = "select count(id) from person";
		rs.setCommand(query);
		rs.execute();
		rs.next();
		System.out.println(rs.getInt(1));
	}
	
	
//	Mostrar un registro por la posición. Una vez colocado que nos permita mostrar el anterior registro o el siguiente.
	public void showRowbyPosition(JdbcRowSet rs, int position) throws SQLException {
		String query = "select id, name, lastname, age from person";
		executeQueryNoParameters(rs, query);
		rs.absolute(position);
		
		Person person = new Person(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
		System.out.println(person.toString());
		
		
	
	}
	
//	Actualizar una edad de una persona, indicando la posición.
	
	
//	Eliminar último registro.
	public void deleteLastRow(JdbcRowSet rs) throws SQLException {
		String query = "select limit(1) id, name, lastname, age from person order by desc";
		executeQueryNoParameters(rs, query);
		String delete = "";
		
	}
}
//	Insertar una nueva persona en la empresa.

