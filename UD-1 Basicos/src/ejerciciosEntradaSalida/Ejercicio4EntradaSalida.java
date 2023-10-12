package ejerciciosEntradaSalida;

public class Ejercicio4EntradaSalida {

	public static void main(String[] args) {
		
		String descripción = "Descripción";
		String precio = "Precio";
		String cantidad = "Cantidad";
		String subtotal = "Subtotal";
		String agradecimiento = "**Gracias por su compra**";
		
		System.out.println("-".repeat(58));
		System.out.printf("|%-14s |%-10s |%-12s |%-13s |%n", descripción, precio, cantidad, subtotal);
		System.out.println("-".repeat(58));
		System.out.printf("%41s", agradecimiento);
	}

}
