package sobrecargaSobreescritura.ejercicio3;

public class Hotel {

	Perro[] capacidadPerros = new Perro[10];

	// Constructor
	public Hotel() {
		// TODO Auto-generated constructor stub
		this.crearPerrosPorDefecto();
	}

	public Hotel(Perro[] capacidadPerros) {
		this.capacidadPerros = capacidadPerros;
	}
	
	
	// Metodos
	private void alimentarPerros() {

		for (Perro p : capacidadPerros) {
			if (p != null) {

				p.setPeso(p.getPeso() + 0.5);
			}
		}
		Perro.pesoTotalperros += Perro.contadorPerros * 0.5;
	}

	private void sacarPatio() {
		for (Perro p : capacidadPerros) {
			if (p != null) {
				p.setPeso(p.getPeso() - 0.5);
			}
		}
		Perro.pesoTotalperros -= Perro.contadorPerros * 0.5;
	}

	public void mostrarPerros() {
		for (Perro p : capacidadPerros) {
			if (p != null) {
				System.out.println(p.toString());
			}
		}
		
		System.out.println("Número de perros totales: " + Perro.contadorPerros);
		System.out.println("Peso total de los perros: " + Perro.pesoTotalperros);
	}

	// Metodo usuario asignar desea asignar perro a hotel
	// this.registrarPerro(Hotel.capacidadPerros);

	public void registrarPerro(Perro p) {

		boolean completo = true;

		for (int i = 0; i < this.capacidadPerros.length; i++) {
			if (capacidadPerros[i] != null) {
				capacidadPerros[i] = p;
				completo = false;
				break;
			}

		}

		if (completo) {
			System.err.println("Hotel completo. No se ha registrado al perro.");
		}

	}

	private void crearPerrosPorDefecto() {
		for (int i = 0; i < capacidadPerros.length / 2; i++) {
			this.capacidadPerros[i] = new Perro("Perro" + (1 + i), 5.0, "Marrón");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	// Getters & Setters
	public Perro[] getCapacidadPerros() {
		return capacidadPerros;
	}

	public void setCapacidadPerros(Perro[] capacidadPerros) {
		this.capacidadPerros = capacidadPerros;
	}

}
