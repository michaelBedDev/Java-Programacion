package db_tarea_ud9;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class AccessToDB implements IPodcast {

	private static AccessToDB instance;

	private AccessToDB() throws SQLException {
		JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
		rs.setUrl("jdbc:mariadb://dbalumnos.sanclemente.local:3314/MCMpodcast_bd");
		rs.setUsername("alumno");
		rs.setPassword("abc123..");
	}

	private AccessToDB(String URL, String username, String password) throws SQLException {
		JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
		rs.setUrl(URL);
		rs.setUsername(username);
		rs.setPassword(password);
	}

	public static AccessToDB getInstance(String URL, String username, String password) throws SQLException {

		if (instance == null) {
			instance = new AccessToDB(URL, username, password);
		}
		return instance;
	}

	public static AccessToDB getInstance() throws SQLException {
		if (instance == null) {
			instance = new AccessToDB();
		}
		return instance;
	}

	@Override // validate autor is in bbdd
	public boolean insertPodcast(Podcast p, RowSet rs) {
		try {

			// necesario select * from Podcast ?
			rs.moveToInsertRow();

			rs.updateInt("idPodcast", p.getIdPodcast());
			rs.updateString("titulo", p.getTitulo());
			rs.updateInt("tipo", p.getTipo());
			rs.updateString("calidad", p.getCalidad());
			rs.updateInt("duracion", p.getDuracion());
			rs.updateString("periocidad", p.getPeriodicidad());
			rs.updateString("formato_video", p.getFormato_video());
			rs.updateInt("autor", p.getAutor().getIdAutor());

			rs.insertRow();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean newGenPodcast(Genero g, RowSet rs) {

		// necesario select * from Genero ?
		try {
			rs.moveToInsertRow();
			rs.updateInt("idGeneros", g.getIdGenero());
			rs.insertRow();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updatePodcast(Podcast p, RowSet rs) {

		return false;
	}

	@Override
	public boolean deletePodcast(Podcast p, RowSet rs) {

		try {
			rs.setCommand("select idPodcast from Podcast");
			rs.execute();
			
			while (rs.next()) {
				if (p.getIdPodcast() == rs.getInt("idPodcast")) {
					rs.deleteRow();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override //verificar autor
	public List<Podcast> viewAllPodcast(RowSet rs) {

		String query = "select idPodcast, titulo, tipo, calidad, duracion,"
				+ " periocidad, formato_video, autor from Podcast";
		List<Podcast> podcastList = new ArrayList<>();
		try {
			rs.setCommand(query);
			rs.execute();
			
			while(rs.next()) {
				Podcast aux = new Podcast();
				
				rs.getInt("idPodcast"), rs.getString("titulo"),
						rs.getByte("titulo"), rs.getString("calidad"), rs.getInt("duracion"),
						rs.getString("periocidad"),new Autor(rs.getInt("autor"),"","",""));
				
				int idPodcast, String titulo, byte tipo,
				String calidad, int duracion, String periodicidad,
				String formato_video, Autor autor
				
				
				podcastList.add(aux);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return podcastList;
	}

	@Override
	public Podcast findByIdPodcast(int id, RowSet rs) {

		String query = "select * from Podcast where idPodcast = ?";
		Podcast aux = new Podcast();
		try {
			rs.setCommand(query);
			rs.setInt(1, id);
			rs.execute();
			
			while(rs.next()) {
				aux.setIdPodcast(rs.getInt("idPodcast"));
				aux.setTitulo(rs.getString("titulo"));
				aux.setTipo(rs.getByte("tipo"));
				aux.setCalidad(rs.getString("calidad"));
				aux.setDuracion(rs.getInt("duracion"));
				aux.setPeriodicidad(rs.getString("periocidad"));
				aux.setFormato_video(rs.getString("formato_video")); //
				aux.setAutor(null); //revisar
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return aux;
		
	}

	public void demo() {

	}
}
