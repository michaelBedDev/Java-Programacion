package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import data.Carrera;
import data.Categoria;
import data.DB;
import data.Equipo;
import data.Participante;
import exceptions.ObjectAlreadyRegisteredException;
import view.Menu;
import view.View;

public class Controller {

	private View view;
	private DB db;
	private Menu menu;

	public Controller() {
		view = new View();
		db = DB.getInstance();
		menu = new Menu();
	}

	public void start() {
		int option = 0;
		do {
			menu.showMenu();
			option = view.askForInt("Introduce una opción");
			switch (option) {
			case 1:
				altaEquipo();
				break;
			case 2:
				altaParticipante();
				break;
			case 3:
				deleteEquipofromRace();
				break;
			case 4:
				darPremio();
				break;
			case 5:
				mostrarEquipoFormat();
				break;
			case 6:
				unirEquipos();
				break;
			case 7:
				participanteMasJoven();
				break;
			case 8:
				infoToBBDD();
				break;
			case 9:
				view.showMessage("Hasta luego");
				break;
			}
		} while (option != 9);
	}

	private Optional<Equipo> seleccionarEquipo() {
		/* Select Team */
		mostrarEquipos(db.getEquiposTotales());
		String equipoID = view.askForString("Introduce el ID del equipo");
		Optional<Equipo> opTeam = db.getEquiposTotales().stream()
				.filter(e -> e.getId().trim().equalsIgnoreCase(equipoID)).findFirst();

		if (opTeam.isEmpty()) {
			view.showMessage("El ID del equipo no es correcto");
		}
		return opTeam;
	}

	private Optional<Carrera> seleccionarCarrera() {
		/* Select Race */
		mostrarCarreras(db.getCarreras());
		String carreraID = view.askForString("Introduce el ID de la carrera para añadir");

		Optional<Carrera> opRace = db.getCarreras().stream().filter(c -> carreraID.trim().equalsIgnoreCase(c.getId()))
				.findFirst();

		if (opRace.isEmpty()) {
			view.showMessage("El ID de la carrera no es correcto");
		}
		return opRace;
	}

	private Optional<Participante> seleccionarParticipante() {
		/* Select Runner */
		mostrarParticipantes(db.getParticipantesTotales());
		String participanteID = view.askForString("Introduce el ID del Participante");
		Optional<Participante> opRunner = db.getParticipantesTotales().stream()
				.filter(p -> p.getId().trim().equalsIgnoreCase(participanteID)).findFirst();

		if (opRunner.isEmpty()) {
			view.showMessage("El ID del participante no es correcto");
		}
		return opRunner;
	}

	/* Select Team from a Race */
	private Optional<Equipo> seleccionarEquipoApuntadoCarrera(Carrera c) {

		mostrarEquipos(new ArrayList<>(c.getEquipos().values()));
		String equipoID = view.askForString("Introduce el ID del equipo");
		Optional<Equipo> opTeam = c.getEquipos().values().stream()
				.filter(e -> e.getId().trim().equalsIgnoreCase(equipoID)).findFirst();

		if (opTeam.isEmpty()) {
			view.showMessage("El ID del equipo no es correcto");
		}
		return opTeam;
	}

	/**
	 * Method to add a Team to a Race
	 * 
	 * @return
	 */
	public boolean altaEquipo() {
		/* Select Team */
		Optional<Equipo> opTeam = seleccionarEquipo();

		if (opTeam.isEmpty()) {
			return false;
		}

		/* Select Race */
		Optional<Carrera> opRace = seleccionarCarrera();

		if (opRace.isEmpty()) {
			return false;
		}

		/* Is Team already Registered into Race */
		Optional<Equipo> op = Optional.ofNullable(buscarEquipo(opRace.get(), opTeam.get()));

		op.ifPresentOrElse(equipo -> {
			try {
				throw new ObjectAlreadyRegisteredException("El equipo ya está registrado en la carrera");
			} catch (ObjectAlreadyRegisteredException e) {
				e.printStackTrace();

			}
		},
				/* if isn´t registered */
				() -> {
					opRace.get().getEquipos().put(opTeam.get().getId(), opTeam.get());
					view.showMessage("Equipo añadido a la carrera correctamente");
				});

		return true;
	}

	/**
	 * Method to add a Runner to a Team
	 * 
	 * @return
	 */
	public boolean altaParticipante() {
		Optional<Participante> opRunner = seleccionarParticipante();

		if (opRunner.isEmpty()) {
			return false;
		}

		Optional<Equipo> opTeam = seleccionarEquipo();

		if (opTeam.isEmpty()) {
			return false;
		}

		/* Is Runner already Registered into Team */
		Optional<Participante> op = Optional.ofNullable(buscarParticipante(opTeam.get(), opRunner.get()));

		op.ifPresentOrElse(p -> {
			try {
				throw new ObjectAlreadyRegisteredException("El participante ya está registrado en el equipo");
			} catch (ObjectAlreadyRegisteredException e) {
				e.printStackTrace();
			}
		},
				/* if isn´t registered */
				() -> {

					if (hayEspacio(opTeam.get())) {
						opTeam.get().getParticipantes().add(opRunner.get());
						view.showMessage("Participante añadido al equipo correctamente");
					} else {
						view.showMessage("No hay espacio en el equipo");
					}
				});

		return true;
	}

