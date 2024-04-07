package supermercado;

public class Producto implements Comparable<Producto> {

	private String idProducto; //Formato B-3456
	private String descripcion;
	private double importeProducto; //Siempre positivo
	
	
	
	
	protected Producto() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	protected Producto(String idProducto, String descripcion, double importeProducto) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.importeProducto = importeProducto;
	}

	
	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getImporteProducto() {
		return importeProducto;
	}

	public void setImporteProducto(double importeProducto) {
		this.importeProducto = importeProducto;
	}

	
	
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", importeProducto="
				+ importeProducto + "]";
	}

	@Override
	public int compareTo(Producto o) {
		return Double.compare(this.importeProducto, o.importeProducto);
	}
}
