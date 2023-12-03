package tareaRepaso;

public class Cientifico {

	private String nombre;
	private String apellidos;
	private Experiencia exp;
	private int yearsTrabajados = 0;
	private Investigacion investigacionAsignada;


	//Constructores
	Cientifico(){}
	
	Cientifico (String nombre, String apellidos, Experiencia exp, int yearsTrabajados, Investigacion investigacionAsignada ) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.yearsTrabajados = yearsTrabajados;
		this.investigacionAsignada = investigacionAsignada;
		this.exp = exp;
	}
	
		
	//toString
	@Override
	public String toString() {
		return "Cientifico \n\tNombre: " + nombre + " \n\tApellidos: " + apellidos + " \n\tExperiencia: " + exp + " \n\tAñosTrabajados: "
				+ yearsTrabajados + " \n\tInvestigacionAsignada: " + investigacionAsignada;
	}

	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getYearsTrabajados() {
		return yearsTrabajados;
	}
	public void setYearsTrabajados(int yearsTrabajados) {
		this.yearsTrabajados = yearsTrabajados;
	}
	public Investigacion getInvestigacionAsignada() {
		return investigacionAsignada;
	}
	public void setInvestigacionAsignada(Investigacion investigacionAsignada) {
		this.investigacionAsignada = investigacionAsignada;
	}
	public Experiencia getExp() {
		return exp;
	}
	public void setExp(Experiencia exp) {
		this.exp = exp;
	}
}


