package data;

import java.util.Arrays;

public class Equipo {

	private String nombre;
	private double puntosAcumulados;
	private Participante capitan;
	private Participante[] participantes; /* max 5 participantes */
	
	
	public Equipo() {
		super();
		
	}
	public Equipo(String nombre, double puntosAcumulados, Participante capitan, Participante[] participantes) {
		super();
		this.nombre = nombre;
		this.puntosAcumulados = puntosAcumulados;
		this.capitan = capitan;
		this.participantes = participantes;
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
	public Participante getCapitan() {
		return capitan;
	}
	public void setCapitan(Participante capitan) {
		this.capitan = capitan;
	}
	public Participante[] getParticipantes() {
		return participantes;
	}
	public void setParticipantes(Participante[] participantes) {
		this.participantes = participantes;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", puntosAcumulados=" + puntosAcumulados + ", capitan=" + capitan
				+ ", participantes=" + Arrays.toString(participantes) + "]";
	}
}
