package ejercicio2;

public class Factura {

	private String numPieza;
	private String descripcionPieza;
	private int cantidadArticulos;
	private double precioArticulo;
	
	//CONSTRUCTORES
	Factura () {}
	Factura (String nPieza, String dPieza, int cArticulos, double prizArticulo) {
		this.numPieza = nPieza;
		this.descripcionPieza = dPieza;
		this.cantidadArticulos = cArticulos;
		this.precioArticulo = prizArticulo;
	}
	
	public double obtenerMontoFactura() {
		return this.cantidadArticulos*this.precioArticulo;
	} 
	
	
	
	//GETTERS AND SETTERS
	public String getNumPieza() {
		return numPieza;
	}
	public void setNumPieza(String numPieza) {
		this.numPieza = numPieza;
	}
	public String getDescripcionPieza() {
		return descripcionPieza;
	}
	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}
	public int getCantidadArticulos() {
		return cantidadArticulos;
	}
	public void setCantidadArticulos(int cantidadArticulos) {
		this.cantidadArticulos = cantidadArticulos;
	}
	public double getPrecioArticulo() {
		return precioArticulo;
	}
	public void setPrecioArticulo(double precioArticulo) {
		this.precioArticulo = precioArticulo;
	}
	
}
