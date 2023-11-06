

public class Ejercicio6Lambda {

	private static String obtenerTipoDiaDeLaSemana(String day) {
		String tipoDia = switch (day) {
			case "L","M","X","J","V" -> "Laborable";
			case "S","D" -> "Fin de Semana";
			default -> "Día no reconocido";
		};
		return tipoDia;
	}

	
	public static void main(String[] args) {
		String m = "M";
		
		System.out.println(obtenerTipoDiaDeLaSemana(m));
	}
	
	
	

}
