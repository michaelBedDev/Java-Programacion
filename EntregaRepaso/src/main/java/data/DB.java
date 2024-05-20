package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.dbcp2.BasicDataSource;

import io.github.cdimascio.dotenv.Dotenv;

public class DB {

	private static DB instance;
	private BasicDataSource dataSource;

	private DB() {

			dataSource = new BasicDataSource();
			Dotenv dotenv = Dotenv.load();
			
			dataSource.setUrl(dotenv.get("URL"));
			dataSource.setUsername(dotenv.get("USER"));
			dataSource.setPassword(dotenv.get("PASS"));
	}

	public BasicDataSource getDataSource() {
		return dataSource;
	}

	public static Connection getInstance() throws SQLException {
		if (instance == null) {
			instance = new DB();
		}
		return  instance.getDataSource().getConnection();
	}
}
