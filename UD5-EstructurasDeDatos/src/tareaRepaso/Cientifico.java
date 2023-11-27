package tareaRepaso;

import java.util.Scanner;

public class Cientifico {

	private String nombre;
	private String apellidos;
	private Experiencia exp;
	private int yearsTrabajados = 0;
	private Investigacion investigacionAsignada;
	private Scanner sc;
	
	


	//Constructores
	Cientifico(){}
	
	Cientifico (String nombre, String apellidos, Experiencia exp, Investigacion investigacionAsignada ) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.investigacionAsignada = investigacionAsignada;
	}
	

	//Metodo altaCientifico
		public Cientifico altaCientifico() {
			sc = new Scanner(System.in);
			Cientifico newCientifico = new Cientifico();
			int seleccion;
			System.out.println("Introduce los datos del científico:");
			System.out.println("Nombre:");
			newCientifico.setNombre(sc.nextLine());
			System.out.println("Apellidos:");
			newCientifico.setApellidos(sc.nextLine());
			System.out.println("Investigacion Asignada: ");
			//Asignar Investigacion a cientifico
			// newCientifico.setInvestigacionAsignada(sc.nextLine());
			do {
				System.out.println("Experiencia [?]");
				System.out.println("[1 - Alta]");
				System.out.println("[2 - Media]");
				System.out.println("[3 - Baja]");
				seleccion = sc.nextInt();
				sc.nextLine();
			} while (seleccion<0 && seleccion >4);
			
			switch(seleccion) {
				case 1 -> this.setExp(Experiencia.ALTA); 
				case 2 -> this.setExp(Experiencia.MEDIA); 
				case 3 -> this.setExp(Experiencia.BAJA); 
			};
			return newCientifico;
		}
	
		
		//Metodo eliminar Cientifico //eliminar investigacion
		public void eliminarCientifico(Cientifico [] listaCientificos) {
			System.out.println("Introduce el nombre del cientifico a eliminar: ");
			String cientificoToDelete = sc.nextLine();
			
			for (Cientifico c : listaCientificos) {
				if (c.nombre.equals(cientificoToDelete)){
					//borrar
				}
			}
		}

	//toString
	@Override
		public String toString() {
			return "Cientifico [nombre=" + nombre + ", apellidos=" + apellidos + ", yearsTrabajados=" + yearsTrabajados
					+ ", investigacionAsignada=" + investigacionAsignada + "]";
		}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getYearsTrabajados() {
		return yearsTrabajados;
	}
	public void setYearsTrabajados(int yearsTrabajados) {
		this.yearsTrabajados = yearsTrabajados;
	}
	public Investigacion getInvestigacionAsignada() {
		return investigacionAsignada;
	}
	public void setInvestigacionAsignada(Investigacion investigacionAsignada) {
		this.investigacionAsignada = investigacionAsignada;
	}
	public Experiencia getExp() {
		return exp;
	}
	public void setExp(Experiencia exp) {
		this.exp = exp;
	}
	//Arreglar 
	public int getCuantaExperiencia() {
	
		return this.exp;
	}
}


