package data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

public class Carrera implements IUnique {

	private String id;
	private String nombre;
	private String fecha;
	private double kms;
	private final int[] premios;
	private HashMap<String, Equipo> equipos;

	public Carrera() {
		this.premios = new int[] { 25, 18, 15 };
		this.equipos = new HashMap<>();
		generateID();
	}

	public Carrera(String nombre, String fecha, double kms) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.kms = kms;
		this.equipos = new HashMap<>();
		this.premios = new int[] { 25, 18, 15 };
		generateID();
	}

	public Equipo getEquipoConMasPuntos() {

		Optional<Equipo> equipoConMasPuntos = getEquipos().values().stream()
				.max(Comparator.comparing(Equipo::getPuntosAcumulados));
		
		return equipoConMasPuntos.orElse(null);
	}
	
	public int getTotalParticipantes() {
		return getEquipos().values().stream().mapToInt(e -> e.getParticipantes().size()).sum();
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

	public HashMap<String, Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(HashMap<String, Equipo> equipos) {
		this.equipos = equipos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Carrera [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", kms=" + kms + ", premios="
				+ Arrays.toString(premios) + ", equipos=" + equipos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(equipos, fecha, kms, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrera other = (Carrera) obj;
		return Objects.equals(equipos, other.equipos) && Objects.equals(fecha, other.fecha)
				&& Double.doubleToLongBits(kms) == Double.doubleToLongBits(other.kms)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public void generateID() {
		this.id = "C" + (int) (Math.random() * 1000);
	}
}
