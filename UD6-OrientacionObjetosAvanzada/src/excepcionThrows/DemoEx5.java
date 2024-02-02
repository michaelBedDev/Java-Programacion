package excepcionThrows;

public class DemoEx5 {

	public static int dameNum() throws NumberFormatException {

		java.util.Scanner cin = new java.util.Scanner(System.in);
		return Integer.parseInt(cin.nextLine().trim());
	}

	public static void main(String[] args) {
		System.out.println("Dame un número: ");
		try {
			System.out.println(dameNum());
		} catch (Exception e) {
			System.out.println("Excepción recibida --> " + e);
		}

	}
}
