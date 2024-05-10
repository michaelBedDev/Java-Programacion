package data;

import java.util.ArrayList;

import java.util.Objects;
import java.util.Random;

public class Equipo implements IUnique{

	private String id;
	private String nombre;
	private double puntosAcumulados;
	private Participante capitan;
	private ArrayList<Participante> participantes; /* max 5 participantes */
	
	
	public Equipo() {
		super();
		this.participantes = new ArrayList<>();
		generateID();
		
	}
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.participantes = new ArrayList<>();
		generateID();
	}
	
	
	public void seleccionarCapitan() {
		Random rand = new Random();
		capitan = participantes.get(rand.nextInt(participantes.size()));
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPuntosAcumulados() {
		return puntosAcumulados;
	}
	public void setPuntosAcumulados(double puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}
	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Participante getCapitan() {
		return capitan;
	}
	public void setCapitan(Participante capitan) {
		this.capitan = capitan;
	}
	
	
	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", puntosAcumulados=" + puntosAcumulados + ", capitan="
				+ capitan + ", participantes=" + participantes + "]";
	}
	@Override
	public void generateID() {
		this.id = "E" + (int)(Math.random()*1000);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}
}
