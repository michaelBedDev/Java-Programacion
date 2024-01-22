package clasesAbstractas;


//Lo unico que limita una clase abstracta es crear objetos de la clase
//Con abstract obligamos a que los métodos abstractos sean sobreescritos de forma obligatoria.


abstract class Empleado {
	String nombre;
	int ant;
	int sueldoBase = 1000;

	public Empleado(String nombre, int ant) {
		this.nombre = nombre;
		this.ant = ant;
	}
	abstract int calcularNomina();
}

class EmpleadoFijo extends Empleado {
	public EmpleadoFijo(String nombre, int ant) {
		super(nombre, ant);
	}

	int calcularNomina() {
		return sueldoBase + 100 * ant;
	}
}

class EmpleadoTemporal extends Empleado {
	public EmpleadoTemporal(String nombre, int ant) {
		super(nombre, ant);
	}

	int calcularNomina() {
		return sueldoBase + 50 * ant;
	}
}

class EmpleadoComercial extends Empleado {
	int comision;

	public EmpleadoComercial(int comision, String nombre, int ant) {
		super(nombre, ant);
		this.comision = comision;
	}

	int calcularNomina() {
		return sueldoBase + comision;
	}
}
