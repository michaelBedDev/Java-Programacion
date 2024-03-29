package juegoPokemon;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Pokemon {

	private String nombre;
	private TipoPokemon tipo;
	private int vida;
	private int vidaMaxima = 100;
	private int nivel = 1;
	private Pokemon pokefusion; // es fusionable con otro, referencia

	// Constructores
	Pokemon() {
		this.vida = this.vidaMaxima;
		Random rand = new Random();
		int numAleatorio = rand.nextInt(1, 11);
		switch (numAleatorio) {
		case 1, 2, 3 -> this.tipo = TipoPokemon.SQUIRTLE;
		case 4, 5, 6 -> this.tipo = TipoPokemon.CHARMANDER;
		case 7, 8, 9 -> this.tipo = TipoPokemon.BULBASAUR;
		case 10 -> this.tipo = TipoPokemon.PIKACHU;
		}
	}

	Pokemon(String nombre) {
		this.vida = this.vidaMaxima;
		this.nombre = nombre;
		Random rand = new Random();
		int numAleatorio = rand.nextInt(1, 11);
		switch (numAleatorio) {
		case 1, 2, 3 -> this.tipo = TipoPokemon.SQUIRTLE;
		case 4, 5, 6 -> this.tipo = TipoPokemon.CHARMANDER;
		case 7, 8, 9 -> this.tipo = TipoPokemon.BULBASAUR;
		case 10 -> this.tipo = TipoPokemon.PIKACHU;
		}
	}

	// Metodos
	public void asignarNombreAPokemon() {

		System.out.println("Dime, cómo se llama tu pokémon? Pulsa [enter] para no introducir ningún mote");
		Scanner sc = new Scanner(System.in);
		String nombrePoke = sc.nextLine();
		
		this.nombre = (nombrePoke == "") ? getTipo().toString() : nombrePoke;
		System.out.println("Fantástico! " + getNombre() + " ya es parte de tu equipo\n");
	}

	public void sanarTotalmente() {
		setVida(100);
	}

	public void tomarPocion(int vida) {
		setVida(this.vida + vida);
		if (this.vida > vidaMaxima)
			setVida(vidaMaxima);
	}

	public void tomarPocion(float porcentaje) {
		int vidaCurada = (int) (this.vida * porcentaje / 100);
		setVida(vida + vidaCurada);
		if (this.vida > vidaMaxima)
			setVida(vidaMaxima);
	}

	public void reducirVida(int cantidad) {
		setVida(this.vida - cantidad);
	}

	public void mostrarDatos() {
		System.out.println("Pokémon: " + nombre);
		System.out.println("Tipo: " + tipo);
		System.out.println("Vida: " + vida);
		System.out.println("VidaMaxima: " + vidaMaxima);
		System.out.println("Nivel: " + nivel);
		System.out.println();
	}


	private void asignarPokemonFusion() {

	}

	// Getters & Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoPokemon getTipo() {
		return tipo;
	}

	public void setTipo(TipoPokemon tipo) {
		this.tipo = tipo;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Pokemon getPokefusion() {
		return pokefusion;
	}

	public void setPokefusion(Pokemon pokefusion) {
		this.pokefusion = pokefusion;
	}
}
