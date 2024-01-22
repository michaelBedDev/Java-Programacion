package clasesAbstractas;

class Unidad4 {
	public static void main(String[] args) {
		EmpleadoFijo eFijo = new EmpleadoFijo("fijo", 10);
		System.out.println("Nomina de " + eFijo.nombre + ": " + eFijo.calcularNomina());
		EmpleadoTemporal eTemporal = new EmpleadoTemporal("temporal", 5);
		System.out.println("Nomina de " + eTemporal.nombre + ": " + eTemporal.calcularNomina());
		EmpleadoComercial eComercial = new EmpleadoComercial(30, "comercial", 5);
		System.out.println("Nomina de " + eComercial.nombre + ": " + eComercial.calcularNomina());
	}
}