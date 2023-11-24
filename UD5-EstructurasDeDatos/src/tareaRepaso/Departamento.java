package tareaRepaso;

public class Departamento {

	private String nombre;
	private int antiguedad;
	private Cientifico cientifico;

	
	
	//Constructores
	Departamento(){}

	Departamento(String nombre, int antiguedad, Cientifico cientifico) {
	this.nombre = nombre;
	this.antiguedad = antiguedad;
	this.cientifico = cientifico;
	}

	
	//Metodo calcularPresupuestoAnual

	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", antiguedad=" + antiguedad + ", cientifico=" + cientifico + "]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public Cientifico getCientifico() {
		return cientifico;
	}
	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}
}
