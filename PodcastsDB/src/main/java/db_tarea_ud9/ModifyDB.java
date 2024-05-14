package db_tarea_ud9;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import userAndMenu.Usuario;

public class ModifyDB implements IPodcast {

	@Override
	public boolean insertPodcast(Podcast p) {
		try (Connection conn = AccessToDB.getInstance();
				Statement query = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet crs = query.executeQuery("select * from Podcast")) {

			crs.moveToInsertRow();

			// if IDPodcast not unique, loop +1
			if (isIDPodcastUnique(p.getIdPodcast())) {
				crs.updateInt("idPodcast", p.getIdPodcast());
			} else {

				do {
					p.setIdPodcast(p.getIdPodcast() + 1);
				} while (!isIDPodcastUnique(p.getIdPodcast()));

				crs.updateInt("idPodcast", p.getIdPodcast());
			}

			crs.updateString("titulo", p.getTitulo());
			crs.updateInt("tipo", p.getTipo());
			crs.updateString("calidad", p.getCalidad());
			crs.updateInt("duracion", p.getDuracion());
			crs.updateString("periocidad", p.getPeriodicidad());
			crs.updateString("formato_video", p.getFormatoVideo());

			// Verify the author is already in DB. If not, create one;
			if (isAuthorinDB(p.getAutor().getIdAutor())) {
				crs.updateInt("autor", p.getAutor().getIdAutor());
			} else {
				System.out.println("El autor no ha sido encontrado en la base de datos. Añade el autor.");
				Autor aux = Usuario.askForAuthor();
				aux.setIdAutor(1);

				// Assign a new id for the new Author. id+1 : don´t
				// add a repeated
				while (isAuthorinDB(aux.getIdAutor())) {
					aux.setIdAutor(aux.getIdAutor() + 1);
				}

				addAuthorToDB(aux);
				System.out.println("Autor agregado correctamente");
				crs.updateInt("autor", aux.getIdAutor());
			}
			crs.insertRow();
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

		try (Connection conn = AccessToDB.getInstance();
				Statement query = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
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

		try (Connection conn = AccessToDB.getInstance();
				CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

			crs.setCommand("select idAutor from Autor");
			crs.execute(conn);
			while (crs.next()) {

				if (crs.getInt("idAutor") == authorID) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Verify if the podcastID is already repeated in DB
	 * 
	 * @param idPodcast
	 * @return boolean
	 * @throws SQLException
	 */
	private boolean isIDPodcastUnique(int idPodcast) throws SQLException {

		try (Connection conn = AccessToDB.getInstance();
				CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

			crs.setCommand("select idPodcast from Podcast");
			crs.execute(conn);
			while (crs.next()) {

				if (crs.getInt("idPodcast") == idPodcast) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean newGenPodcast(Genero g) {

		try (Connection conn = AccessToDB.getInstance();
				Statement query = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet crs = query.executeQuery("select idGeneros, nombre from Generos");) {

			crs.moveToInsertRow();
			// Verify if the idGender is unique
			if (isGenderIDUnique(g.getIdGenero())) {
				crs.updateInt("idGeneros", g.getIdGenero());
			} else {

				do {
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
		System.out.println("Género " + g.getNombre() + "agregado correctamente");
		return true;
	}

	/**
	 * 
	 * @param idGender
	 * @return
	 * @throws SQLException
	 */
	private boolean isGenderIDUnique(int idGender) throws SQLException {

		try (Connection conn = AccessToDB.getInstance();
				CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

			crs.setCommand("select idGeneros from Generos");
			crs.execute(conn);

			while (crs.next()) {
				if (crs.getInt("idGeneros") == idGender) {
					return false;
				}
			}
			return true;
		}

	}

	@Override
	public boolean updatePodcast(Podcast p) {

		return false;
	}

	@Override
	public boolean deletePodcast(Podcast p) { // ARREGLAR

		try (Connection conn = AccessToDB.getInstance();
				Statement query = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet crs = query.executeQuery("select idPodcast from Podcast");) {

			boolean eliminado = false;

			while (crs.next()) {
				if (p.getIdPodcast() == crs.getInt("idPodcast")) {
					crs.deleteRow(); // NO FUNCIONA
					System.out.println("Podcast " + p.getTitulo() + " eliminado correctamente");
					eliminado = true;
				}
			}

			if (!eliminado) {
				System.out.println("No se ha podido eliminar el podcast. No ha sido encontrado");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}



	@Override // verificar autor
	public List<Podcast> viewAllPodcast() {

		String query = "select idPodcast, titulo, tipo, calidad, duracion,"
				+ " periocidad, formato_video, autor from Podcast";
		List<Podcast> podcastList = new ArrayList<>();

		try (Connection conn = AccessToDB.getInstance();
				CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

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

	/**
	 * 
	 * @param idAuthor
	 * @return
	 * @throws SQLException
	 */
	private Autor findAuthorByID(int idAuthor) throws SQLException {

		try (Connection conn = AccessToDB.getInstance();
				CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

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

	@Override
	public Podcast findByIdPodcast(int id) {

		String query = "select * from Podcast where idPodcast = ?";
		Podcast aux = new Podcast();
		try (Connection conn = AccessToDB.getInstance();
				CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

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

//VISUALIZAR SIGUIENTE Y ANTERIOR

	public void showDBGenders() {
		try (Connection conn = AccessToDB.getInstance();
				CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

			crs.setCommand("select * from Generos");
			crs.execute(conn);

			while (crs.next()) {
				System.out.println(new Genero(crs.getInt(1), crs.getString(2)));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void imprimirPodcast(List<Podcast> list) {
		for (Podcast p : list) {
			System.out.println(p);
		}
		
	}

}
