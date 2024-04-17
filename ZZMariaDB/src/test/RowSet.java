package test;

import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

import ejercicios.Person;

public class RowSet {

	public static void main(String[] args) throws SQLException {

		try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet()) {
			// obtenemos el rowset de forma estatica
			rowSet.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/MCMEmpresa");

			rowSet.setUsername("alumno");
			rowSet.setPassword("abc123..");

			// Asignamos consulta y ejecutamos
			rowSet.setCommand("select * from person");
			rowSet.execute();
			
			rowSet.next();
			
				Person person = new Person();
				person = new Person(rowSet.getInt(1), rowSet.getString(2), rowSet.getString(3), rowSet.getInt(4));
				System.out.println(person.toString());
				
				rowSet.absolute(3);
				Person person2 = new Person();
				person2 = new Person(rowSet.getInt(1), rowSet.getString(2), rowSet.getString(3), rowSet.getInt(4));
				System.out.println(person2.toString());
				
				rowSet.last();
				Person person3 = new Person();
				person3 = new Person(rowSet.getInt(1), rowSet.getString(2), rowSet.getString(3), rowSet.getInt(4));
				System.out.println(person3.toString());
				
				rowSet.absolute(0); //RECORREMOS A PARTIR DEL 0
				System.out.println("Recorremos\n");
				
				while(rowSet.next()) {
					Person per = new Person();
					per = new Person(rowSet.getInt(1), rowSet.getString(2), rowSet.getString(3), rowSet.getInt(4));
					System.out.println(per.toString());
				}
			
		}
	}
}
