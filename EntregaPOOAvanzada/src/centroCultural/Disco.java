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

	
	//disco toString
	
	public void mostrarDatos() {
		String info = "El disco: " + titulo + " con autor: " + autor + " y discográfica: " + nombreDiscografica
				+ " se le ha asignado el código " + numId + " y deberá colocarse en la estantería "
				+ localizacionEstanteria + " y en la altura " + localizacionAltura;
	System.out.println(info);
	}
	
	//metodo polimorfico
	@Override
	protected void pedirMaterialEspecifico() {
		String nombreDiscografica = "Introduce la discográfica";
		this.setNombreDiscografica(UsuarioCentroCultural.getInstance().pedirString(nombreDiscografica)); //STRING
		return;
	}
	

	// Getters & Setters
	public String getNombreDiscografica() {
		return nombreDiscografica;
	}

	public void setNombreDiscografica(String nombreDiscografica) {
		this.nombreDiscografica = nombreDiscografica;
	}


}
