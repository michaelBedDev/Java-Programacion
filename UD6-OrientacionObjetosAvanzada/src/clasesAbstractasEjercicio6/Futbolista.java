package clasesAbstractasEjercicio6;

public class Futbolista extends IntegranteEquipo {

	private int dorsal;
	private Demarcacion demarcacion;

	public Futbolista(int id, String nombre, int edad, int dorsal, Demarcacion demarcacion) {
		super(id, nombre, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

}
