package controller;


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
				participanteMasJoven(db.getEquiposTotales().get(0));
				break;
			}
		} while (option != 8);
	}

	
	
	public boolean altaEquipo() {
		/* Select Team */
		mostrarEquipos(db.getEquiposTotales());
		String equipoID = view.askForString("Introduce el ID del equipo");
		Optional<Equipo> opTeam = db.getEquiposTotales().stream().filter(e -> e.getId().equals(equipoID)).findFirst();

		if (opTeam.isEmpty()) {
			view.showMessage("El ID del equipo no es correcto");
			return false;
		}

		/* Select Race */
		mostrarCarreras(db.getCarreras());
		String carreraID = view.askForString("Introduce el ID de la carrera para añadir");

		Optional<Carrera> opRace = db.getCarreras().stream().filter(c -> carreraID.equals(c.getId())).findFirst();

		if (opRace.isEmpty()) {
			view.showMessage("El ID de la carrera no es correcto");
			return false;
		}

		/* Is Team already Registered into Race */
		Optional<Equipo> op = Optional.ofNullable(buscarEquipo(opRace.get(), equipoID));

		op.ifPresentOrElse(equipo -> {
			try {
				throw new ObjectAlreadyRegisteredException("El equipo ya está registrado en la carrera");
			} catch (ObjectAlreadyRegisteredException e) {
				e.printStackTrace();

			}
		},
				/* if isn´t registered */
				() -> {
					opRace.get().getEquipos().put(equipoID, opTeam.get());
					view.showMessage("Equipo añadido a la carrera correctamente");
				});

		return true;
	}

	public boolean altaParticipante() {
		mostrarParticipantes(db.getEquiposTotales());
		String participanteID = view.askForString("Introduce el ID del Participante");
		Optional<Participante> opRunner = db.getParticipantesTotales().stream()
				.filter(p -> p.getId().equals(participanteID)).findFirst();

		if (opRunner.isEmpty()) {
			view.showMessage("El ID del participante no es correcto");
			return false;
		}

		mostrarEquipos(db.getEquiposTotales());
		String equipoID = view.askForString("Introduce el ID del equipo");
		Optional<Equipo> opTeam = db.getEquiposTotales().stream().filter(e -> e.getId().equals(equipoID)).findFirst();

		if (opTeam.isEmpty()) {
			view.showMessage("El ID del equipo no es correcto");
			return false;
		}

		/* Is Runner already Registered into Team */
		Optional<Participante> op = Optional.ofNullable(buscarParticipante(opTeam.get(), participanteID));

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
					} else {
						view.showMessage("No hay espacio en el equipo");
					}
				});

		return true;
	}

	/* Delete a Team */
	public boolean deleteEquipofromRace() {

		mostrarCarreras(db.getCarreras());
		String carreraID = view.askForString("Introduce el ID de la carrera para eliminar");
		Optional<Carrera> opRace = db.getCarreras().stream().filter(c -> carreraID.equals(c.getId())).findFirst();

		if (opRace.isEmpty()) {
			view.showMessage("El ID de la carrera no es correcto");
			return false;
		}

		mostrarEquipos(db.getEquiposTotales());
		String equipoID = view.askForString("Introduce el ID del equipo a eliminar");
		Optional<Equipo> opTeam = db.getEquiposTotales().stream().filter(e -> e.getId().equals(equipoID)).findFirst();

		if (opTeam.isEmpty()) {
			view.showMessage("El ID del equipo no es correcto");
			return false;
		}

		if (buscarEquipo(opRace.get(), equipoID) != null) {
			opRace.get().getEquipos().remove(equipoID);
			return true;
		} else {
			view.showMessage("El equipo no está registrado en la carrera");
		}

		return false;
	}

	/* Give prize to Team */
	public boolean darPremio() {
		mostrarCarreras(db.getCarreras());
		String carreraID = view.askForString("Introduce el ID de la carrera para dar premio");
		Optional<Carrera> opRace = db.getCarreras().stream().filter(c -> carreraID.equals(c.getId())).findFirst();

		if (opRace.isEmpty()) {
			view.showMessage("El ID de la carrera no es correcto");
			return false;
		}

		mostrarEquipos(db.getEquiposTotales());
		String equipoID = view.askForString("Introduce el ID del equipo a premiar");
		Optional<Equipo> opTeam = db.getEquiposTotales().stream().filter(e -> e.getId().equals(equipoID)).findFirst();

		if (opTeam.isEmpty()) {
			view.showMessage("El ID del equipo no es correcto");
			return false;
		}

		int premio = 0;
		do {
			premio = view.askForInt("Introduce el premio a dar al equipo [1, 2, 3]") - 1;
		} while (premio < 0 || premio > 2);

		if (buscarEquipo(opRace.get(), equipoID) != null) {
			opTeam.get().setPuntosAcumulados(opTeam.get().getPuntosAcumulados() + opRace.get().getPremios()[premio]);

			if (opRace.get().getPremios()[premio] == 0) {
				view.showMessage("El premio ya ha sido entregado");
				return false;
			}
			opRace.get().getPremios()[premio] = 0; /* Set prize to 0 to avoid giving 2 times */
			return true;
		} else {
			view.showMessage("El equipo no está registrado en la carrera");
		}
		return false;
	}

	/* Search if there´s space in the Team */
	private boolean hayEspacio(Equipo e) {
		int index = 0;
		for (Participante p : e.getParticipantes()) {
			index++;
		}
		return (index < 5) ? true : false;
	}

	/* Search for Equipo in Carrera (Predicate method) */
	private Equipo buscarEquipo(Carrera c, String equipoID) {
		Predicate<Equipo> p = e -> e.getId().equals(equipoID);
		return c.getEquipos().values().stream().filter(p).findFirst().orElse(null);
	}

	/* Search for Participante in Equipo (Array method) */
	private Participante buscarParticipante(Equipo e, String participanteID) {
		for (Participante p : e.getParticipantes()) {
			if (p.getId().equals(participanteID)) {
				return p;
			}
		}
		return null;
	}

	private void mostrarParticipantes(ArrayList<Equipo> equipos) {
		for (Equipo e : equipos) {
			view.showMessage(e.toString());
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

	/* Stream functions */
	public void mostrarEquipoFormat() {
		System.out.println(
			    db.getEquiposTotales().stream()
			        .flatMap(e -> e.getParticipantes().stream().map(p -> p.getApellidos()))
			        .collect(Collectors.joining(" | "))
			);
	}

	/* Join two teams */
	public void unirEquipos() {
		List<Participante> equipoAUnir1 = db.getEquiposTotales().get(0).getParticipantes().stream().filter(p -> p.getCategoria().equals(Categoria.SENIOR))
				.filter(p -> p.getSexo() == ('m')).toList();
		List<Participante> equipoAUnir2 = db.getEquiposTotales().get(1).getParticipantes().stream().filter(p -> p.getCategoria().equals(Categoria.SENIOR))
				.filter(p -> p.getSexo() == ('m')).toList();
		
		
		List<Participante> equiposUnidos = Stream.concat(equipoAUnir1.stream(), equipoAUnir2.stream()).limit(5).toList();
		equiposUnidos.forEach(System.out::println);
	}
	
	/* Obtener participante más joven */
	public void participanteMasJoven(Equipo e) {
		e.getParticipantes().stream().sorted((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad())).findFirst().ifPresent(System.out::println);
	}
}
