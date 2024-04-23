package db_tarea_ud9;

import java.util.List;

public interface IPodcast {

	/**
	 * Try to add a new Podcast to DB.
	 * Need to validate if the author is already in DB
	 * If IDPodcast repeated, set to the object loop IDPodcast+1
	 * @param p Podcast
	 * @return boolean if completed succesfully
	 */
	boolean insertPodcast (Podcast p);

	boolean newGenPodcast(Genero g);

	boolean updatePodcast(Podcast p); 

	boolean deletePodcast(Podcast p);

	List <Podcast> viewAllPodcast();

	Podcast findByIdPodcast (int id); 
}
