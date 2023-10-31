package ejercicio4;

import java.util.Scanner;

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
		this.numPaginas = numPaginas > 0 ? numPaginas : 0;
		
	}
	Libro(String DatosLibro) {
		Scanner sc = new Scanner(DatosLibro);
		sc.useDelimiter(":");
		this.ISBN = sc.next();
		this.autor = sc.next();
		this.título = sc.next();
		this.numPaginas = sc.nextInt();
		sc.close();
	}
	
	//Comparar paginas
	public boolean comparePaginas(Libro c) {
		return this.numPaginas > c.numPaginas;
	}
	
	//toString
	public String toString() {
		return "Título del libro: " + this.título
				+ "\nISBN del líbro: " + this.ISBN
				+ "\nAutor del libro: " + this.autor
				+ "\nNúmero de páginas: " + this.numPaginas;
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
