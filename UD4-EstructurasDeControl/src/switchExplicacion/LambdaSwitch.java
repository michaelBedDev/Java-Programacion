package switchExplicacion;

public class LambdaSwitch {

	public enum day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	public static void main(String[] args) {
		day dia = day.FRIDAY;
		int numLetters = switch (dia) {
			 case MONDAY, FRIDAY, SUNDAY -> 6;
			 case TUESDAY -> 7;
			 case THURSDAY, SATURDAY -> 8;
			 case WEDNESDAY -> 9;
			 default -> 0;
			};
		System.out.println(numLetters);
	}

}
