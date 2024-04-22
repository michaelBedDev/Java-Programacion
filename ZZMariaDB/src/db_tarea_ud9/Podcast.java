package db_tarea_ud9;

import java.util.HashSet;

public class Podcast {

	private int idPodcast;
	private String titulo;
	private byte tipo;
	private String calidad;
	private int duracion;
	private String periodicidad;
	private String formato_video;
	private Autor autor;
	private HashSet<Genero> generos;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Podcast() {
		super();
	}

	public Podcast(int idPodcast, String titulo, byte tipo, String calidad, int duracion, String periodicidad,
			String formato_video, Autor autor) {
		super();
		this.idPodcast = idPodcast;
		this.titulo = titulo;
		this.tipo = tipo;
		this.calidad = calidad;
		this.duracion = duracion;
		this.periodicidad = periodicidad;
		this.formato_video = formato_video;
		this.autor = autor;
	}
	
	public HashSet<Genero> getGeneros() {
		return generos;
	}

	public void setGeneros(HashSet<Genero> generos) {
		this.generos = generos;
	}

	public int getIdPodcast() {
		return idPodcast;
	}
	public void setIdPodcast(int idPodcast) {
		this.idPodcast = idPodcast;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public byte getTipo() {
		return tipo;
	}
	public void setTipo(byte tipo) {
		this.tipo = tipo;
	}
	public String getCalidad() {
		return calidad;
	}
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getPeriodicidad() {
		return periodicidad;
	}
	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}
	public String getFormato_video() {
		return formato_video;
	}
	public void setFormato_video(String formato_video) {
		this.formato_video = formato_video;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Podcast [idPodcast=" + idPodcast + ", titulo=" + titulo + ", tipo=" + tipo + ", calidad=" + calidad
				+ ", duracion=" + duracion + ", periodicidad=" + periodicidad + ", formato_video=" + formato_video
				+ ", autor=" + autor + ", generos=" + generos + "]";
	}
}
