package ejercicio2;

public class PruebaFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factura fact = new Factura();
		Factura tura = new Factura("Tornillo 851" , "rojo", 7 , 29.99);
		
		System.out.println(tura.obtenerMontoFactura());

	}
}	
