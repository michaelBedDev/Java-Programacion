package ejercicio2;

public class ValidarDNI {

	public boolean comprobarLetraDNI(String dni) {
		int numDNI = Integer.parseInt(dni.substring(0,8)); //Extraemos el numero de DNI
		numDNI %= 23; //Dividimos entre 23 para saber la letra
		String letraDNI = switch (numDNI) {
			case 0 -> "T";
			case 1 -> "R";
			case 2 -> "W";
			case 3 -> "A";
			case 4 -> "G";
			case 5 -> "M";
			case 6 -> "Y";
			case 7 -> "F";
			case 8 -> "P";
			case 9 -> "D";
			case 10 -> "X";
			case 11 -> "B";
			case 12 -> "N";
			case 13 -> "J";
			case 14 -> "Z";
			case 15 -> "S";
			case 16 -> "Q";
			case 17 -> "V";
			case 18 -> "H";
			case 19 -> "L";
			case 20 -> "C";
			case 21 -> "K";
			case 22 -> "E";
			default -> ("Unexpected value: " + numDNI);
		};
		String letraDNIintro = Character.toString(dni.charAt(8));
		//Comprobamos si la letra resultante equivale a la letra introducida
			if (letraDNI.equals(Character.toString(dni.charAt(8)))) 
				return true;
			else 
				System.out.println("Letra equivocada, inténtelo de nuevo");
				return false;
		}
		
}
