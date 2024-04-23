package db_tarea_ud9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class ModifyDB implements IPodcast {

	@Override // validate autor is in bbdd
	public boolean insertPodcast(Podcast p) {
		try (Connection conn = AccessToDB.getInstance();
				CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

			// necesario select * from Podcast ?
			crs.moveToInsertRow();

			crs.updateInt("idPodcast", p.getIdPodcast());
			crs.updateString("titulo", p.getTitulo());
			crs.updateInt("tipo", p.getTipo());
			crs.updateString("calidad", p.getCalidad());
			crs.updateInt("duracion", p.getDuracion());
			crs.updateString("periocidad", p.getPeriodicidad());
			crs.updateString("formato_video", p.getFormato_video());
			crs.updateInt("autor", p.getAutor().getIdAutor());

			crs.insertRow();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private boolean isAuthorinDB(int authorID) throws SQLException {

		try (Connection conn = AccessToDB.getInstance();
				CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {

			crs.setCommand("select idAutor from Autor");
			crs.execute();
			while (crs.next()) {

				if (crs.getInt("idAutor") == authorID) {
					return true;
				}
			}
		}
		return false;
	} //Continuar

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

	@Override // verificar autor
	public List<Podcast> viewAllPodcast(RowSet rs) {

		String query = "select idPodcast, titulo, tipo, calidad, duracion,"
				+ " periocidad, formato_video, autor from Podcast";
		List<Podcast> podcastList = new ArrayList<>();
		try {
			rs.setCommand(query);
			rs.execute();

			while (rs.next()) {
				Podcast aux = new Podcast();

//				rs.getInt("idPodcast"), rs.getString("titulo"),
//						rs.getByte("titulo"), rs.getString("calidad"), rs.getInt("duracion"),
//						rs.getString("periocidad"),new Autor(rs.getInt("autor"),"","",""));
//				
//				int idPodcast, String titulo, byte tipo,
//				String calidad, int duracion, String periodicidad,
//				String formato_video, Autor autor
//				

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

			while (rs.next()) {
				aux.setIdPodcast(rs.getInt("idPodcast"));
				aux.setTitulo(rs.getString("titulo"));
				aux.setTipo(rs.getByte("tipo"));
				aux.setCalidad(rs.getString("calidad"));
				aux.setDuracion(rs.getInt("duracion"));
				aux.setPeriodicidad(rs.getString("periocidad"));
				aux.setFormato_video(rs.getString("formato_video")); //
				aux.setAutor(null); // revisar
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return aux;

	}

	public void demo() {
		Podcast default = new Podcast();
		insertPodcast(null)
	}

	@Override
	public boolean newGenPodcast(Genero g) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePodcast(Podcast p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePodcast(Podcast p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Podcast> viewAllPodcast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Podcast findByIdPodcast(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
