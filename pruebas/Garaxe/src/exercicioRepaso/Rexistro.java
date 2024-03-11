package exercicioRepaso;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rexistro {
	
	private String matricula;
	private LocalDateTime horaEntrada;
	private LocalDateTime horaSaida;
	private double deuda;
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public LocalDateTime getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(LocalDateTime horaSaida) {
		this.horaSaida = horaSaida;
	}
	public double getDeuda() {
		return deuda;
	}
	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	
	
	public Rexistro(String matricula, LocalDateTime horaEntrada, LocalDateTime horaSaida, double deuda) {
		this.matricula = matricula;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.deuda = deuda;
	}
	
	
	public String toStringHistorico() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		return "Matricula " + this.matricula + " | " + "Data e hora de entrada " + this.horaEntrada.format(dtf) + " | " +
				"Data e hora de saida " + this.horaSaida.format(dtf) + " | " + "Ticket: " + this.deuda + "€";
	}
	
	public String toStringFacturacion() {
		return "Matricula " + this.matricula + " | " + "Tikect: " + this.deuda + "€";
	}
	
	
	
	
	
	
	
	

}
