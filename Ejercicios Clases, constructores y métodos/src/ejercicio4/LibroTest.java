package ejercicio4;

import java.util.Scanner;

public class LibroTest {

	public static void main(String[] args) {

		Libro libro1 = new Libro();
		Libro libro2 = new Libro("56451","Libro sin título", "Anónimo",37);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe los datos de ISBN, título, autor y número de páginas del libro.");
		System.out.println("Uno en cada línea: ");
		libro1.setISBN(sc.nextLine());
		libro1.setTítulo(sc.nextLine());
		libro1.setAutor(sc.nextLine());
		libro1.setNumPaginas(sc.nextInt());
		
		System.out.println(libro1.toString());
		
		System.out.println("Tiene el libro 1 más páginas que el libro 2?\n" + libro1.comparePaginas(libro2));
	}

}
