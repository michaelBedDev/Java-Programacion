package herenciaEjercicio2;

public class Cliente extends Persona{

	protected int deuda;
	
	public Cliente(int deuda, String DNI, String nombre, String dirección) {
		super(DNI,nombre,dirección);
		this.deuda = deuda;
	}

	@Override
	public String toString() {
		return super.toString() + "deuda: " + deuda;
	}
}

