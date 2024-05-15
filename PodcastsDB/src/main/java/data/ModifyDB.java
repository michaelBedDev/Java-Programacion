package data;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

			// Verify if the idPodcast is unique or set a new one
			//rs = validateID(rs, p);
			
			//ARREGLAR A PARTIR DE AQUI
			

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

			// Verify the author is already in DB. If not, create one;
			if (isAuthorinDB(p.getAutor().getIdAutor())) {
				rs.updateInt("autor", p.getAutor().getIdAutor());
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

		try (CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

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

		try (CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

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
	private boolean isGenderIDUnique(int idGender) throws SQLException {

		try (CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

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
	public boolean deletePodcast(Podcast p) {

		try (Statement query = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet crs = query.executeQuery("select idPodcast from Podcast");) {

			boolean eliminado = false;

			while (crs.next()) {
				if (p.getIdPodcast() == crs.getInt("idPodcast")) {
					crs.deleteRow();
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

	public List<Autor> getDBAuthors() {
		try (Statement query = ModifyDB.getConn().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_UPDATABLE); ResultSet rs = query.executeQuery("select * from autor");) {

			while (rs.next()) {
				Autor autor = new Autor();
				autor.setIdAutor(rs.getInt(1));
				autor.setDni(rs.getString(2));
				autor.setApellidos(rs.getString(3));
				autor.setNombre(rs.getString(4));
				view.showMessage(autor.toString());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Genero> getDBGenders() {
		try (CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

			crs.setCommand("select * from Generos");
			crs.execute(ModifyDB.getConn());

			while (crs.next()) {
				// REHACER
				view.sho(new Genero(crs.getInt(1), crs.getString(2)));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param idAuthor
	 * @return
	 * @throws SQLException
	 */
	private Autor findAuthorByID(int idAuthor) throws SQLException {

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

	@Override
	public Podcast findByIdPodcast(int id) {

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
}
