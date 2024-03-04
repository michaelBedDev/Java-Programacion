package juegoPokemon;

public class App {

	public static void main(String[] args) throws InterruptedException {

		Entrenador trainer = new Entrenador("Ash");
		Pokemon pokemon = new Pokemon("Tu Primer Pokémon");
		trainer.agregarPokemonInicial(pokemon);

		Menu menu = new Menu();
		Menu.dibujoInicial();
		menu.seleccionarAccion(trainer);
	}

}
