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
	public void alimentarPerros() {

		for (Perro p : capacidadPerros) {
			if (p != null) {
				if (p instanceof PerroEspecial) {
					switch (((PerroEspecial) p).getTipo()) {
						case Delgado -> p.setPeso(p.getPeso() + 1.0);
						case Gordo -> p.setPeso(p.getPeso() + 0.1);
					}
				} else {
					p.setPeso(p.getPeso() + 0.5);
				}
			}
		}
		this.actualizarPesoPerros();
		this.mostrarInfoPerros();
	}

	public void sacarPatio() {
		for (Perro p : capacidadPerros) {
			if (p != null) {
				p.setPeso(p.getPeso() - 0.5);
			}
		}
		Perro.setPesoTotalperros(Perro.getPesoTotalperros() - Perro.getContadorPerros() * 0.5);

		this.actualizarPesoPerros();
		this.mostrarInfoPerros();
	}

	public void mostrarPerros() {
		for (Perro p : capacidadPerros) {
			if (p != null) {
				System.out.println(p.toString());
			}
		}
		this.actualizarPesoPerros();
		this.mostrarInfoPerros();
	}

	public void registrarPerro(Perro p) {

		boolean completo = true;

		for (int i = 0; i < this.capacidadPerros.length; i++) {
			if (capacidadPerros[i] == null) {
				capacidadPerros[i] = p;
				completo = false;

				System.out.println(p.toString());
				System.out.println("Tu perro ha sido registrado en el hotel\n");
				break;
			}
		}
		if (completo) {
			System.err.println("Hotel completo. No se ha registrado al perro.\n");
			Perro.contadorPerros--;
		}

	}

	private void crearPerrosPorDefecto() {
		for (int i = 0; i < capacidadPerros.length / 2; i++) {
			this.capacidadPerros[i] = new Perro("Perro " + (1 + i), 5.0, "Marrón");
		}

		for (int j = 0; j < 2; j++) {
			this.capacidadPerros[capacidadPerros.length / 2 + j] = new PerroEspecial("Perro especial " + (1 + j), 3.0,
					"Blanco", tipoPerro.Delgado);
		}
	}

	private void actualizarPesoPerros() {
		Perro.setPesoTotalperros(0);

		for (Perro p : capacidadPerros) {
			if (p != null) {
				Perro.setPesoTotalperros(Perro.getPesoTotalperros() + p.getPeso());
			}
		}
	}

	private void mostrarInfoPerros() {
		System.out.println("Número de perros totales: " + Perro.contadorPerros);
		System.out.println("Peso total de los perros: " + Perro.pesoTotalperros);
		System.out.println();
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
