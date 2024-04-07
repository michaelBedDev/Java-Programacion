package supermercado;

import java.util.ArrayList;

public class Cesta {

	private String idCliente;
	private ArrayList<Producto> productosAComprar;

	private boolean descuento;
	private double importeTotal;
	private double importeConDescuento;
	

	protected Cesta() {
		super();
		productosAComprar = new ArrayList<>();
		//TODO Auto-generated constructor stub
	}

	protected Cesta(String idUsuario, boolean descuento) {
		super();
		this.idCliente = idUsuario;
		this.productosAComprar = new ArrayList<>();
		this.descuento = descuento;
	}
	
	public void calcularImporteTotal() { //Calcula el importe total de la cesta
		importeTotal = productosAComprar.stream().mapToDouble(p -> p.getImporteProducto()).sum();
		importeConDescuento = this.descuento ? importeTotal * 0.95 : importeTotal;
	}

	
	
	
	public String getidCliente() {
		return idCliente;
	}
	public void setidCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public ArrayList<Producto> getProductosAComprar() {
		return productosAComprar;
	}
	public void setProductosAComprar(ArrayList<Producto> productosAComprar) {
		this.productosAComprar = productosAComprar;
	}
	public boolean isDescuento() {
		return descuento;
	}
	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}
	public double getImporteTotal() {
		return importeTotal;
	}
	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}
	

	
	@Override
	public String toString() {
		return "Cesta [idUsuario=" + idCliente + ", descuento=" + descuento
				+ ", importeTotal=" + importeTotal + ", importeConDescuento=" + importeConDescuento 
				+ ", productosAComprar=" + productosAComprar + "]";
	}

	public double getImporteConDescuento() {
		return importeConDescuento;
	}

	public void setImporteConDescuento(double importeConDescuento) {
		this.importeConDescuento = importeConDescuento;
	}
}