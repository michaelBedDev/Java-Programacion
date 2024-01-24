package clasesAbstractas;


//Lo unico que limita una clase abstracta es crear objetos de la clase. Puede incluir métodos abstractos o no.
//Con abstract obligamos a que los métodos abstractos sean sobreescritos de forma obligatoria.
//Si está escrito un método abstracto es necesario que la clase sea declarada abstracta.



//clase Final -> no hay herencia. metodo / atributo final -> no se sobreescribe al heredar.
//clase abstract -> no se instancian. metodo abstracto -> obliga a declarar clase abstracta. 

//clase abstract obliga a tener herencia para que se implementen sus métodos. Los hijos pueden ejecutar sus métodos no abstractos.
//Los metodos abstract son sobreescritos obligatoriamente al heredar.

//clase estática???? no puede ser instanciada. en las clases estáticas no se pueden añadir interfaces.
//existen clases estáticas?

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
