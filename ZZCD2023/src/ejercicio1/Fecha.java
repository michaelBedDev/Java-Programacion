package ejercicio1;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {

		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

	}

	public boolean valida() { // verificación de fecha válida. Devuelve true si es válida.
		return dayMonthOnRange() && dia <= calcularDiasMes();
	}

	private boolean dayMonthOnRange() { // verificación de rango de día y mes. Devuelve false si no está en rango.
		return (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12);
	}
	
	
	private int calcularDiasMes() { // determinamos la cantidad de días del mes:
		int diasMes = 0;

		switch (mes) {

		case 1, 3, 5, 7, 8, 10, 12 -> diasMes = 31;
		case 4, 6, 9, 11 -> diasMes = 30;
		case 2 -> diasMes = esBisiesto() ? 29 : 28; // verificación de año bisiesto
		
		}
		return diasMes;
	}

	private boolean esBisiesto() {
		return ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0)));
	}
}
