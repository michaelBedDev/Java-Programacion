package centroCultural;

public class Disco extends MaterialAGuardar{

	private String nombreDiscografica;
	
	
//Constructor
	public Disco() {
		super();
	}
	
	
	public Disco(String infoGeneral, int numId, String titulo, int[][] localizacion, String autor, String nombreDiscografica) {
		super(infoGeneral, numId, titulo, autor);
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
