package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DB { /* With instance */

	private ArrayList<Carrera> carreras;
	private ArrayList<Equipo> equiposTotales;
	private ArrayList<Participante> participantesTotales;
	private static DB instance;

	private DB() {
		super();
		carreras = new ArrayList<>();
		equiposTotales = new ArrayList<>();
		participantesTotales = new ArrayList<>();
		crearDatosEjemplo();
	}

	public static DB getInstance() {
		if (instance == null) {
			instance = new DB();
		}
		return instance;
	}

	public void crearDatosEjemplo() {

		Carrera carrera = new Carrera("CarreraDePrueba", getFechaActual(), 10);

		Equipo equipoRojo = new Equipo("Rojo");
		Equipo equipoAzul = new Equipo("Azul");
		Equipo equipoAmarillo = new Equipo("Amarillo"); /* Equipo sin carrera */
		equiposTotales.add(equipoAmarillo);

		Participante participante1 = new Participante("Antonio", "Fernandez Fernandez", 'm', 15);
		Participante participante2 = new Participante("Manuel", "Martínez Martínez", 'm', 10);
		Participante participante3 = new Participante("Diego", "Pérez Pérez", 'm', 25);
		Participante participante4 = new Participante("Jorge", "Hernández Hernández", 'm', 19);
		Participante participante5 = new Participante("Jairo", "Fernandez Fernandez", 'm', 13);

		equipoRojo.getParticipantes().add(participante1);
		equipoRojo.getParticipantes().add(participante2);
		equipoRojo.getParticipantes().add(participante3);
		equipoAzul.getParticipantes().add(participante4);
		equipoAzul.getParticipantes().add(participante5);

		equipoRojo.setPuntosAcumulados(10);
		equipoAzul.setPuntosAcumulados(20);

		equipoRojo.seleccionarCapitan();
		equipoAzul.seleccionarCapitan();

		carrera.getEquipos().put(equipoAzul.getId(), equipoAzul); /* Add to specific */
		carrera.getEquipos().put(equipoRojo.getId(), equipoRojo);

		addAllToCollections(carrera); /* Add to DB */
	}

	private String getFechaActual() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.now().format(formato);
	}

	private void addAllToCollections(Carrera carrera) {

		for (Equipo equipo : carrera.getEquipos().values()) {
			for (Participante participante : equipo.getParticipantes()) {
				participantesTotales.add(participante);
			}
			equiposTotales.add(equipo);
		}
		carreras.add(carrera);
	}

	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(ArrayList<Carrera> carreras) {
		this.carreras = carreras;
	}

	public ArrayList<Equipo> getEquiposTotales() {
		return equiposTotales;
	}

	public void setEquiposTotales(ArrayList<Equipo> equiposTotales) {
		this.equiposTotales = equiposTotales;
	}

	public ArrayList<Participante> getParticipantesTotales() {
		return participantesTotales;
	}

	public void setParticipantesTotales(ArrayList<Participante> participantesTotales) {
		this.participantesTotales = participantesTotales;
	}

	public void createTable(Connection connection) {

		String createDatabaseScript = "CREATE DATABASE IF NOT EXISTS `carreras`;";
		String dropTableScript = "DROP TABLE IF EXISTS `resumen`;";
		String createTableScript = "CREATE TABLE `resumen`(\n" +
				"    `identificador` varchar(10) NOT NULL,\n" +
				"    `nombre_carrera` varchar(50) NOT NULL,\n" +
				"    `equipo_con_mas_puntos` varchar(50) NULL,\n" +
				"    `total_participantes` int NULL,\n" +
				"    `fecha_insercion` varchar(10) NOT NULL,\n" +
				"    PRIMARY KEY (`identificador`)\n" +
				") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
		
		try (Statement query = connection.createStatement()) {
		    
		    query.execute(createDatabaseScript);
		    query.execute(dropTableScript);
		    query.execute(createTableScript);
		} catch (Exception e) {
		    e.printStackTrace();
		}

	}

	public void addData(Connection connection) {
		String insertDataScript = "INSERT INTO `resumen`(`identificador`, `nombre_carrera`, `equipo_con_mas_puntos`, `total_participantes`, `fecha_insercion`) VALUES (?, ?, ?, ?, ?);";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertDataScript)){
			
			for (Carrera carrera : carreras) {
				preparedStatement.setString(1, carrera.getId());
                preparedStatement.setString(2, carrera.getNombre());
                preparedStatement.setString(3, carrera.getEquipoConMasPuntos().getNombre());
                preparedStatement.setInt(4, carrera.getTotalParticipantes());
                preparedStatement.setString(5, carrera.getFecha());
                preparedStatement.executeUpdate();
            }
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showData(Connection connection) {
		try(ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM resumen")) {
			while (resultSet.next()) {
				System.out.println("Identificador: " + resultSet.getString("identificador"));
				System.out.println("Nombre Carrera: " + resultSet.getString("nombre_carrera"));
				System.out.println("Equipo con más puntos: " + resultSet.getString("equipo_con_mas_puntos"));
				System.out.println("Total Participantes: " + resultSet.getInt("total_participantes"));
				System.out.println("Fecha Inserción: " + resultSet.getString("fecha_insercion"));
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