	/**
	 * Method to delete a Team from a Race
	 * 
	 * @return
	 */
	public boolean deleteEquipofromRace() {

		Optional<Carrera> opRace = seleccionarCarrera();

		if (opRace.isEmpty()) {
			return false;
		}

		Optional<Equipo> opTeam = seleccionarEquipoApuntadoCarrera(opRace.get());

		if (opTeam.isEmpty()) {
			return false;
		}

		if (buscarEquipo(opRace.get(), opTeam.get()) != null) {
			opRace.get().getEquipos().remove(opTeam.get().getId());
			view.showMessage("Equipo eliminado de la carrera correctamente");
			return true;
		} else {
			view.showMessage("El equipo no está registrado en la carrera");
		}

		return false;
	}

	/**
	 * Method to give a prize to a Team
	 * 
	 * @return
	 */
	public boolean darPremio() {
		Optional<Carrera> opRace = seleccionarCarrera();

		if (opRace.isEmpty()) {
			return false;
		}

		Optional<Equipo> opTeam = seleccionarEquipoApuntadoCarrera(opRace.get());

		if (opTeam.isEmpty()) {
			return false;
		}

		int premio = 0;
		do {
			premio = view.askForInt("Introduce el premio a dar al equipo [1, 2, 3]") - 1;
		} while (premio < 0 || premio > 2);

		if (buscarEquipo(opRace.get(), opTeam.get()) != null) {
			opTeam.get().setPuntosAcumulados(opTeam.get().getPuntosAcumulados() + opRace.get().getPremios()[premio]);

			if (opRace.get().getPremios()[premio] == 0) {
				view.showMessage("El premio ya ha sido entregado");
				return false;
			}
			opRace.get().getPremios()[premio] = 0; /* Set prize to 0 to avoid giving 2 times */
			view.showMessage(
					"Premio entregado correctamente. Puntos del equipo: " + opTeam.get().getPuntosAcumulados());
			return true;
		} else {
			view.showMessage("El equipo no está registrado en la carrera");
		}
		return false;
	}

	/* Search if there´s space in the Team */
	private boolean hayEspacio(Equipo e) {
		int index = 0;
		for (; index <= e.getParticipantes().size(); index++) {
		}
		return (index < 5) ? true : false;
	}

	/* Search for Equipo in Carrera (Predicate method) */
	private Equipo buscarEquipo(Carrera c, Equipo e) {
		Predicate<Equipo> pred = eq -> eq.getId().equals(e.getId());
		return c.getEquipos().values().stream().filter(pred).findFirst().orElse(null);
	}

	/* Search for Participante in Equipo (Predicate method) */
	private Participante buscarParticipante(Equipo e, Participante p) {
		Predicate<Participante> pred = part -> part.getId().equals(p.getId());
		return e.getParticipantes().stream().filter(pred).findFirst().orElse(null);
	}

	/* Show methods */
	private void mostrarParticipantes(ArrayList<Participante> participantes) {
		for (Participante p : participantes) {
			view.showMessage(p.toString());
		}
	}

	private void mostrarEquipos(ArrayList<Equipo> equipos) {
		for (Equipo e : equipos) {
			view.showMessage(e.toString());
		}
	}

	private void mostrarCarreras(ArrayList<Carrera> carreras) {
		for (Carrera c : carreras) {
			view.showMessage(c.toString());
		}
	}

	/* Formatted view Team */
	public boolean mostrarEquipoFormat() {
		Optional<Equipo> opEquipo = seleccionarEquipo();
		if (opEquipo.isEmpty()) {
			return false;
		}

		System.out.println(opEquipo.get().getParticipantes().stream().map(p -> p.getApellidos())
				.collect(Collectors.joining(" | ")));
		return true;
	}

	/* Join two teams */
	public void unirEquipos() {
		/* unir los 5 primeros participantes de los dos primeros equipos */
		List<Participante> equipoAUnir1 = db.getEquiposTotales().get(1).getParticipantes().stream()
				.filter(p -> p.getCategoria().equals(Categoria.SENIOR)).filter(p -> p.getSexo() == ('m')).toList();
		view.showMessage("Equipo 1");
		equipoAUnir1.forEach(System.out::println);

		List<Participante> equipoAUnir2 = db.getEquiposTotales().get(2).getParticipantes().stream()
				.filter(p -> p.getCategoria().equals(Categoria.SENIOR)).filter(p -> p.getSexo() == ('m')).toList();
		view.showMessage("Equipo 2");
		equipoAUnir2.forEach(System.out::println);

		List<Participante> equiposUnidos = Stream.concat(equipoAUnir1.stream(), equipoAUnir2.stream()).limit(5)
				.toList();
		view.showMessage("Nuevo equipo:");
		equiposUnidos.forEach(System.out::println);
	}

	/* Get younger runner */
	public void participanteMasJoven() {
		Optional<Equipo> opTeam = seleccionarEquipo();
		if (opTeam.isEmpty()) {
			return;
		}

		if (opTeam.get().getParticipantes().isEmpty()) {
			view.showMessage("El equipo no tiene participantes");
			return;
		}

		opTeam.get().getParticipantes().stream().sorted((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()))
				.findFirst().ifPresent(System.out::println);
	}

	public boolean infoToBBDD() {
		int optionDB = 0;

		try (Connection connection = AccessToDB.getInstance()) {
			System.out.println("Conexión establecida");
			do {
				menu.showBBDDMenu();
				optionDB = view.askForInt("Introduce una opción");
				switch (optionDB) {
				case 1:
					db.createTable(connection);
					break;
				case 2:
					db.addData(connection);
					break;
				case 3:
					db.showData(connection);
					break;
				case 4:
					view.showMessage("Volviendo al menu principal...");
					break;
				}
			} while (optionDB != 4);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;

	}
}
