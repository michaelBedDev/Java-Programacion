package herencia.ejercicio2;

public class Main {

	
	
	public static void main(String args[]) {
	Empleado empleado = new Empleado(100,"DNIA","Employee","FakeAddress123");
	Cliente cliente = new Cliente(100,"DNIB","Client","FakeAddress456");
	Persona persona = new Persona("DNIC","Person","FakeAddress789");
	
	System.out.println(empleado.toString());
	System.out.println(cliente.toString());
	System.out.println(persona.toString());
	}
}
