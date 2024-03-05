package ejercicio;

import java.util.Arrays;
import java.util.LinkedList;

public class Producto {

	private String codProd;
	private String tipo;
	private String nombre;
	private double precio;
	private String pais;

	LinkedList<Proveedor> listaProveedores;

	// Constructores
	protected Producto(String codProd, String tipo, String nombre, double precio, String pais) {
		super();
		this.codProd = codProd;
		this.tipo = tipo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.listaProveedores = new LinkedList<Proveedor>();
	}

	protected Producto() {
		super();
		this.listaProveedores = new LinkedList<Proveedor>();
	}

	public String getCodProd() {
		return codProd;
	}

	public void setCodProd(String codProd) {
		this.codProd = codProd;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public LinkedList<Proveedor> getListaProveedores() {
		return listaProveedores;
	}

	public void setListaProveedores(LinkedList<Proveedor> listaProveedores) {
		this.listaProveedores = listaProveedores;
	}

	@Override
	public String toString() {
		return codProd + ":" + nombre + ":" + precio + ":" + pais + ":" + Arrays.asList(listaProveedores);
	}
}
