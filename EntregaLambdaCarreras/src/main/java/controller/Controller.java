package controller;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;

import data.Carrera;
import data.DB;
import data.ENUM_AVANZADO;
import data.Equipo;
import exceptions.TeamAlreadyRegisteredException;
import view.View;

public class Controller {

	private View view;
	private DB db;
	
	
<<<<<<< HEAD
	public Controller() {
		view = new View();
		db = DB.getInstance();
=======
	
	public void altaEquipo() {
		mostrarEquipos(DB.getInstance().getEquiposTotales());
		String equipo = view.askForString("Introduce el nombre del equipo");
		
		Optional<Equipo> op = db.getEquiposTotales().stream().filter(e -> e.getNombre().equalsIgnoreCase(equipo)).findFirst();
		
		//if;
		
>>>>>>> branch 'main' of https://github.com/michaelBedDev/Java-Programacion.git
	}




	public void altaEquipo() { //Revisar
		/* Select Team */
		mostrarEquipos(db.getEquiposTotales());	
		String equipoID = view.askForString("Introduce el ID del equipo");
		Optional<Equipo> opTeam = db.getEquiposTotales().stream()
				.filter(e -> e.getId().equals(equipoID)).findFirst();
		
		/* Select Race*/
		mostrarCarreras(db.getCarreras());
		String carreraID = view.askForString("Introduce el ID de la carrera para añadir");
		
		Optional<Carrera> opRace = db.getCarreras().stream()
				.filter(c -> carreraID.equals(c.getId())).findFirst();
		
		

		
		/* Is Team already Registered into Race */
		Optional<Equipo> op = Optional.ofNullable(opRace.get().getEquipos().get(opTeam.get()));	
	
		op.ifPresentOrElse(
			    equipo -> {
			        throw new TeamAlreadyRegisteredException();
			    },
			    /* if isn´t registered */
			    () -> {
			    	opRace.get().getEquipos().put(equipoID,opTeam.get());
			    }
			);
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
}
