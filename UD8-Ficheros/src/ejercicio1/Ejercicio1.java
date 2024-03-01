package ejercicio1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		
		//java.io
		File directorio = new File("l:/Programacion");
		System.out.println(directorio.isFile());
		System.out.println(directorio.canWrite());
		
		//java.nio
		Path path = Paths.get("l:/Programacion");
		System.out.println(Files.isRegularFile(path));
		System.out.println(Files.isWritable(path));
	}
}
