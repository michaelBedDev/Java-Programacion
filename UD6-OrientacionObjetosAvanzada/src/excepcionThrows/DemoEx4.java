package excepcionThrows;

public class DemoEx4 {
	public static int dameNum() {
		java.util.Scanner cin = new java.util.Scanner(System.in);
		int num;
		try {
			num = Integer.parseInt(cin.nextLine().trim());
		} catch (NumberFormatException e) {
			System.out.println("Entrada no válida. Relanzando excepción...");
			throw e;
		}
		return num;
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
