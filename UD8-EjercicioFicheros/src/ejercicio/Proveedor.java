package ejercicio;

public class Proveedor {
	
	private String codProv;
	private String nombre;
	private String direccion;
	
	
	//Constructores
	protected Proveedor() {
		super();
		//TODO Auto-generated constructor stub
	}

	protected Proveedor(String codProv, String nombre, String direccion) {
		super();
		this.codProv = codProv;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	
	
	
	
	public String getCodProv() {
		return codProv;
	}

	public void setCodProv(String codProv) {
		this.codProv = codProv;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Proveedor [codProv=" + codProv + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
}
