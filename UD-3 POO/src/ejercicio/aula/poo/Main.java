package ejercicio.aula.poo;

public class Main {

	public static void main(String[] args) {
	
		
		
		//Aula->3Alumnos->1 ordenador para cada uno
		
		Aula aulaClase = new Aula();
		
		aulaClase.id = 26;
		aulaClase.planta = 3;
		
		
		//Crear el objeto alumno y luego asignarlo a alu1 ?
		
		//Crear varios objetos uno para cada alumno y uno para cada ordenador
		//Inicializar luego al crear objetos. Asociar objetos con variables alu1 alu2 alu3
		
		Alumno alumno1 = new Alumno();
		alumno1.dni = 00000001;
		alumno1.edad = 20;
		alumno1.nombre = "Joe";
		alumno1.curso = 1;
		alumno1.ciclo = "ASIR";
		
		Alumno alumno2 = new Alumno();
		alumno2.dni = 00000002;
		alumno2.edad = 21;
		alumno2.nombre = "Kevin";
		alumno2.curso = 2;
		alumno2.ciclo = 
		
		Alumno alumno3 = new Alumno();
		alumno3.dni = 00000003;
		alumno3.edad = 22;
		alumno3.nombre = "Mark";
		alumno3.curso = 1;
		alumno3.ciclo = "DAW";
		
		
		Ordenador ordenador1 = new Ordenador();
		ordenador1.IP = "192.167.00";
		ordenador1.numeroOrdenador = 1;
		ordenador1.reparado = true;
		
		Ordenador ordenador2 = new Ordenador();
		ordenador2.IP = "192.168.00";
		ordenador2.numeroOrdenador = 2;
		ordenador2.reparado = true;
		
		Ordenador ordenador3 = new Ordenador();
		ordenador3.IP = "192.169.00";
		ordenador3.numeroOrdenador = 3;
		ordenador3.reparado = true;
		
		
		aulaClase.alu1 = alumno1;
		aulaClase.alu2 = alumno2;
		aulaClase.alu3 = alumno3;
		
		alumno1.ordenador = ordenador1;
		alumno2.ordenador = ordenador2;
		alumno3.ordenador= ordenador3;
		
	
		System.out.println(aulaClase);

	}

}
