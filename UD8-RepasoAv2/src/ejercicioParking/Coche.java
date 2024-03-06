package ejercicioParking;

public class Coche {

	private String matricula;
	private String color;
	
	
	protected Coche() {
		super();
		//TODO Auto-generated constructor stub
	}
	protected Coche(String matricula, String color) {
		super();
		this.matricula = matricula;
		this.color = color;
	}
	
	
	public void addHuecosParking() {
		Parking.setContadorPlazas(Parking.getContadorPlazas()+1);
	}
	
	public void removeHuecosParking() {
		Parking.setContadorPlazas(Parking.getContadorPlazas()-1);
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", color=" + color + "]";
	}
}
