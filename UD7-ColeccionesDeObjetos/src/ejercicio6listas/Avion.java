package ejercicio6listas;

import java.util.LinkedList;

public class Avion implements Ejercicio6<Pasajero>{
	private String origen;
	private String destino;
	private int plaza;
	private boolean business;
	private LinkedList<Pasajero> listaPasajeros;
	//iterator
	
	
	
	
	@Override
	public void insert(Pasajero x) {
		listaPasajeros.add(x);
		
	}
	@Override
	public void remove(Pasajero x) {
		listaPasajeros.remove(0);
	}
	@Override
	public void removeCurrent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean find(Pasajero x) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void goFirst() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void advance() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isOnList() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object getCurrent() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object getPrevious() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	protected Avion() {
		super();
		//TODO Auto-generated constructor stub
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
