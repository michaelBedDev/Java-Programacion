package data;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import view.View;

public class DB {

	private final Connection connection;
	private View view;

	public DB() throws SQLException {
		this.connection = AccessToDB.getInstance();
	}
}
