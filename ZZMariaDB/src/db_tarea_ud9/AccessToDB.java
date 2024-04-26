package db_tarea_ud9;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

import io.github.cdimascio.dotenv.Dotenv;

public class AccessToDB {

	private static AccessToDB instance;
	private BasicDataSource dataSource;

	private AccessToDB() {

			dataSource = new BasicDataSource();
//			dataSource.setUrl("jdbc:mariadb://localhost:3306/mcmpodcast_bd?tinyInt1isBit=false");
//			dataSource.setUsername("root");
//			dataSource.setPassword("abc123..");
//			dataSource.setInitialSize(5);
//			dataSource.setMaxTotal(10);

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
			instance = new AccessToDB();
		}
		return  instance.getDataSource().getConnection();
	}
}