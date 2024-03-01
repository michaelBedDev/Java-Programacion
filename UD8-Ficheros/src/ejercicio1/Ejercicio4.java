package ejercicio1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio4 {

	public static void main(String[] args) {
		Path path = Paths.get("l:/programacion");
		path.getParent();
		path.getNameCount();
		path.getFileName();
	}
}
