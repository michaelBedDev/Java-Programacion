package apuntes;

import java.time.ZonedDateTime;
import java.util.Locale;

public class PrintF {

	public static void main(String[] args) {
		
		System.out.printf(Locale.US,"US: %,f %n", 12234.6755596);
		
		ZonedDateTime date = ZonedDateTime.now();
		
		System.out.printf("Hoy es %1$tA, %1$td de %1$tB de %1$tY %n", date);
		System.out.printf("Son las %1$tH:%1$tM:%1$tS [%1$tp] %1$tz %n", date);
		System.out.printf("En la zona horaria %s [%tz] %n", date.getZone(), date);

		System.out.printf("'%1$10s'  '%1$-10S'%n", "hola");
	}

}
