package ejercicio1;

import java.io.File;

public class Ejercicio3 {

	public static void main(String[] args) {
		File file = new File("ruta");
		
		for(String s: file.list()) {
			imprimirRecursivo(new File(file.getAbsolutePath()+"/"+s));
		}
	}
	
	public static void imprimirRecursivo(File ruta) {
		System.out.println(ruta.getAbsolutePath());
		if (ruta.isDirectory()) {
			for(String s: ruta.list()) {
				imprimirRecursivo(new File(ruta.getAbsolutePath()+"/"+s));
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
