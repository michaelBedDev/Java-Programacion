package ejercicio4;

import java.util.Scanner;

public class LibroTest {

	public static void main(String[] args) {

		Libro libro1 = new Libro(); /*Libro vacío*/
		Libro libro2 = new Libro("56451","Libro sin título", "Anónimo",37); /*Libro por parámetros*/
		
		/*Pedimos por teclado los atributos de libro1*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe los datos de ISBN, título, autor y número de páginas del libro.");
		System.out.println("Uno en cada línea: ");
		libro1.setISBN(sc.nextLine());
		libro1.setTítulo(sc.nextLine());
		libro1.setAutor(sc.nextLine());
		libro1.setNumPaginas(sc.nextInt());
		sc.nextLine();
		
		/*toString*/
		System.out.println(libro1.toString());
		
		/*Comparamos páginas*/
		System.out.println("Tiene el libro 1 más páginas que el libro 2?\n" + libro1.comparePaginas(libro2));
		
		/*Pedimos por teclado los datos del nuevo libro y los guardamos como String*/
		System.out.println("\nIntroduce los datos de un nuevo libro en el siguiente formato:");
		System.out.println("0-7645-2641-3:Perez Reverte:Alatriste:20");
		String datosLibro = sc.nextLine();
		sc.close();
		
		/*Creamos el nuevo libro con el constructor del String*/
		Libro libro3 = new Libro(datosLibro);
		System.out.println(libro3.toString());
	}

}
