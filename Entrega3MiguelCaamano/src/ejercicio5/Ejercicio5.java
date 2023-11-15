package ejercicio5;

import java.util.concurrent.TimeUnit;

public class Ejercicio5 {

	public static void main(String[] args) throws InterruptedException {
		
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		for(;;segundos++) {
			TimeUnit.SECONDS.sleep(1);
			System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
			
			if (segundos==60) {
				segundos=0;
				minutos++;
			}
			if (minutos==60) {
				minutos=0;
				horas++;
			}
			
			
			
			
		}

	}

}
