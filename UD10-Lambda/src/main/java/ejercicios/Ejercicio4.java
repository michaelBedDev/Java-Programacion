package ejercicios;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ejercicio4 {

	public static void main(String[] args) {
		Set<Factura> coleccionFactura = new HashSet<Factura>();
		
		
		
		coleccionFactura.add(new Factura(1,"concepto1",99));
		coleccionFactura.add(new Factura(2,"concepto2",199));
		coleccionFactura.add(new Factura(3,"concepto3",299));
		coleccionFactura.add(new Factura(4,"concepto4",298));
		
		Set<Factura> coleccionFiltrada = coleccionFactura.stream().filter(f -> f.getImporte() > 200).collect(Collectors.toSet());
		
	coleccionFiltrada.stream().map(Factura::getConcepto).forEach(System.out::println);
	

	coleccionFactura.stream()
			.filter((f -> f.getImporte()>200  && f.getImporte() < 300)).forEach(System.out::println);;
	}
}
