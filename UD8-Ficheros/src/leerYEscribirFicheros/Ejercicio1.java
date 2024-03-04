package leerYEscribirFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\a23MiguelCM\\Desktop\\prueba.txt");
		File test = File.createTempFile("temp", "txt");
		try (BufferedReader buff = new BufferedReader(new FileReader(file))){
			
		
			
		
			String linea = buff.readLine();
			
			
			while (linea!= null) {
				String lineaNoBlanks = linea.replace(" ", "");
				char charACambiar = lineaNoBlanks.charAt(0);
				try (BufferedWriter writt = new BufferedWriter(new FileWriter(test))) {
					String lineaToWrite = charACambiar + linea.substring(1);

					writt.write(lineaToWrite);
					writt.newLine();
				}
				linea = buff.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		Files.copy(test.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING); //funciona mal
	}
}
