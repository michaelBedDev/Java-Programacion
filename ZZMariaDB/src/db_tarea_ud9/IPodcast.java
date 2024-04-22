package db_tarea_ud9;

import java.sql.SQLException;
import java.util.List;

import javax.sql.RowSet;

public interface IPodcast {

	boolean insertPodcast (Podcast p, RowSet rs) throws SQLException;

	boolean newGenPodcast(Genero g, RowSet rs) throws SQLException;

	boolean updatePodcast(Podcast p, RowSet rs) throws SQLException;

	boolean deletePodcast(Podcast p, RowSet rs) throws SQLException;

	List <Podcast> viewAllPodcast(RowSet rs) throws SQLException;

	Podcast findByIdPodcast (int id, RowSet rs) throws SQLException;
}
