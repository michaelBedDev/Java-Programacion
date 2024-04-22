package db_tarea_ud9;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;


public class AccessToDB {

	private static AccessToDB instance;

	private AccessToDB() throws SQLException {
		JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
		rs.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/MCMEmpresa");
		rs.setUsername("alumno");
		rs.setPassword("abc123..");
	}

	private AccessToDB(String URL, String username, String password) throws SQLException {
		JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
		rs.setUrl(URL);
		rs.setUsername(username);
		rs.setPassword(password);
	}

	public static AccessToDB getInstance(String URL, String username, String password) throws SQLException {

		if (instance == null) {
			instance = new AccessToDB(URL, username, password);
		}
		return instance;
	}

	public static AccessToDB getInstance() throws SQLException {
		if (instance == null) {
			instance = new AccessToDB();
		}
		return instance;

	}
}
