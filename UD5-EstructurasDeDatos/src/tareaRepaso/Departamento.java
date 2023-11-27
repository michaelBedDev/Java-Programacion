package tareaRepaso;

public class Departamento {

	private String nombre;
	private int antiguedad;
	private Cientifico [] listaCientificos;
	private double presupuestoDepartamento;

	
	
	//Constructores
	Departamento(){}

	Departamento(String nombre, int antiguedad) {
	this.nombre = nombre;
	this.antiguedad = antiguedad;
	this.listaCientificos = new Cientifico [4];
	}
	
	

	
	//Metodo calcularPresupuestoAnual
	public double calcularPresupuestoAnual(){
		int antiguedadTotal = 0, empleadosTotales = 0, experienciaTotal = 0;;
		
		for (Cientifico c : listaCientificos) {
			antiguedadTotal += c.getYearsTrabajados();
			experienciaTotal += c.getExp();
			empleadosTotales++;		
		}
		double presupuestoDepartamento = empleadosTotales*experienciaTotal + antiguedadTotal;
		setPresupuestoDepartamento(presupuestoDepartamento);
		return presupuestoDepartamento;
	}
	
	
	
    //toString
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", antiguedad=" + antiguedad + ", cientifico=" + listaCientificos + "]";
	}

	//Getters & Setters
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
	public Cientifico[] getListaCientificos() {
		return listaCientificos;
	}
	public void setListaCientificos(Cientifico[] listaCientificos) {
		this.listaCientificos = listaCientificos;
	}
}

