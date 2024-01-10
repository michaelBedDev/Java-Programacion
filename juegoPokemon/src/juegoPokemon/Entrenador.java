package juegoPokemon;

import java.util.Scanner;

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
	
	//Eliminar Pokémon por nombre 
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
	
	
	//Pokefusion
	public void asignarPokemonFusion() throws InterruptedException{
		String vacio = ""; int contador=0;
		this.mostrarEquipo();
		System.out.println("Introduce el nombre del pokémon a fusionar:");
		sc = new Scanner(System.in);
		String pokemonToFusionar = sc.nextLine();
		System.out.println("Introduce el nombre del otro pokémon a fusionar:");
		String pokemonToFusionar2 = sc.nextLine();
		
		Menu.barraCargando();
		System.out.println("Ups! Parece que no funcionó. Estamos en proceso");
		
//		for (int i = 0; i < this.equipoPokemon.length; i++){
//				if (equipoPokemon[i].equals(pokemonToFusionar))
//					this.equipoPokemon[i]= null;
//				else {System.out.println("El nombre escrito no ha sido correcto");}
//				Menu.barraCargando();
	}
	
	
	
	
	public void crearTabla() {
		
		Entrenador N = new Entrenador("N");
		generarPokemon(N);
		Entrenador Misty = new Entrenador("Misty");
		generarPokemon(Misty);
		Entrenador Brock = new Entrenador("Brock");
		generarPokemon(Brock);
		Entrenador Lance = new Entrenador("Lance");
		generarPokemon(Lance);
		Entrenador Cintia = new Entrenador("Cintia");
		generarPokemon(Cintia);
		
		Entrenador [] listaEntrenadores = {N, Misty, Brock, Lance, Cintia};
		
		Pokemon [][] listaPokemon = new Pokemon [5][4];
		listaPokemon[0] = N.equipoPokemon;
		listaPokemon[1] = Misty.equipoPokemon;
		listaPokemon[2] = Brock.equipoPokemon;
		listaPokemon[3] = Lance.equipoPokemon;
		listaPokemon[4] = Cintia.equipoPokemon;
		
		
		int contadorTipos [][] = new int [5][4];
		int contadorSquirtle = 0;int contadorBulbasaur = 0;int contadorCharmander = 0;int contadorPikachu = 0;	

		
		for (int i = 0; i < listaPokemon.length; i++) {
			for(int j = 0; j < listaPokemon[i].length; j++) {
				if (listaPokemon[i][j].getTipo()== TipoPokemon.SQUIRTLE) {
					contadorSquirtle++;
				}
				else if (listaPokemon[i][j].getTipo()== TipoPokemon.BULBASAUR) {
					contadorBulbasaur++;				}
				else if (listaPokemon[i][j].getTipo()== TipoPokemon.CHARMANDER) {
					contadorCharmander++;				}
				else if (listaPokemon[i][j].getTipo()== TipoPokemon.PIKACHU) {
					contadorPikachu++;				}
			}
			
			contadorTipos[i][0] = contadorSquirtle;
			contadorTipos[i][1] = contadorBulbasaur;
			contadorTipos[i][2] = contadorCharmander;
			contadorTipos[i][3] = contadorPikachu;
			
			contadorSquirtle = 0;
			contadorBulbasaur = 0;
			contadorCharmander = 0;
			contadorPikachu = 0;	
		}
		
		
		System.out.println("\t\t  Squirtle\t Bulbasaur\tCharmander\t   Pikachu");
		for(int i = 0; i < contadorTipos.length; i++) {
			System.out.printf("Equipo %s: ", listaEntrenadores[i].getNombre());
			for (int j = 0; j < contadorTipos[i].length; j++) {
				System.out.print("\t\t" + contadorTipos[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	private void generarPokemon(Entrenador n) {
		for(int i =0; i <5; i++) {
			Pokemon Pokemon = new Pokemon();
			n.equipoPokemon[i] = Pokemon;
		}
	}
	
	
	//iniciarAventura
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
