package tareaRepaso;

public class Investigacion {

	private int identificador;
	private String nombre;
	private double numCalculosInvestigacion;
	
	
	
	
	
	
	//Constructores
	Investigacion(){}
	
	Investigacion(int id, String nombre, double numCalculos){
		this.identificador = id;
		this.nombre = nombre;
		this.numCalculosInvestigacion = numCalculos;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Investigacion [identificador=" + identificador + ", nombre=" + nombre + ", numCalculosInvestigacion="
				+ numCalculosInvestigacion + "]";
	}
	
	//Getters & Setters
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNumCalculosInvestigacion() {
		return numCalculosInvestigacion;
	}
	public void setNumCalculosInvestigacion(double numCalculosInvestigacion) {
		this.numCalculosInvestigacion = numCalculosInvestigacion;
	}
}
