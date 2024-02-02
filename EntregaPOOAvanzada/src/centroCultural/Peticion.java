package centroCultural;

public class Peticion {

	private MaterialAGuardar[] listaPeticiones = new MaterialAGuardar [6];

	private String fechaIniPrestamo;
	private String fechaFinalPrestamo;

//Constructor
	public Peticion() {
		super();
	}

	
	//Getters & Setters
	public Peticion(MaterialAGuardar [] material, String fechaIniPrestamo) {
		super();

		this.fechaIniPrestamo = fechaIniPrestamo;
	}

	public MaterialAGuardar[] getListaPeticiones() {
		return listaPeticiones;
	}

	public void setListaPeticiones(MaterialAGuardar[] listaPeticiones) {
		this.listaPeticiones = listaPeticiones;
	}

	public String getFechaIniPrestamo() {
		return fechaIniPrestamo;
	}

	public void setFechaIniPrestamo(String fechaIniPrestamo) {
		this.fechaIniPrestamo = fechaIniPrestamo;
	}

	public String getFechaFinalPrestamo() {
		return fechaFinalPrestamo;
	}

	public void setFechaFinalPrestamo(String fechaFinalPrestamo) {
		this.fechaFinalPrestamo = fechaFinalPrestamo;
	}

}
