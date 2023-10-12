package ejercicios.variables.referencia;

public class DemoPersona {

	public static void main(String[] args) {
		
		//EJERCICIO 1
		Persona p1 = new Persona();
		p1.nombre = "Ana";
		p1.edad = 3;
		
		Persona p2 = new Persona();
		p2.nombre = "David";
		p2.edad = 5;
		
		System.out.printf("%S, %S %n",p1.nombre,p2.nombre);
		
		//EJERCICIO 2
		Persona temp;
		temp = p1;
		p1 = p2;
		p2 = temp;
		
		System.out.printf("%S, %S %n",p1.nombre,p2.nombre);
		
		//EJERCICIO 3
		Persona p3 = p1; 
		//Hay solo dos objetos a los que referencian p1 y p2
		//p3 referencia al objeto al que también referencia p1
		
		System.out.println("p1 == p2?" + (p1 == p2));
		System.out.println("p1 == p3?" + (p1 == p3));
		
		System.out.println(p1.equals(p2));
		temp = null; //elimina la dirección a donde referencia
	}

}
