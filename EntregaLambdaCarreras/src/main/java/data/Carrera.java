package data;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Carrera {

	private String nombre;
	private String fecha;
	private double kms;
	private final int[] premios; 
	private ArrayList<Equipo> equipos;
	
	
	public Carrera() {
		this.premios = new int[] {25,18,15};
		this.equipos = new ArrayList<>();
	}
	
	public Carrera(String nombre, String fecha, double kms) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.kms = kms;
		this.equipos = new ArrayList<>();
		this.premios = new int[] {25,18,15};
	}

	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public int[] getPremios() {
		return premios;
	}
	
	public HashMap<Participante, Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(HashMap<Participante, Equipo> equipos) {
		this.equipos = equipos;
	}

	
	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", fecha=" + fecha + ", kms=" + kms + ", premios="
				+ Arrays.toString(premios) + ", equipos=" + equipos + "]";
	}
}
