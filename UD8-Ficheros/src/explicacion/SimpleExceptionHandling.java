package explicacion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SimpleExceptionHandling {
	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("L:\\Varios\\aa.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Aconteceu a excepción  :: " + e.getMessage());
			System.out.println("Necesitamos pechar FileStream!");
		} finally {
			System.out.println("Afortunadamente pecharase neste bloque");
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException e) {
			}
		}
		
		Scanner scanner = null;
		try {
		    scanner = new Scanner(new File("test.txt"));
		    while (scanner.hasNext()) {
		        System.out.println(scanner.nextLine());
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} finally {
		    if (scanner != null) {
		        scanner.close();
		    }
		}
		
		
		//try with resources
		try (Scanner scannerB = new Scanner(new File("test.txt"))) {

		    while (scannerB.hasNext()) {
		        System.out.println(scannerB.nextLine());
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		}
	}
}
