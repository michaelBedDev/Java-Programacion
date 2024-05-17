package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import view.View;

public class ModifyDB implements IPodcast {

	private static Connection conn;
	private View view = new View(); // move to controller

	public ModifyDB() throws SQLException {
		conn = AccessToDB.getInstance();
		view = new View();
	}

	/* Insert podcast in DB */
	@Override
	public boolean insertPodcast(Podcast p) {
		try (Statement query = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = query.executeQuery("select * from Podcast")) {

			rs.moveToInsertRow();

			if (isIDPodcastUnique(p.getIdPodcast())) {
				rs.updateInt("idPodcast", p.getIdPodcast());
			} else {
				do {
					p.setIdPodcast(p.getIdPodcast() + 1);
				} while (!isIDPodcastUnique(p.getIdPodcast()));
				rs.updateInt("idPodcast", p.getIdPodcast());
			}

			rs.updateString("titulo", p.getTitulo());
			rs.updateInt("tipo", p.getTipo());
			rs.updateString("calidad", p.getCalidad());
			rs.updateInt("duracion", p.getDuracion());
			rs.updateString("periocidad", p.getPeriodicidad());
			rs.updateString("formato_video", p.getFormatoVideo());

			view.showCollection(getDBAuthors()); /* Enseñar autores */

			/* Get author si el autor con id seleccionado ya está en DB */
			int idAutor = view.askForInt("Introduce el id del autor del podcast, o uno distinto para añadir uno nuevo");
			// Verify the author is already in DB. If not, create one;
			if (isAuthorinDB(idAutor)) {
				rs.updateInt("autor", idAutor);
			} else {
				view.showMessage("El autor no ha sido encontrado en la base de datos. Añade el autor."); // exception
				Autor aux = view.askForAuthor();
				aux.setIdAutor(1);

				// Assign a new id for the new Author. id+1 : don´t
				// add a repeated
				while (isAuthorinDB(aux.getIdAutor())) {
					aux.setIdAutor(aux.getIdAutor() + 1);
				}

				addAuthorToDB(aux);
				System.out.println("Autor agregado correctamente");
				rs.updateInt("autor", aux.getIdAutor());
			}
			rs.insertRow();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		System.out.println("Podcast agregado correctamente");
		return true;
	}

	/**
	 * Need to add the author to the DB to avoid the FK restriction when adding a
	 * Podcast
	 * 
	 * @param author
	 * @throws SQLException
	 */

	private void addAuthorToDB(Autor author) throws SQLException {

		try (Statement query = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet crs = query.executeQuery("select idAutor, dni, nombre, apellidos from Autor")) {

			crs.moveToInsertRow();
			crs.updateInt("idAutor", author.getIdAutor());
			crs.updateString("dni", author.getDni());
			crs.updateString("nombre", author.getNombre());
			crs.updateString("apellidos", author.getApellidos());

			crs.insertRow();
		}
	}

	/**
	 * Verify if there is an author with that id in DB
	 * 
	 * @param authorID
	 * @return boolean
	 * @throws SQLException
	 */
	private boolean isAuthorinDB(int authorID) throws SQLException {

		return getDBAuthors().stream().anyMatch(author -> author.getIdAutor() == authorID);
	}

	/**
	 * Verify if the podcastID is already repeated in DB
	 * 
	 * @param idPodcast
	 * @return boolean
	 */
	private boolean isIDPodcastUnique(int idPodcast) throws SQLException {

		return !getDBPodcast().stream().anyMatch(podcast -> podcast.getIdPodcast() == idPodcast);
	}

	/* ADD new gen to DB */
	@Override
	public boolean newGenPodcast(Genero g) {

		try (Statement query = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet crs = query.executeQuery("select idGeneros, nombre from Generos");) {

			crs.moveToInsertRow();
			// Verify if the idGender is unique
			if (isGenderIDUnique(g.getIdGenero())) {
				crs.updateInt("idGeneros", g.getIdGenero());
			} else {

				do { // hacer metodo de esto
					g.setIdGenero(g.getIdGenero() + 1);
				} while (!isGenderIDUnique(g.getIdGenero()));

				crs.updateInt("idGeneros", g.getIdGenero());
			}

			crs.updateString("nombre", g.getNombre());

			crs.insertRow();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		System.out.println("Género " + g.getNombre() + " agregado correctamente");
		return true;
	}

	/**
	 * Verify if the genderID is already repeated in DB
	 * 
	 * @param idGender
	 * @return boolean
	 * @throws SQLException
	 */
	private boolean isGenderIDUnique(int idGender) {

		return !getDBGenders().stream().anyMatch(gender -> gender.getIdGenero() == idGender);
	}

	@Override
	public boolean updatePodcast(Podcast p) {
		/* Update Podcast Genders */
		try (Statement query = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet crs = query.executeQuery("select * from gen_pod");) {

			view.showCollection(getDBGenders());
			int idGender = view.askForInt(
					"Introduce el id del género que quieres añadir," + " o uno distinto para añadir uno nuevo");

			if (isGenderinDB(idGender)) {
				crs.moveToInsertRow();
				crs.updateInt("idpodcat", p.getIdPodcast());
				crs.updateInt("idgenero", idGender);
				crs.insertRow();
				view.showMessage("Género añadido correctamente al podcast.");
				return true;
			} else {
				view.showMessage("El género no ha sido encontrado en la base de datos. Añade el género.");
				Genero aux = view.askForGen();
				aux.setIdGenero(1);

				while (isGenderinDB(aux.getIdGenero())) {
					aux.setIdGenero(aux.getIdGenero() + 1);
				}
				newGenPodcast(aux);
				System.out.println("Género agregado correctamente");

				crs.moveToInsertRow();
				crs.updateInt("idPodcast", p.getIdPodcast());
				crs.updateInt("idGeneros", aux.getIdGenero());
				crs.insertRow();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private boolean isGenderinDB(int idGender) {
		return getDBGenders().stream().anyMatch(id -> id.getIdGenero() == idGender);
	}

	public Podcast selectPodcast() throws Exception {
		view.showCollection(getDBPodcast());
		int idPodcastToModify = view.askForInt("Introduce el ID del podcast a modificar: ");

		Optional<Podcast> podcast = getDBPodcast().stream().filter(p -> p.getIdPodcast() == idPodcastToModify)
				.findFirst();

		return podcast.orElseThrow(() -> new Exception("Podcast no encontrado con ese id"));
	}

	@Override
	public boolean deletePodcast(Podcast p) {

		try (Statement query = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet crs = query.executeQuery("select idPodcast from Podcast");) {

			while (crs.next()) {
				if (p.getIdPodcast() == crs.getInt("idPodcast")) {
					deleteGen_pod(p.getIdPodcast()); /* Delete first the relationships in gen_pod */
					crs.deleteRow();
					view.showMessage("Podcast " + p.getTitulo() + " eliminado correctamente");
					return true;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private void deleteGen_pod(int idPodcast) {
		try (Statement query = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet crs = query.executeQuery("select * from gen_pod");) {

			while (crs.next()) {
				if (crs.getInt("idpodcat") == idPodcast) {
					crs.deleteRow();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Podcast> getDBPodcast() {

		String query = "select idPodcast, titulo, tipo, calidad, duracion,"
				+ " periocidad, formato_video, autor from Podcast";
		List<Podcast> podcastList = new ArrayList<>();

		try (CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

			crs.setCommand(query);
			crs.execute(conn);

			while (crs.next()) {
				Podcast aux = new Podcast();

				aux.setIdPodcast(crs.getInt("idPodcast"));
				aux.setTitulo(crs.getString("titulo"));
				aux.setTipo(crs.getByte("tipo"));
				aux.setCalidad(crs.getString("calidad"));
				aux.setDuracion(crs.getInt("duracion"));
				aux.setPeriodicidad(crs.getString("periocidad"));
				aux.setFormatoVideo(crs.getString("formato_video"));
				aux.setAutor(findAuthorByID(crs.getInt("autor")));

				podcastList.add(aux);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<Podcast>();
		}
		return podcastList;
	}

	/* Get autors from DB */
	public List<Autor> getDBAuthors() {

		List<Autor> autorsList = new ArrayList<Autor>();
		try (Statement query = ModifyDB.getConn().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE); ResultSet rs = query.executeQuery("select * from autor");) {

			while (rs.next()) {
				autorsList.add(new Autor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return autorsList;
	}

	public List<Genero> getDBGenders() {

		List<Genero> gendersList = new ArrayList<>();
		try (CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

			crs.setCommand("select * from Generos");
			crs.execute(ModifyDB.getConn());

			while (crs.next()) {
				gendersList.add(new Genero(crs.getInt(1), crs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gendersList;
	}

	/**
	 * 
	 * @param idAuthor
	 * @return
	 * @throws SQLException
	 */
	private Autor findAuthorByID(int idAuthor) throws SQLException { // rehacer pero no tan basto

		try (CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

			crs.setCommand("select idAutor, dni, apellidos, nombre from Autor");
			crs.execute(conn);

			while (crs.next()) {
				if (crs.getInt("idAutor") == idAuthor) {
					return new Autor(crs.getInt("idAutor"), crs.getString("dni"), crs.getString("apellidos"),
							crs.getString("nombre"));
				}
			}
		}
		return null; // ??
	}

	public Podcast getPodcastFromDB(int id) {

		String query = "select * from Podcast where idPodcast = ?";
		Podcast aux = new Podcast();
		try (CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

			crs.setCommand(query);
			crs.setInt(1, id);
			crs.execute(conn);

			while (crs.next()) {
				aux.setIdPodcast(crs.getInt("idPodcast"));
				aux.setTitulo(crs.getString("titulo"));
				aux.setTipo(crs.getByte("tipo"));
				aux.setCalidad(crs.getString("calidad"));
				aux.setDuracion(crs.getInt("duracion"));
				aux.setPeriodicidad(crs.getString("periocidad"));
				aux.setFormatoVideo(crs.getString("formato_video"));

				aux.setAutor(findAuthorByID(crs.getInt("autor")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return aux;
	}

	/* Getters and Setters */
	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		ModifyDB.conn = conn;
	}

	/*
	 * ESTE METODO NO SE USA, SE USA EN LA CLASE VIEW PARA REUTILIZAR CODIGO CON
	 * GENERICOS
	 */
	@Override
	public List<Podcast> viewAllPodcast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Podcast findByIdPodcast(int id) {
		Podcast aux = new Podcast();
		int input = -1;
		
		if (!getDBPodcast().stream().anyMatch(podcast -> podcast.getIdPodcast() == id)) {
			view.showMessage("Podcast no encontrado");
			return null;
		}

		try (Statement query = ModifyDB.getConn().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE); ResultSet crs = query.executeQuery("select * from podcast");){
			
			crs.beforeFirst();
			
			crs.absolute(id);
			aux.setIdPodcast(crs.getInt("idPodcast"));
            aux.setTitulo(crs.getString("titulo"));
            aux.setTipo(crs.getByte("tipo"));
            aux.setCalidad(crs.getString("calidad"));
            aux.setDuracion(crs.getInt("duracion"));
            aux.setPeriodicidad(crs.getString("periocidad"));
            aux.setFormatoVideo(crs.getString("formato_video"));
            aux.setAutor(findAuthorByID(crs.getInt("autor")));
            view.showPodcast(aux);
			
			do {
				input = view.askForInt("Deseas ver el podcast anterior o siguiente? (1: Anterior, 2: Siguiente, 3: Salir");
				
				if (input == 1) {
                    crs.previous();
                    aux.setIdPodcast(crs.getInt("idPodcast"));
                    aux.setTitulo(crs.getString("titulo"));
                    aux.setTipo(crs.getByte("tipo"));
                    aux.setCalidad(crs.getString("calidad"));
                    aux.setDuracion(crs.getInt("duracion"));
                    aux.setPeriodicidad(crs.getString("periocidad"));
                    aux.setFormatoVideo(crs.getString("formato_video"));
                    aux.setAutor(findAuthorByID(crs.getInt("autor")));
                    view.showPodcast(aux);
                    
                    
                } else if (input == 2) {
                    crs.next();
                    aux.setIdPodcast(crs.getInt("idPodcast"));
                    aux.setTitulo(crs.getString("titulo"));
                    aux.setTipo(crs.getByte("tipo"));
                    aux.setCalidad(crs.getString("calidad"));
                    aux.setDuracion(crs.getInt("duracion"));
                    aux.setPeriodicidad(crs.getString("periocidad"));
                    aux.setFormatoVideo(crs.getString("formato_video"));
                    aux.setAutor(findAuthorByID(crs.getInt("autor")));
                    view.showPodcast(aux);
                }
		} while (input != 3);
			
			} catch (SQLException e) {
			view.showMessage("No hay podcast anterior o siguiente");
		}
		return aux;
	}

	 
		
}