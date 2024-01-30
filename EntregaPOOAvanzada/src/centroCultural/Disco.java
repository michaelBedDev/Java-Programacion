package centroCultural;

public class Disco extends MaterialAGuardar {

	private String nombreDiscografica;

//Constructor
	public Disco() {
		super();
	}

	public Disco(String infoGeneral, String titulo, String autor, String nombreDiscografica) {
		super(infoGeneral, titulo, autor);
		this.nombreDiscografica = nombreDiscografica;
	}

	@Override
	public String toString() {
		String info = "El disco: " + titulo + " con autor: " + autor + " y discográfica: " + nombreDiscografica
				+ " se le ha asignado el código " + numId + " y deberá colocarse en la estantería "
				+ localizacionEstanteria + " y en la altura " + localizacionAltura;

		return info;
	}

	// Getters & Setters
	public String getNombreDiscografica() {
		return nombreDiscografica;
	}

	public void setNombreDiscografica(String nombreDiscografica) {
		this.nombreDiscografica = nombreDiscografica;
	}

}
