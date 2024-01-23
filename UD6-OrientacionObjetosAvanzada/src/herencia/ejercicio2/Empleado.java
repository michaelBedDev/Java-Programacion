package herencia.ejercicio2;

public class Empleado extends Persona{

	protected int sueldo;
	
	public Empleado(int sueldo, String DNI, String nombre, String Dirección) {
		super(DNI,nombre,Dirección);
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return super.toString() + "sueldo: " + sueldo;
	}
	
	


}
