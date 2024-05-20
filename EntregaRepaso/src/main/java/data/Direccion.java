package data;

public class Direccion {

	private String calle;
	private int numero;
	private int cp;
	private String ciudad;
	private boolean isPersonal;
	
	
	public Direccion(String calle, int numero, int cp, String ciudad, boolean isPersonal) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.cp = cp;
		this.ciudad = ciudad;
		this.isPersonal = isPersonal; //0 no personal, 1 personal
	}
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public boolean isPersonal() {
		return isPersonal;
	}
	public void setPersonal(boolean isPersonal) {
		this.isPersonal = isPersonal;
	}
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", cp=" + cp + ", ciudad=" + ciudad
				+ ", isPersonal=" + isPersonal + "]";
	}
	
	
}
