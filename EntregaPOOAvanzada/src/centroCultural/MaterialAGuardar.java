package centroCultural;

public class MaterialAGuardar {

	protected String infoGeneral;
	protected String titulo;
	protected String autor;
	protected int numId;
	protected int localizacionEstanteria;
	protected int localizacionAltura;
	
	
//Constructor
	public MaterialAGuardar() {
		//TODO Auto-generated constructor stub
	}
	
	 public MaterialAGuardar(String infoGeneral, String titulo, String autor) {
		super();
		this.infoGeneral = infoGeneral;
		this.titulo = titulo;
		this.autor = autor;
		
	}





	
	
	
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
