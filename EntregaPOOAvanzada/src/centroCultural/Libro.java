package centroCultural;

public class Libro extends MaterialAGuardar {

	private int numPaginas;

//	Constructor
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libro(String infoGeneral, int numId, String titulo, int[][] localizacion, String autor, int numPaginas) {
		super(infoGeneral, numId, titulo, autor);
		this.numPaginas = numPaginas;
	}

// Getters & Setters
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

}
