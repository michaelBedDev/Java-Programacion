package pruebas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {

		File prueba = new File("/src/prueba.txt");

		// CREAR UN ARCHIVO
		/*
		 * try { prueba.createNewFile(); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } try (BufferedWriter
		 * escribir = new BufferedWriter(new FileWriter(prueba))) {
		 * escribir.write("Esto es una prueba"); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		// AÑADIR TEXTO A UN ARCHIVO
		/*
		 * try(PrintWriter pw = new PrintWriter(new FileWriter(prueba.getAbsoluteFile(),
		 * true))){
		 * 
		 * pw.println("Successfully wrote to the file."); } catch (IOException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */

		/*
		 * try(BufferedWriter pw = new BufferedWriter(new
		 * FileWriter(prueba.getAbsoluteFile(), true))){ pw.newLine();
		 * pw.write("Successfully wrote to the file."); } catch (IOException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 */

		// JAVANIO

		Path carpetaNio = Paths.get("./src/carpetaNio");
		Path archivoNio = Paths.get(carpetaNio.toAbsolutePath() + "/archivoNio.txt");

		try {
			Files.deleteIfExists(archivoNio);
			Files.deleteIfExists(carpetaNio);

			Files.createDirectory(carpetaNio);
			Files.createFile(archivoNio);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * Copiar, mover Files.copy(orixe, destino,
		 * StandardCopyOption.REPLACE_EXISTING); Files.move(source, target,
		 * StandardCopyOption.REPLACE_EXISTING);
		 */

		// Mostrar el contenido de un directorio
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(carpetaNio)) {
			for (Path file : stream) {
				System.out.println(file.getFileName());
			}
		} catch (IOException | DirectoryIteratorException x) {
			// IOException nunca será lazanda pola iteracion neste exemplo
			// so pode ser lanzado por newDirectoryStream.
			System.err.println(x);
		}

		// Escribir un archivo

		List<String> listatexto = Arrays.asList("archivonio1", "archivonio2");
		try {
			Files.write(archivoNio, listatexto);
			
			
			//Append????????????????????????????????????
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNio.toFile(), true));
			bw.newLine();
			bw.write("esto es un append");
			

			//PrintWriter.append
			
			
			//byte[] bytes = Files.readAllBytes(Paths.get("prueba_escribir.txt"));
			//System.out.println(new String(bytes));
		} catch (IOException e) {
			System.out.println(e);
		}

		
		// Leer un archivo
		try {
			List<String> lines = Files.readAllLines(archivoNio);
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}