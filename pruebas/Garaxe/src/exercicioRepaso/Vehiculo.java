package exercicioRepaso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Vehiculo {

	private String matricula;
	private String cor;
	private LocalDateTime horaEntrada; 
	private LocalDateTime horaSaida;
	private double deuda;
	

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	public void setCor(String cor) {
		this.cor = cor;
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

	public String getCor() {
		return cor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	// CONSTRUCTORES
	public Vehiculo(String matricula, String cor) {
		this.matricula = matricula;
		this.cor = cor;
	}


	public Vehiculo(String matricula, String cor, LocalDateTime horaEntrada) {
		this.matricula = matricula;
		this.cor = cor;
		this.horaEntrada = horaEntrada;
	}

	public Vehiculo() {
	}

	// OPCION 1 --> PEDIR DATOS
	public void pedirDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cor do vehiculo: ");
		this.cor = sc.nextLine();
		do {
			System.out.println("Matricula do vehiculo: ");
			this.matricula = sc.nextLine();
		} while (!validarMatricula());
	}

	// OPCION 1 --> VALIDAR MATRICULA
	public boolean validarMatricula() {
		return Pattern.matches("\\d{4}\\D{3}", matricula);
	}

	// OPCION 1-- REXISTRAR VEHICULO
	public Vehiculo rexistrarVehiculo() {
		Scanner sc = new Scanner(System.in);
		int resposta;
		do {
			System.out.println("Que tipo de vehículo queres rexistrar?\nEscolle 1 para Coche\nEscolle 2 para Furgoneta");
			resposta = sc.nextInt();
			if (resposta == 1) {
				Coche c = new Coche();
				c.pedirDatos();
				return c;
			} else if (resposta == 2) {
				Furgoneta f = new Furgoneta();
				f.pedirDatos();
				return f;
			}
		} while (resposta != 1 && resposta != 2);
		return null;
	}
	
	
	

	public String toString() {
		return "Matricula: " + this.matricula + "\nCor: " + this.cor;
	}
	public String toStringHoraEntrada() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		return "Matricula: " + this.matricula + " - - - Cor: " + this.cor + "\nÚltima hora de entrada rexistrada " + this.horaEntrada.format(dtf);
	}
	public String toStringDeuda() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		return "Matricula: " + this.matricula + " - - - Cor: " + this.cor + "\nÚltima hora de entrada rexistrada " + this.horaEntrada.format(dtf)
				+ "\nHora de saída rexistrada " + this.horaSaida.format(dtf) + "\nTicket " + this.deuda;
	}

}
