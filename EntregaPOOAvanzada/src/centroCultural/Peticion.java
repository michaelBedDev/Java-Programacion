package centroCultural;

public class Peticion {

	private MaterialAGuardar[] listaPeticiones = new MaterialAGuardar [6];

	private String fechaIniPrestamo;
	private String fechaFinalPrestamo;

//Constructor
	public Peticion() {
		super();
	}

	public Peticion(MaterialAGuardar [] material, String fechaIniPrestamo) {
		super();

		this.fechaIniPrestamo = fechaIniPrestamo;
	}

//Getters & Setters
	public MaterialAGuardar[] getPeticionLibro() {
		return listaPeticiones;
	}

	public void setPeticionLibro(Libro[] peticionLibro) {
		this.listaPeticiones = peticionLibro;
	}

	public Disco[] getPeticionDisco() {
		return peticionDisco;
	}

	public void setPeticionDisco(Disco[] peticionDisco) {
		this.peticionDisco = peticionDisco;
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
