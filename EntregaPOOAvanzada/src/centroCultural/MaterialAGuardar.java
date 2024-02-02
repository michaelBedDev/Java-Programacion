package centroCultural;

import java.util.Scanner;

public abstract class MaterialAGuardar {

	protected String infoGeneral;
	protected String titulo;
	protected String autor;
	protected int numId;
	protected int localizacionEstanteria;
	protected int localizacionAltura;

//Constructor
	public MaterialAGuardar() {
		// TODO Auto-generated constructor stub
	}

	public MaterialAGuardar(String infoGeneral, String titulo, String autor) {
		super();
		this.infoGeneral = infoGeneral;
		this.titulo = titulo;
		this.autor = autor;

	}
	
	public void inputAltaMaterial() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la información general");
		this.setInfoGeneral(sc.nextLine());
		System.out.println("Introduce el título");
		this.setTitulo(sc.nextLine());
		System.out.println("Introduce el autor");
		this.setAutor(sc.nextLine());
	
		pedirMaterialEspecifico();
	}

	public void asignarCodigoMaterial() {
		int codigo;
		do {
			java.util.Random rand = new java.util.Random();
			codigo = rand.nextInt(999) / (this.getLocalizacionEstanteria() + 1)
					- (this.getLocalizacionAltura() + 1);
		} while (codigo <= 0);
		
		this.setNumId(codigo);
	}
	
	
	
	protected abstract void pedirMaterialEspecifico();
	
	protected abstract void mostrarDatos();

	
//Getters & Setters
	public String getInfoGeneral() {
		return infoGeneral;
	}

	public void setInfoGeneral(String infoGeneral) {
		this.infoGeneral = infoGeneral;
	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getLocalizacionEstanteria() {
		return localizacionEstanteria;
	}

	public void setLocalizacionEstanteria(int localizacionEstanteria) {
		this.localizacionEstanteria = localizacionEstanteria;
	}

	public int getLocalizacionAltura() {
		return localizacionAltura;
	}

	public void setLocalizacionAltura(int localizacionAltura) {
		this.localizacionAltura = localizacionAltura;
	}

}
