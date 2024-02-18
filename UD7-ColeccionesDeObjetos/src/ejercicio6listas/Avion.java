package ejercicio6listas;

import java.util.LinkedList;
import java.util.ListIterator;

public class Avion implements Ejercicio6<Pasajero> {
	private String origen;
	private String destino;
	private int plaza;
	private boolean business;
	public LinkedList<Pasajero> listaPasajeros = new LinkedList<Pasajero>();
	private ListIterator<Pasajero> it = listaPasajeros.listIterator();

	@Override
	public void insert(Pasajero x) {
		listaPasajeros.add(x);
	}

	@Override
	public void remove(Pasajero x) {

		// recorrer lista desde inicio
		goFirst();

		boolean flagEliminado = false;
		while (it.hasNext()) {
			Pasajero p = (Pasajero) it.next();

			if (p.equals(x)) {
				it.remove();
				flagEliminado = true;
			}
		}
		if (!flagEliminado) {
			System.out.println("No se ha encontrado al pasajero para eliminarlo");
		}
	}

	@Override
	public void removeCurrent() {
		// probar si lo elimina de la lista
			advance(); //?
		it.remove();
	}

	@Override
	public boolean find(Pasajero x) {

		goFirst();

		while (it.hasNext()) {
			Pasajero p = (Pasajero) it.next();

			if (p.equals(x)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void goFirst() {
		it = listaPasajeros.listIterator(0);
	}

	@Override
	public void advance() {
		if (it.hasNext()) {
			it.next();
		}
	}

	@Override
	public boolean isOnList() {
		
		goFirst();
		return it.hasNext();
		
//		if (it.hasNext()) {
//			return true;
//		}
//		
//		while (it.hasNext()) {
//			Pasajero p = (Pasajero) it.next();
//			if (p == null) {
//				return true;
//			}
//		}
//		return false;
	}

	@Override
	public Object getCurrent() {
		return it.next();
	}

	@Override
	public Object getPrevious() {
		return it.previous();
	}

	protected Avion() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Avion(String origen, String destino, int plaza, boolean business) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.plaza = plaza;
		this.business = business;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getPlaza() {
		return plaza;
	}

	public void setPlaza(int plaza) {
		this.plaza = plaza;
	}

	public boolean isBusiness() {
		return business;
	}

	public void setBusiness(boolean business) {
		this.business = business;
	}
}
