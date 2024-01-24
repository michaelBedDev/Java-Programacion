package centroCultural;

public class Disco extends MaterialAGuardar{


	private String nombreDiscografica;
	
	
//Constructor
	public Disco() {
		super();
	}
	
	
	public Disco(String infoGeneral, int numId, String titulo, String localizacion, String autor, String nombreDiscografica) {
		super(infoGeneral, numId, titulo, localizacion, autor);
		this.nombreDiscografica = nombreDiscografica;
	}


	



	//	Getters & Setters
	public String getNombreDiscografica() {
		return nombreDiscografica;
	}


	public void setNombreDiscografica(String nombreDiscografica) {
		this.nombreDiscografica = nombreDiscografica;
	}

	
	
}
