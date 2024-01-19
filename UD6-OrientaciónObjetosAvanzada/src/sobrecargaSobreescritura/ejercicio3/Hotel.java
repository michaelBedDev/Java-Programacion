package sobrecargaSobreescritura.ejercicio3;

public class Hotel {

	Perro[] capacidadPerros = new Perro[10];

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
			
		}
	}

	
	// Metodo usuario asignar desea asignar perro a hotel
	// this.registrarPerro(Hotel.capacidadPerros);
	
	
	
	private void registrarPerro(Perro p) {
		
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
