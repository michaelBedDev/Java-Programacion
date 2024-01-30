package polimorfismoEjercicio3;

public class GPS {

	private String coordenadaX;
	private String coordenadaY;
	private String fechaYHora;
	private int diasTripulado;
	
	
	
	
	public GPS() {
		super();
		//TODO Auto-generated constructor stub
	}
	public GPS(String coordenadaX, String coordenadaY, String fechaYHora, int diasTripulado) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.fechaYHora = fechaYHora;
		this.diasTripulado = diasTripulado;
	}
	
	
	
	
	public String getCoordenadaX() {
		return coordenadaX;
	}
	public void setCoordenadaX(String coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	public String getCoordenadaY() {
		return coordenadaY;
	}
	public void setCoordenadaY(String coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	public String getFechaYHora() {
		return fechaYHora;
	}
	public void setFechaYHora(String fechaYHora) {
		this.fechaYHora = fechaYHora;
	}
	public int getDiasTripulado() {
		return diasTripulado;
	}
	public void setDiasTripulado(int diasTripulado) {
		this.diasTripulado = diasTripulado;
	}
	
	
	
	
	
	
}
