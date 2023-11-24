package tareaRepaso;

public class Departamento {

	private String nombre;
	private int antiguedad;
	private Cientifico [] listaCientificos = new Cientifico [4];
	private double presupuestoDepartamento;

	
	
	//Constructores
	Departamento(){}

	Departamento(String nombre, int antiguedad, Cientifico cientifico) {
	this.nombre = nombre;
	this.antiguedad = antiguedad;
	}
	
	//this.cientifico = cientifico;
	

	
	//Metodo calcularPresupuestoAnual
	public double calcularPresupuestoAnual(){
		int antiguedadTotal = 0; int empleadosTotales = 0;
		for (Cientifico c : listaCientificos) {
			antiguedadTotal += c.getYearsTrabajados();
			empleadosTotales++;		
		}
		setPresupuestoDepartamento(empleadosTotales /*por*/ + antiguedadTotal);
	}
	

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
	public double getPresupuestoDepartamento() {
		return presupuestoDepartamento;
	}
	public void setPresupuestoDepartamento(double presupuestoDepartamento) {
		this.presupuestoDepartamento = presupuestoDepartamento;
	}
}
