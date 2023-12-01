package juegoPokemon;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Entrenador {

	private String nombre;
	private Pokemon [] equipoPokemon = new Pokemon[5];
	private Scanner sc;

	
	
	
	
	//Constructores
	Entrenador() {}
	Entrenador(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	//Metodos
	
	//Asignar nombre a Entrenador
	public void iniciarAventura() {
		String nombre; String vacío ="";
		System.out.println("Hola entrenador! Mi nombre es el prof.OAK");
		System.out.println("Bienvenido al maravilloso mundo de los pokémon");
		do {
		System.out.println("Dime, cómo te llamas?");
		sc = new Scanner(System.in);
		nombre = sc.nextLine();
		if (nombre == vacío)
			System.out.println("Por favor, introduce un nombre");
		} while (nombre == vacío);
		this.nombre = nombre;
		System.out.println("Fantástico! A partir de ahora te llamaré " + this.nombre);
	}
	
	
	//Crear equipo Pokemon
	public Pokemon [] crearEquipo() {
		System.out.println("Aquí están tus 5 nuevos pokémon!");
		System.out.println();
		for(int i =0; i <5; i++) {
			Pokemon Pokemon = new Pokemon();
			this.equipoPokemon[i] = Pokemon;
			System.out.println("Tu nuevo Pokemon es un " + Pokemon.getTipo());

			Pokemon.asignarNombreAPokemon();
		}
		return equipoPokemon;
	}
	
	
	
	
	
	
	
	
	
	//Encontrarse con Pokemon Aleatorio
	public void encontrarPokemon() throws InterruptedException {
		System.out.println("Un Pokemon salvaje ha aparecido!");
		Pokemon Pokemon = new Pokemon();
		System.out.println("Es un " + Pokemon.getTipo());
		if (capturarPokemon(Pokemon)) {
			Pokemon.asignarNombreAPokemon();
			TimeUnit.SECONDS.sleep(2);
			agregarPokemon(Pokemon);
		}
	}

	
	
	
	
	
	
	//ARREGLAR PARA CUANDO FALLE LA POKEBALL
	//Capturar pokémon
	private boolean capturarPokemon(Pokemon n) throws InterruptedException {
		sc = new Scanner(System.in);
		char seleccion;
		do {
			System.out.println("Deseas capturarlo? [S/N]");
			seleccion = sc.next().toUpperCase().charAt(0);
			if (seleccion == 'S'){
				
				int numAleatorio = lanzarPokéball();
				
				if (numAleatorio%2==0) {
					System.out.println("Enhorabuena! lo has capturado");
					TimeUnit.SECONDS.sleep(3);
					return true;
					
				}else 
					System.out.println("Oh no, la Pokéball no funcionó.");
					TimeUnit.SECONDS.sleep(3);
					return false;
			}
			
			if (seleccion != 'S' && seleccion != 'N')
				System.out.println("Por favor, introduce una de las opciones [S/N]");
		} while(seleccion != 'S' && seleccion != 'N');
		
		return false;
	}
	
	//Lanzar pokéball
	private int lanzarPokéball() throws InterruptedException {
		System.out.println("Lanzando pokéball");
		TimeUnit.MILLISECONDS.sleep(500);
		Menu.barraCargando();
		TimeUnit.SECONDS.sleep(2);
		Random rand = new Random();
		int numAleatorio = rand.nextInt(0,99);
		
		return numAleatorio;
	}
	
	
	
	//Agregar Pokémon
	private void agregarPokemon(Pokemon poke) {
		int seleccion;
		do {
			this.mostrarEquipo();
			System.out.println("En qué posición quieres agregar el nuevo pokemon? [0-4]");
			sc = new Scanner (System.in); 
			seleccion = sc.nextInt();
			this.equipoPokemon[seleccion] = poke;
		} while (seleccion < 0 || seleccion > 4); 
		System.out.println("Genial! " + poke.getNombre() + " te acompañará a partir de ahora en tu aventura.");
	}
	
	public void agregarPokemonInicial(Pokemon poke) {
		this.equipoPokemon[0] = poke;
	}
	
	
	
	//Eliminar pokémon por posición
	public void eliminarPokemonPosicion() throws InterruptedException {
		int seleccion;
		do {
			this.mostrarEquipo();
			System.out.println("En qué posición quieres eliminar el pokemon? [0-4]");
			sc = new Scanner (System.in); 
			seleccion = sc.nextInt();
			this.equipoPokemon[seleccion] = null;
		}while (seleccion < 0 || seleccion > 4); 
		Menu.barraCargando();
		System.out.println("Pokemon eliminado correctamente");
	}
	
	
	
	//Eliminar Pokémon por nombre //ARREGLAR
	public void eliminarPokemonNombre() throws InterruptedException {
		String vacio = ""; int contador=0;
		this.mostrarEquipo();
		System.out.println("Introduce el nombre del pokémon a eliminar:");
		sc = new Scanner(System.in);
		String pokemonToEliminar = sc.nextLine();

		for (Pokemon n : this.equipoPokemon)
			if (n!=null) {
				contador++;
				if (n.getNombre().equals(pokemonToEliminar))
					this.equipoPokemon[contador-1]= null;
				Menu.barraCargando();
				System.out.println("Pokemon eliminado correctamente");
			}
	}
	
	
	//Mostrar equipo Pokémon
	public void mostrarEquipo() {
		System.out.println("Tu equipo pokémon actual es: ");
		System.out.println();
		for (Pokemon n : this.equipoPokemon)
			if (n!=null) {
				n.mostrarDatos();
			}
		System.out.println();
	}
	
	public void asignarPokemonFusion(){
		
	}
	
	

	
	
	
	//Getters & Setters
	public Pokemon[] getEquipoPokemon() {
		return equipoPokemon;
	}
	public void setEquipoPokemon(Pokemon[] equipoPokemon) {
		this.equipoPokemon = equipoPokemon;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
