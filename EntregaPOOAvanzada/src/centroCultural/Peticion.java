package centroCultural;

public class Peticion {

	private Libro[] peticionLibro = new Libro[3];
	private Disco[] peticionDisco = new Disco[3];

	private String fechaIniPrestamo;
	private String fechaFinalPrestamo;

//Constructor
	public Peticion(Libro[] peticionLibro, Disco[] peticionDisco, String fechaIniPrestamo, String fechaFinalPrestamo) {
		super();
		this.peticionLibro = peticionLibro;
		this.peticionDisco = peticionDisco;
		this.fechaIniPrestamo = fechaIniPrestamo;
		this.fechaFinalPrestamo = fechaFinalPrestamo;
	}

//Getters & Setters
	public Libro[] getPeticionLibro() {
		return peticionLibro;
	}

	public void setPeticionLibro(Libro[] peticionLibro) {
		this.peticionLibro = peticionLibro;
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
