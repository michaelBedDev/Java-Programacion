package data;

import java.util.Arrays;
import java.util.Random;

public class Equipo {

	private String id;
	private String nombre;
	private double puntosAcumulados;
	private Participante capitan;
	private Participante[] participantes; /* max 5 participantes */
	
	
	public Equipo() {
		super();
		this.participantes = new Participante[5];
		
	}
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.participantes = new Participante[5];
	}
	
	
	public void seleccionarCapitan() {
		Random rand = new Random();
		capitan = participantes[rand.nextInt(0,5)];
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
	public Participante[] getParticipantes() {
		return participantes;
	}
	public void setParticipantes(Participante[] participantes) {
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
				+ capitan + ", participantes=" + Arrays.toString(participantes) + "]";
	}
}
