package ejercicio4;

public class Libro {

	private String ISBN;
	private String título;
	private String autor;
	private int numPaginas;
	
	
	//CONSTRUCTORES
	Libro() {}
	Libro(String ISBN, String título, String autor, int numPaginas) {
		this.ISBN = ISBN;
		this.título = título;
		this.autor = autor;
		boolean numPagina;
		numPagina = (numPaginas > 0) ? setNumPaginas(numPaginas) : setNumPaginas(0);
	}
	
	public boolean comparePaginas(Libro c) {
		return this.numPaginas > c.numPaginas;
	}
	
	
	//GETTERS & SETTERS
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTítulo() {
		return título;
	}
	public void setTítulo(String título) {
		this.título = título;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
}
