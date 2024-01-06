package ahorcadoClase;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	private Random random = new Random();
	private Scanner sc;
	
	
	private String[] listaPalabras = {"casa","cazo","mandarina","baloncesto"};
	private String palabra;
	private String palabraAsteriscos;
	private char letrasJugadas [] = new char [27]; //Maximo
	private int contadorAhorcado = 0;

	
	
	//METODO
	public void jugar() {
		
		sc = new Scanner(System.in);
		
		
		
		//Creamos nueva palabra, borramos las letras jugadas, contador de errores = 0
		this.palabra = listaPalabras [random.nextInt(0, listaPalabras.length - 1)];
		this.palabraAsteriscos = new String(new char[palabra.length()]).replace('\0', '_');
		borrarLetrasJugadas();
		this.contadorAhorcado = 0;
		
		
		
		//Bucle del juego
		while (contadorAhorcado < 10 && this.palabraAsteriscos.contains("_")){
			
			System.out.println("La palabra es: ");
			System.out.println(this.palabraAsteriscos);
	
			
			if (this.letrasJugadas[0] != '\0') {
				System.out.print("Letras jugadas: ");
			
				for (char c : this.letrasJugadas) {
					if (c != '\0')
						System.out.print(c);
				}
				System.out.println();
			}
			System.out.println();
			
			
			
			//Pedir input al usuario
			String inputUsuario;
			char letraEscogida;
			boolean letraRepetida = false;
			
			do {
				do {
					System.out.println("Jugar la letra (o la palabra si la has adivinado)");
					inputUsuario = sc.next();
					letraEscogida = inputUsuario.charAt(0);
					
				} while (inputUsuario.length() == 0) ; //Se repite el input del usuario siempre que el input sea vacío
				
				
				if (inputUsuario.length() == 1)
					letraRepetida = comprobarLetraRepetida(letraEscogida);
	
			} while (letraRepetida == true);
			
			
			//añadimos letra a letras jugadas
			for (int i = 0; i < this.letrasJugadas.length; i++) {
				if (this.letrasJugadas[i] == '\0') {
					this.letrasJugadas[i] = letraEscogida;
					break;
				}
				else {
					
				}
			}
			
			
			
			//jugar una palabra
			
			if (inputUsuario.length() > 1) {
				
				if (inputUsuario.equals(palabra)) {
					System.out.println("Enhorabuena! Has ganado. La palabra era " + this.palabra);
					return;
				}
				else {
					contadorAhorcado++;
					imprimirDibujo(contadorAhorcado);
				}  
			}
			//jugar una letra
			else {
				jugarLetra(letraEscogida);	
			}
		
		
			if (this.contadorAhorcado == 10)
				System.err.println("Perdiste. Inténtalo de nuevo");
		
			System.out.println();
		}
		
		
	}
	
	
	
	
	
	
	
	//comprobar letra repetida
	private boolean comprobarLetraRepetida (char letraEscogida) {
		
		for(char c : this.letrasJugadas) {
			
			if (c == letraEscogida) {
				System.err.println("Letra Repetida");
				System.out.println("Por favor, introduce una nueva letra");
				System.out.println();
				return true;
			}
		}
		return false;
	}
	
	
	//borrar letras jugadas
	private void borrarLetrasJugadas() {
		for (char c : this.letrasJugadas) {
			if (c != '\0')
				c = '\0';
		}
	}
	
	
	

	//Jugar la letra
	private void jugarLetra(char letraEscogida) {

		String nuevoAsteriscos = "";
		boolean letraEstáEnPalabra = false;
		
		//bucle para crear los asteriscos nuevos
		for(int i = 0; i< this.palabra.length(); i++){
			if (letraEscogida == this.palabra.charAt(i)) {
				nuevoAsteriscos += letraEscogida;
				letraEstáEnPalabra = true;
			}
			else if (this.palabraAsteriscos.charAt(i) != '_') {
                nuevoAsteriscos += this.palabra.charAt(i);
            }
			else 
				nuevoAsteriscos += "_";
		}
		
		this.palabraAsteriscos = nuevoAsteriscos;
		
		
		//si la palabra no está imprimimos dibujo
		if (letraEstáEnPalabra == false) {
			contadorAhorcado++;
			imprimirDibujo(contadorAhorcado);
		}

		if (this.palabraAsteriscos.equals(this.palabra))
			System.out.println("Enhorabuena! Has ganado. La palabra era " + this.palabra);
	}
	
	
	


	//imprimir dibujo
	private void imprimirDibujo(int contador) {
		
		System.out.println();
		
		switch (contador) {
		case 1:
			System.out.println("+------");
			break;
		case 2:
			System.out.println("+\n|\n|\n|\n|\n+------");
			break;
		case 3:
			System.out.println("+----+\n|\n|\n|\n|\n+------");
			break;
		case 4:
			System.out.println("+----+\n|    |\n|\n|\n|\n+------");
			break;
		case 5:
			System.out.println("+----+\n|    |\n|    ()\n|\n|\n+------");
			break;
		case 6: 
			System.out.println("+----+\n|    |\n|    ()\n|    []\n|\n+------");
			break;
		case 7:
			System.out.println("+----+\n|    |\n|    ()\n|   /[]\n|\n+------");
			break;
		case 8:
			System.out.println("+----+\n|    |\n|    ()\n|   /[]\\\n|\n+------");
			break;
		case 9:
			System.out.println("+----+\n|    |\n|    ()\n|   /[]\\\n|    /\n+------");
			break;
		case 10:
			System.out.println("+----+\n|    |\n|    ()\n|   /[]\\\n|    /\\\n+------");
			break;
		}
		
	}

}
	

	

