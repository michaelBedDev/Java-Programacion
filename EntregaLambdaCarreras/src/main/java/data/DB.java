package data;

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

		Participante participante1 = new Participante("Antonio", "Fernandez", 'm', 15);
		Participante participante2 = new Participante("Manuel", "Martínez", 'm', 10);
		Participante participante3 = new Participante("Diego", "Pérez", 'm', 25);
		Participante participante4 = new Participante("Jorge", "Hernández", 'm', 19);
		Participante participante5 = new Participante("Jairo", "Fernandez", 'm', 13);

		equipoRojo.getParticipantes()[0] = participante1;
		equipoRojo.getParticipantes()[1] = participante2;
		equipoRojo.getParticipantes()[2] = participante3;

		equipoAzul.getParticipantes()[0] = participante4;
		equipoAzul.getParticipantes()[1] = participante5;

		equipoRojo.seleccionarCapitan();
		equipoAzul.seleccionarCapitan();
		
		generateEquipoID(equipoRojo); /* Generate IDS */
		generateEquipoID(equipoAzul);
		

		carrera.getEquipos().put(equipoAzul.getId(), equipoAzul); /* Add to specific */
		carrera.getEquipos().put(equipoRojo.getId(), equipoRojo);

		addAllToCollections(carrera); /* Add to DB */
	}

	private String getFechaActual() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		return LocalDate.now().format(formato);
	}

	private void addAllToCollections(Carrera carrera) {

		for (Equipo equipo : carrera.getEquipos().values()) {
			for (Participante participante : equipo.getParticipantes()) {
				participantesTotales.add(participante);
			}
			generateEquipoID(equipo);
			equiposTotales.add(equipo);
		}
		generateCarreraID(carrera);
		carreras.add(carrera);
	}

	private void generateCarreraID(Carrera carreraIn) {

	}

	private void generateEquipoID(Equipo equipoIn) {

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
}
