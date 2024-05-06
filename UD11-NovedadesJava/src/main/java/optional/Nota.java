package optional;

import java.util.ArrayList;
import java.util.List;

public class Nota {

	private String asignatura;
	private double valor;

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Nota(String asignatura, double valor) {
		super();
		this.asignatura = asignatura;
		this.valor = valor;
	}
}

class Principal {

	public static void main(String[] args) {

		List<Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota("matematicas", 3));
		notas.add(new Nota("lengua", 10));
		notas.add(new Nota("ingles", 5));
		notas.add(new Nota("fisica", 7));

		Nota nota = buscarNotaSobresaliente(notas);

		// Estas sentencias nos pueden generar el típico java.lang.NullPointerExcepcion
		System.out.println(nota.getValor());
		System.out.println(nota.getAsignatura());
	}

	public static Nota buscarNotaSobresaliente(List<Nota> notas) {

		Nota nota = null;
		for (Nota unaNota : notas) {

			if (unaNota.getValor() >= 9) {
				nota = unaNota;
			}
		}

		return nota;
	}
}
