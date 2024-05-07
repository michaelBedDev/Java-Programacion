package controller;

import java.util.ArrayList;
import java.util.Optional;

import data.DB;
import data.ENUM_AVANZADO;
import data.Equipo;
import view.View;

public class Controller {

	private View view;
	private DB db;
	
	
	
	public void altaEquipo() {
		mostrarEquipos(DB.getInstance().getEquiposTotales());
		String equipo = view.askForString("Introduce el nombre del equipo");
		
		Optional<Equipo> op = db.getEquiposTotales().stream().filter(e -> e.getNombre().equalsIgnoreCase(equipo)).findFirst();
		
		//if;
		
	}
	
	
	
	
	private void mostrarEquipos(ArrayList<Equipo> equipos) {
		for (Equipo e : equipos) {
			view.showMessage(e.toString());
		}
	}
}
