package ejercicio;

public class EmpresaTest {

	public static void main(String[] args) {
		
		Empresa testEmpresa = new Empresa();
		testEmpresa.datosEmpresa();
		
		Empleado testEmpleado = new Empleado("98345271K","Ana","Martínez",38,"Barcelona");
		testEmpresa.setEmpleado(testEmpleado);
		
		System.out.println(testEmpresa.toString());

	}

}
