package tareaRepaso;

import java.util.Scanner;

public class Departamento {

	private String nombre;
	private int antiguedad;
	private Cientifico [] listaCientificos;
	private double presupuestoDepartamento;
	private Scanner sc;

	
	
	//Constructores
	Departamento(){}

	Departamento(String nombre, int antiguedad) {
	this.nombre = nombre;
	this.antiguedad = antiguedad;
	this.listaCientificos = new Cientifico [4];
	}
	
	
	//Metodo calcularPresupuestoAnual
	public double calcularPresupuestoAnual(Cientifico [] listaCientificos1){
		int antiguedadTotal = 0, empleadosTotales = 0, experienciaTotal = 0;
		int experienciaCientifico = 0;
		
		for (Cientifico c : listaCientificos1) {
			if (c!=null) {
				antiguedadTotal += c.getYearsTrabajados();
				switch(c.getExp()) {
					case ALTA -> experienciaCientifico = 50;
					case MEDIA -> experienciaCientifico = 25;
					case BAJA -> experienciaCientifico = 10;
				};
				experienciaTotal += experienciaCientifico;
				empleadosTotales++;	
			}
		}
		double presupuestoDepartamento = empleadosTotales*experienciaTotal + antiguedadTotal;
		setPresupuestoDepartamento(presupuestoDepartamento);
		System.out.println("El presupuesto del departamento es de: " + presupuestoDepartamento);
		return presupuestoDepartamento;
	}
	
	
	//Metodo altaCientifico
		public Cientifico altaCientifico(Investigacion i) {
			sc = new Scanner(System.in);
			Cientifico newCientifico = new Cientifico();
			int seleccion;
			System.out.println("Introduce los datos del científico:");
			System.out.println("Nombre:");
			newCientifico.setNombre(sc.nextLine());
			System.out.println("Apellidos:");
			newCientifico.setApellidos(sc.nextLine());
			System.out.println("Investigacion asignada al cientifico:\n" + i);
			 newCientifico.setInvestigacionAsignada(i);
			do {
				System.out.println("Experiencia [?]");
				System.out.println("[1 - Alta]");
				System.out.println("[2 - Media]");
				System.out.println("[3 - Baja]");
				seleccion = sc.nextInt();
				System.out.println("Años trabajados del cientifico:");
				newCientifico.setYearsTrabajados(sc.nextInt());
				sc.nextLine();
			} while (seleccion<0 && seleccion >4);
			
			switch(seleccion) {
				case 1 -> newCientifico.setExp(Experiencia.ALTA); 
				case 2 -> newCientifico.setExp(Experiencia.MEDIA); 
				case 3 -> newCientifico.setExp(Experiencia.BAJA); 
			};
			System.out.println(newCientifico);
			return newCientifico;
		}
			
	//Metodo asignarCientifico a lista
		public void asignarCientifico (Cientifico c) {
			sc = new Scanner(System.in);
			System.out.println("En qué posicion deseas añadir al cientifico:");
			int seleccion = sc.nextInt();
				this.listaCientificos[seleccion] = c;
			}		
			
			
	//Metodo eliminar Cientifico //eliminar investigacion
		public void eliminarCientifico(Cientifico [] listaCientificos) {
			System.out.println("Introduce el nombre del cientifico a eliminar: ");
			String cientificoToDelete = sc.nextLine();
			int posicionCientifico = 0;
			for (Cientifico c : listaCientificos) {
				if (c.getNombre().equals(cientificoToDelete)){
					listaCientificos [posicionCientifico] = null;
					
					c.setNombre("");
					c.setApellidos("");
					c.setExp(null);
					c.setYearsTrabajados(0);
					c.setInvestigacionAsignada(null);
					
					System.out.println(c);
				}
				posicionCientifico++;
			}
			System.out.println("Cientifico eliminado correctamente");
		}
	
	
    //toString
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", antiguedad=" + antiguedad + ", cientifico=" + listaCientificos + "]";
	}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public double getPresupuestoDepartamento() {
		return presupuestoDepartamento;
	}
	public void setPresupuestoDepartamento(double presupuestoDepartamento) {
		this.presupuestoDepartamento = presupuestoDepartamento;
	}
	public Cientifico[] getListaCientificos() {
		return listaCientificos;
	}
	public void setListaCientificos(Cientifico[] listaCientificos) {
		this.listaCientificos = listaCientificos;
	}
}

