package explicacion;

import java.time.LocalDateTime;
import java.util.Random;

public class Supplier {

	public static void main(String[] args) {
		
		Supplier<Integer> randomNumbersSupp=() -> new Random().nextInt(10);
		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		LocalDateTime time = s.get();
		System.out.println(time);
	}
}
