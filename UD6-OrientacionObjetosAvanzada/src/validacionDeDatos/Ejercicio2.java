package validacionDeDatos;

public class Ejercicio2 {

	
	public static void main(String[] args) {
		String ipAddress = "192.168.0.1";
		System.out.println(ipAddress.matches("\\b(1?(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.){3}(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b"));
	}
}
