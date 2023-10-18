package ejercicioPOO;

public class Cientifico {

	private String nombreCientifico;
	private int edadCientifico;
	private String direccionCientifico;
	
	
	//CONSTRUCTORES
	public Cientifico(String nombre, int edad, String dirección) {
		setNombreCientifico(nombre);
		setEdadCientifico(edad);
		setDireccionCientifico(dirección);
	}
	
	public Cientifico() {
		
	}
	
	//toString
	public String toString() {
		
		return "Datos del científico: " + nombreCientifico + ", edad " + edadCientifico
				+ " Dirección: " + direccionCientifico;
	}
	
	
	//GETTERS AND SETTERS
	public String getNombreCientifico() {
		return nombreCientifico;
		
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
		
	}
	public int getEdadCientifico() {
		return edadCientifico;
		
	}
	public void setEdadCientifico(int edadCientifico) {
		this.edadCientifico = edadCientifico;
		
	}
	public String getDireccionCientifico() {
		return direccionCientifico;
		
	}
	public void setDireccionCientifico(String direccionCientifico) {
		this.direccionCientifico = direccionCientifico;
		
	}
}
