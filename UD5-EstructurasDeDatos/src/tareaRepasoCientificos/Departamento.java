package tareaRepasoCientificos;

import java.util.Scanner;
import java.util.Arrays;

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
	
	Departamento(String nombre, int antiguedad, Cientifico c) {
	this.nombre = nombre;
	this.antiguedad = antiguedad;
	this.listaCientificos = new Cientifico [4];
	this.listaCientificos[0] = c;
	}
	
	
		//Metodo altaCientifico
		public void altaCientifico() {
			sc = new Scanner(System.in);
			Cientifico newCientifico = new Cientifico();
			int seleccion;
			System.out.println("Introduce los datos del científico:");
			System.out.println("Nombre:");
			newCientifico.setNombre(sc.nextLine());
			System.out.println("Apellidos:");
			newCientifico.setApellidos(sc.nextLine());
			
			do {
				System.out.println("Experiencia del cientifico[?]");
				System.out.println("[1 - Alta]");
				System.out.println("[2 - Media]");
				System.out.println("[3 - Baja]");
				seleccion = sc.nextInt();
			} while (seleccion<0 || seleccion >4);
			
			switch(seleccion) {
				case 1 -> newCientifico.setExp(Experiencia.ALTA); 
				case 2 -> newCientifico.setExp(Experiencia.MEDIA); 
				case 3 -> newCientifico.setExp(Experiencia.BAJA); 
			};
			
			System.out.println("Años trabajados del cientifico:");
			newCientifico.setYearsTrabajados(sc.nextInt());
			sc.nextLine();
			
			//Alta y Asignar investigacion
			newCientifico.setInvestigacionAsignada(this.altaInvestigacion());
			
			this.asignarCientifico(newCientifico);
			
			System.out.println(newCientifico);
		}
				
		
		//Metodo eliminar Cientifico //eliminar investigacion
		public void eliminarCientifico(Cientifico [] listaCientificos) throws InterruptedException {
			System.out.println("Introduce el nombre del cientifico a eliminar: ");
			sc = new Scanner(System.in);
			String cientificoToDelete = sc.nextLine();
			int posicionCientifico = 0;
			for (Cientifico c : listaCientificos) {
				if (c!=null) {
					if (c.getNombre().equals(cientificoToDelete)){
						listaCientificos [posicionCientifico] = null;
						
						c.setNombre("");
						c.setApellidos("");
						c.setExp(null);
						c.setYearsTrabajados(0);
						c.setInvestigacionAsignada(null);
						
						Menu.barraCargando();
						System.out.println("Cientifico eliminado correctamente");
					}
					posicionCientifico++;
				}
			}
		}
	
		
		//Metodo calcularPresupuestoAnual
		public void calcularPresupuestoAnual(Cientifico [] listaCientificos1){
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
		}
		
		
		
		//Buscar Cientifico y mostrarlo por pantalla por nombre
		public void buscarCientifico(Cientifico [] listaCientificos) {
			System.out.println("Introduce el nombre del cientifico a buscar: ");
			sc = new Scanner(System.in);
			String cientificoToSearch = sc.nextLine();

			for (Cientifico c : listaCientificos) {
				if (c!=null) {
					if (c.getNombre().equals(cientificoToSearch)){
						System.out.println(c);
					}
				}
			}
		}
		
		
		

		
		
		//Alta Investigación y asignarla a los cientificos seleccionados
		public void asignarInvestigacionToCientifico() {}
		
		
		//Metodo altaInvestigacion
		private Investigacion altaInvestigacion() {
			sc = new Scanner(System.in);
			Investigacion newInvestigacion = new Investigacion();

			System.out.println("Introduce los datos de la investigación:");
			System.out.println("Nombre:");
			newInvestigacion.setNombre(sc.nextLine());
			System.out.println("Identificador: (número)");
			newInvestigacion.setIdentificador(Integer.parseInt(sc.nextLine()));

			return newInvestigacion;
		}
		
		//Cadena alfanumérica
		//Tabla Cientificos con antiguedad y nombre de su investigación
		
		
		
		
		
		
		
		//PRIVATE METHODS
		
		//Metodo asignar Cientifico a listaCientificos
		private void asignarCientifico (Cientifico c) {
			sc = new Scanner(System.in);
			int seleccion;
			do {
				System.out.println("En qué posicion deseas añadir al cientifico: (entre 0 y 3)");
				seleccion = sc.nextInt();
			} while (seleccion >3 || seleccion <0);		
			
			this.listaCientificos[seleccion] = c;
		}		
			
		//Metodo asignar Cientifico a investigacion
		private void asignarCientificoInvestigacion() {
			System.out.println("Introduce el nombre del cientifico a asignar a la investigación: ");
			String cientificoToAsign = sc.nextLine();
			int posicionCientifico = 0;
			for (Cientifico c : listaCientificos) {
				if (c!=null) {
					if (c.getNombre().equals(cientificoToAsign)){
						//????????????????????
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
    //toString
	@Override
	public String toString() {
		return "Departamento \nNombre: " + nombre + "\nAntiguedad: " + antiguedad +"\n"+ Arrays.toString(listaCientificos) + "\n";
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

