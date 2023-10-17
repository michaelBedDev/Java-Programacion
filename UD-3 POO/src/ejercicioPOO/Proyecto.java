package ejercicioPOO;

public class Proyecto {

	private String nombreProy;
	private Departamento departamento;
	private double presupuesto;
	private int duracionMeses;
	
	Cientifico cientifico1;
	Cientifico cientifico2;
	Cientifico cientifico3;
	
	
	
	public String toString() {
		
		return "El nombre del proyecto es " + nombreProy
				+ ", el departamento del proyecto es " + departamento
				+ ", el presupuesto es " + presupuesto
				+ " y la duración del proyecto son " + duracionMeses + " meses.";
	}
	
	
	//CONSTRUCTORES
	
	public Proyecto(Cientifico a, Cientifico b) {
		cientifico1 = a;
		cientifico2 = b;
	}
	
	public Proyecto(Cientifico a, Cientifico b, Cientifico c) {
		cientifico1 = a;
		cientifico2 = b;
		cientifico3 = c;
	}
	
	//Calcular Presupuesto
	public double calcPresupuesto(int num_empleados) {
		return duracionMeses*num_empleados*5000;
	}
	
	//ASIGNAR CIENTIFICO A PROYECTO
	public void asignar(int orden, Cientifico z) {
		switch (orden) {
			case 1:
				this.cientifico1 = z;
			case 2:
				this.cientifico2 = z;
			case 3:
				this.cientifico3 = z;
			default:
				System.out.println("Introduce el orden de científicos");
		}
	}
	
	
	
	//GETTERS AND SETTERS
	public String getNombreProy() {
		return nombreProy;
		
	}
	public void setNombreProy(String nombreProy) {
		this.nombreProy = nombreProy;
		
	}
	public Departamento getDepartamento() {
		return departamento;
		
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
		
	}
	public double getPresupuesto() {
		return presupuesto;
		
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
		
	}
	public int getDuracionMeses() {
		return duracionMeses;
		
	}
	public void setDuracionMeses(int duracionMeses) {
		this.duracionMeses = duracionMeses;
		
	}
}
