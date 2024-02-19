package ordenacionEjercicio1;

import java.util.Collections;

import java.util.LinkedList;


public class Articulo {
	String codArticulo;
	String descripcion;
	int cantidad;

	Articulo(String codArticulo, String descripcion, int cantidad) {
		this.codArticulo = codArticulo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}
	

	
	
	public static void main(String[] args) {
		Articulo a1 = new Articulo("a1","descripcion",6);
		Articulo a2 = new Articulo("a2","descripcion",2);
		Articulo a3 = new Articulo("a3","descripcion",3);
		
		
		LinkedList<Articulo> listaArticulos = new LinkedList<>();
		
		listaArticulos.add(a1);
		listaArticulos.add(a2);
		listaArticulos.add(a3);
		
		Collections.sort(listaArticulos, new SortById());
		
		listaArticulos.forEach(e -> System.out.println(e.cantidad));
	}


	
	
	
	
	public String getCodArticulo() {
		return codArticulo;
	}


	public void setCodArticulo(String codArticulo) {
		this.codArticulo = codArticulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
