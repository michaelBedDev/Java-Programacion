package sobrecargaSobreescritura;

public class App {
	
		public static void main(String[] args) {
			Hijo.sobreEscritura("Se bienvenido ", "Pablo");
			Hijo.sobreCarga(3);
		}
	

	class Papa {
		public static void sobreEscritura(String txtBienvenida, String nombre) {
			System.out.println(txtBienvenida + nombre);
		}

		public static void sobreCarga(String txtDespedida, String nombre) {
			System.out.println(txtDespedida + nombre);
		}
	}

	class Hijo extends Papa {
		// El tipo devuelto no debe cambiar.
		// los parámetros de entrada no deben cambiar
		// La accesibilidad no será más restrictiva que la del método original.
		// Si el método original es static, el método que hace el override, tambień debe
		// serlo.
		public static void sobreEscritura(String txtBienvenida, String nombre) {
			System.out.println(txtBienvenida + "......" + nombre);
		}

		// El tipo de dato devuelto puede cambiar.
		// Los parámetros de entrada deben cambiar.
		// La accesibilidad puede ser más restrictiva que la del método original.
		protected static int sobreCarga(int codigoDespedida) {
			System.out.println(codigoDespedida);
			return 4;
		}

	}
}
