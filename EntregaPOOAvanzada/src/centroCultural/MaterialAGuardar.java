package centroCultural;

public class MaterialAGuardar {

	protected String infoGeneral;
	protected int numId;
	protected String titulo;
	protected String autor;
	
	
//Constructor
	public MaterialAGuardar() {
		//TODO Auto-generated constructor stub
	}
	
	 public MaterialAGuardar(String infoGeneral, int numId, String titulo, String autor) {
		super();
		this.infoGeneral = infoGeneral;
		this.numId = numId;
		this.titulo = titulo;
		this.autor = autor;
	}


	//Metodos
	public final void colocarMaterial(){
		 
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
	
}