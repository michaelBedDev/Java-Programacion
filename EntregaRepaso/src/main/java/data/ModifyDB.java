package data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import exceptions.ObjectNotFoundException;
import view.View;

public class ModifyDB {

	private final Connection connection;
	private View view;
	private ArrayList<Grupo> listaGrupos;

	public ModifyDB() throws SQLException {
		super();
		this.connection = DB.getInstance();
		this.listaGrupos = new ArrayList<>();
		this.view = new View();
		crearGrupoPorDefecto();
	}

	private void crearGrupoPorDefecto() {
		crearGrupo('J');
	}

	public List<Direccion> getdirecciones() {
		ArrayList<Direccion> listaDirecciones = new ArrayList<>();

		try (Statement stmt = DB.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE); ResultSet rs = stmt.executeQuery("select * from direcciones");) {

			while (rs.next()) {
				Direccion direccion = new Direccion();
				direccion.setCalle(rs.getString(2));
				direccion.setCp(rs.getInt(3));
				direccion.setNumero(rs.getInt(4));
				direccion.setCiudad(rs.getString(5));
				direccion.setPersonal(rs.getBoolean(6));
				listaDirecciones.add(direccion);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaDirecciones;
	}

	public List<Contacto> getContactos() {
		ArrayList<Contacto> listaContactos = new ArrayList<>();

		try (Statement stmt = DB.getInstance().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE); ResultSet rs = stmt.executeQuery("select * from contactos");) {

			while (rs.next()) {
				Contacto contacto = new Contacto();
				contacto.setId(rs.getString(1));
				contacto.setNombre(rs.getString(2));
				contacto.setTelefono(rs.getInt(3));
				contacto.setEmail(rs.getString(4));
				contacto.setFechaNacimiento(rs.getDate(5));

				listaContactos.add(contacto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaContactos;
	}

	public void crearGrupo(char c) {

		String cString = String.valueOf(c).toUpperCase();

		Grupo grupo = new Grupo();
		List<Contacto> listafiltered = getContactos().stream()
				.filter(contacto -> contacto.getNombre().startsWith(cString)).toList();

		for (Contacto c1 : listafiltered) {
			grupo.getContactos().add(c1);
		}

		listaGrupos.add(grupo);
		if (!grupo.getContactos().isEmpty()) {
			view.showMessage("Contactos añadidos correctamente");
		} else {
			view.showMessage(cString);
		}
	}

	public void contactosToFichero() {
		Path fichero = Paths.get("grupo.txt");

		for (Contacto c : getContactos()) {
			List<String> contactotxt = Arrays.asList(c.toString());
			try {
				Files.write(fichero, contactotxt, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
				view.showMessage("Contactos escritos correctamente");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void ficheroToContactos() {
		Path fichero = Paths.get("grupo.txt");

		try {
			List<String> lines = Files.readAllLines(fichero);
			for (String line : lines) {
				view.showMessage(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Contacto getContacto(String id) throws ObjectNotFoundException {
		Optional<Contacto> opContacto = getContactos().stream().filter(contacto -> contacto.getId().equals(id))
				.findFirst();

		return opContacto.orElseThrow(() -> new ObjectNotFoundException("No contacts found with the ID: " + id));
	}

	public String compararContacto(Contacto c1, Contacto c2) {
		return c1.equals(c2) ? "Los contactos son iguales" : "Los contactos no son iguales";
	}

	public void mostrarContactosOrdenadosTlf() {
		List<Contacto> lista = getContactos();
		lista.stream().sorted(Comparator.comparing(Contacto::getTelefono)).forEach(view::showContacto);

	}

	public void navegarContactos() {
		try (Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery("select * from contactos")) {

			int input = 0;
			rs.next();
			Contacto contacto = new Contacto();
			contacto.setId(rs.getString(1));
			contacto.setNombre(rs.getString(2));
			contacto.setTelefono(rs.getInt(3));
			contacto.setEmail(rs.getString(4));
			contacto.setFechaNacimiento(rs.getDate(5));
			view.showContacto(contacto);

			do {
				input = view
						.askForInt("Deseas ver el podcast anterior o siguiente? (1: Anterior, 2: Siguiente, 3: Salir");
				if (input == 1) {
					rs.previous();
					contacto.setId(rs.getString(1));
					contacto.setNombre(rs.getString(2));
					contacto.setTelefono(rs.getInt(3));
					contacto.setEmail(rs.getString(4));
					contacto.setFechaNacimiento(rs.getDate(5));
					view.showContacto(contacto);

				} else if (input == 2) {
					rs.next();
					contacto.setId(rs.getString(1));
					contacto.setNombre(rs.getString(2));
					contacto.setTelefono(rs.getInt(3));
					contacto.setEmail(rs.getString(4));
					contacto.setFechaNacimiento(rs.getDate(5));
					view.showContacto(contacto);
				}
			} while (input != 3);

		} catch (SQLException e) {
			view.showMessage("No hay un contacto anterior o siguiente");
		}
	}

	public void contarContactosGrupo() {
		for (Grupo g : listaGrupos) {
			view.showMessage(g.toString());
		}
		String input = view.askForString("Introduce el ID del grupo a contar");

		Optional<Grupo> opGrupo = listaGrupos.stream().filter(grupo -> input.equalsIgnoreCase(grupo.getId()))
				.findFirst();

		opGrupo.ifPresentOrElse(grupo -> {
			long sum = grupo.getContactos().stream().count();

			view.showMessage("Número de contactos del grupo: " + sum);
		}, () -> view.showMessage("No se han encontrado grupos con ese ID"));

	}

	public void usuarioMasJoven(Grupo g) {
		Optional<Contacto> contactoMasJoven = g.getContactos().stream()
				.filter(contacto -> contacto.getFechaNacimiento() != null)
				.min(Comparator.comparing(Contacto::getFechaNacimiento));

		contactoMasJoven.ifPresent(contacto ->

		view.showMessage("El usuario más joven es: " + contacto));
	}

	public Grupo getGrupo(String input) throws ObjectNotFoundException {

		Optional<Grupo> opGrupo = listaGrupos.stream().filter(grupo -> input.equalsIgnoreCase(grupo.getId()))
				.findFirst();

		return opGrupo.orElseThrow(() -> new ObjectNotFoundException("No han sido encontrado grupos con ese ID"));
	}

	public List<Grupo> getListaGrupos() {
		return listaGrupos;
	}

	public void setListaGrupos(ArrayList<Grupo> listaGrupos) {
		this.listaGrupos = listaGrupos;
	}
}
