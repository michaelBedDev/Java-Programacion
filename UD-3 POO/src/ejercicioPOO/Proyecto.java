package ejercicioPOO;

public class Proyecto {

	private String nombreProy;
	private Departamento departamento;
	private double presupuesto;
	private int duracionMeses;
	
	private Cientifico cientifico1;
	private Cientifico cientifico2;
	private Cientifico cientifico3;
	
	
	
	public String toString() {
		
		return "El nombre del proyecto es " + nombreProy
				+ ", el departamento del proyecto es " + departamento
				+ ", el presupuesto son " + presupuesto
				+ "€ y la duración del proyecto son " + duracionMeses + " meses.\n"
						+ "Los científicos que trabajan son: \n" + cientifico1
						+ "\n" + cientifico2 + "\n" + cientifico3;
	}
	
	
	//CONSTRUCTORES
	public Proyecto() {
		
	}
	
	public Proyecto(Cientifico a, Cientifico b) {
		setCientifico1(a);
		setCientifico2(b);
	}
	
	public Proyecto(Cientifico a, Cientifico b, Cientifico c) {
		setCientifico1(a);
		setCientifico2(b);
		setCientifico3(c);
	}
	
	//Calcular Presupuesto
	public double calcPresupuesto() {
		int numCientificos = 0;
		numCientificos = getCientifico1() != null ? numCientificos +=1 : numCientificos; 
		numCientificos = getCientifico2() != null ? numCientificos +=1 : numCientificos; 
		numCientificos = getCientifico3() != null ? numCientificos +=1 : numCientificos; 
		return duracionMeses*numCientificos*5000;
	}
	
	//ASIGNAR CIENTIFICO A PROYECTO
	public void asignar(int orden, Cientifico z) {
		Cientifico asignacion;
		asignacion = (orden == 1) ? cientifico1 = z : z;
		asignacion = (orden == 2) ? cientifico2 = z : z;
		asignacion = (orden == 3) ? cientifico3 = z : z;
		
		
		/*switch (orden) {
			case 1:
				this.setCientifico1(z);
				break;
			case 2:
				this.setCientifico2(z);
				break;
			case 3:
				this.setCientifico3(z);
				break;
			default:
				System.out.println("Introduce el orden de científicos");
				break;
		}*/
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


	public Cientifico getCientifico1() {
		return cientifico1;
		
	}


	public void setCientifico1(Cientifico cientifico1) {
		this.cientifico1 = cientifico1;
		
	}


	public Cientifico getCientifico2() {
		return cientifico2;
		
	}


	public void setCientifico2(Cientifico cientifico2) {
		this.cientifico2 = cientifico2;
		
	}


	public Cientifico getCientifico3() {
		return cientifico3;
		
	}


	public void setCientifico3(Cientifico cientifico3) {
		this.cientifico3 = cientifico3;
		
	}
}
