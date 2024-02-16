package ejercicio6listas;

import java.util.Iterator;
import java.util.LinkedList;

public class Avion implements Ejercicio6<Pasajero> {
	private String origen;
	private String destino;
	private int plaza;
	private boolean business;
	private LinkedList<Pasajero> listaPasajeros;
	private Iterator<Pasajero> it = listaPasajeros.iterator();

	@Override
	public void insert(Pasajero x) {
		listaPasajeros.add(x);
	}

	@Override
	public void remove(Pasajero x) {

		boolean flagEliminado = false;
		while (it.hasNext()) {
			Pasajero p = (Pasajero) it.next();

			if (p.equals(x)) {
				it.remove();
				flagEliminado = true;
			}
		}

		// hacelo con try catch
		if (!flagEliminado) {
			System.out.println("No se ha encontrado al pasajero para eliminarlo");
		}
	}

	@Override
	public void removeCurrent() {
		it.remove();
	}

	@Override
	public boolean find(Pasajero x) {
		while (it.hasNext()) {
			Pasajero p = (Pasajero) it.next();

			if (it.equals(p)) {
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
		it.next();
	}

	@Override
	public boolean isOnList() { //no entiendo muy bien lo del metodo
		while (it.hasNext()) {
			Pasajero p = (Pasajero) it.next();
			if (p == null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Object getCurrent() {
		Object o = it.next();
		return o;
	}

	@Override
	public Object getPrevious() {
		// return objeto al que apunta el iterator -1
		return null;
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
