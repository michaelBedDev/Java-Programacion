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
	
	public void iniciarAventura() {
		System.out.println("Hola entrenador! Mi nombre es el prof.OAK");
		System.out.println("Bienvenido al maravilloso mundo de los pokémon");
		System.out.println("Dime, cómo te llamas?");
		sc = new Scanner(System.in);
		this.nombre =sc.nextLine();
		System.out.println("Fantástico! A partir de ahora te llamaré " + this.nombre);
	}
	
	
	public Pokemon [] crearEquipo() {
		for(int i =1; i <=5; i++) {
			Pokemon po#1 = new Pokemon();
		}
		return equipoPokemon;
	}
	
	public void agregarPokemon(Pokemon poke) {
		int seleccion;
		do {
			System.out.println("En qué posición quieres agregar el pokemon? [0-4]");
			sc = new Scanner (System.in); 
			seleccion = sc.nextInt();
			this.equipoPokemon[seleccion] = poke;
		} while (seleccion < 0 || seleccion > 4); 
	}
	
	public void eliminarPokemonPosicion() {
		int seleccion;
		do {
			System.out.println("En qué posición quieres agregar el pokemon? [0-4]");
			sc = new Scanner (System.in); 
			seleccion = sc.nextInt();
			this.equipoPokemon[seleccion] = null;
		}   while (seleccion < 0 || seleccion > 4); 
	}
	
	public void eliminarPokemonNombre() throws InterruptedException {
		String vacio = ""; int contador=0;
		System.out.println("Introduce el nombre del pokémon a eliminar:");
		
			for (Pokemon n : this.equipoPokemon)
				System.out.println(n.getNombre());
			System.out.println();
			
			String pokemonToEliminar = sc.nextLine();

		for (Pokemon n : this.equipoPokemon)
			if (n!=null) {
				contador++;
				if (n.getNombre().equals(pokemonToEliminar))
					this.equipoPokemon[contador]= null;
				Menu.barraCargando();
				System.out.println("Pokemon eliminado correctamente");
			}
	}
	public void mostrarEquipo() {
		for (Pokemon n : this.equipoPokemon)
			if (n!=null) {
				n.mostrarDatos();
			}
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
