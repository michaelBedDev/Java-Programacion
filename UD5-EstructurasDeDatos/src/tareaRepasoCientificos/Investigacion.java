package tareaRepaso;

import java.math.BigDecimal;
import java.lang.Math;

public class Investigacion {

	private int identificador;
	private String nombre;
	private BigDecimal numCalculosInvestigacion;
	private double constPI = Math.PI;
	
	
	//Constructores
	Investigacion(){}
	
	Investigacion(int id, String nombre){
		this.identificador = id;
		this.nombre = nombre;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "\n\t\tInvestigacion \n\t\tIdentificador: " + identificador + " \n\t\tNombre: " + nombre + " \n\t\tNumCalculosInvestigacion: "
				+ numCalculosInvestigacion +"\n";
	}
	
	//Getters & Setters
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getNumCalculosInvestigacion() {
		return numCalculosInvestigacion;
	}
	public void setNumCalculosInvestigacion(BigDecimal numCalculosInvestigacion) {
		this.numCalculosInvestigacion = numCalculosInvestigacion;
	}
}
