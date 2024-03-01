package ejercicio1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//java.io
		File file = new File("l:/Programacion");
		
		if (!file.isDirectory()) {
			System.out.println("El directorio no existe");
		}
		for (String s: file.list()) {
			System.out.println(s);
		}
		
		
		//java.nio
		Path path = Paths.get("l:/Programacion");
		
		//for (String s:path.)
	}
}
