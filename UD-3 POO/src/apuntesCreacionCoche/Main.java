package apuntesCreacionCoche;

public class Main{
	 public static void main(String[] args) {
	 Coche coche1 = new Coche();//se crea el objeto
	 
	 coche1.kpl = 37;
	 coche1.deposito = 55;
	 coche1.setPasajeros(5);
	 System.out.println("pasajeros:" + coche1.getPasajeros()); //se usa el objeto
	 System.out.println("kilometros por litro:" + coche1.kpl); //se usa el objeto
	 System.out.println("deposito:" + coche1.deposito); //se usa el objeto
	 
	 Coche coche2 = new Coche();
	 //coche2.pasajeros = 4;
	 coche2.kpl = 73;
	 coche2.deposito = 33;
	 System.out.println("pasajeros:" + coche2.getPasajeros()); //se usa el objeto
	 System.out.println("kilometros por litro:" + coche2.kpl); //se usa el objeto
	 System.out.println("deposito:" + coche2.deposito); //se usa el objeto
	 
	 
	 coche1.modelo = "Audi A3";
	 coche2.modelo = "Kia Ceed";
	 coche1.arreglar();
	 coche2.arreglar();
	 
	 
	 coche2.modelo = "VW Passat";
	 coche1 = coche2;   //AHORA COCHE 1 REFERENCIA A TODOS LOS ATRIBUTOS DE COCHE 2
	 coche1.arreglar();
	 coche2.arreglar();
	 
	 coche1.id = new Id_Coche(); //Asignamos al objeto coche1/megane el atributo id (que al englobar varios atributos necesita instanciarse en otro objeto llamado Id_Coche
		//De esta forma el objeto coche1/megane tiene otro objeto referenciado (dentro) que es Id_Coche, que a su vez tiene atributos matricula y numBastidor 
	 
	 /*EJERCICIO1*/
	 Coche megane = new Coche();
	 megane.deposito = 60;
	 System.out.println(megane.deposito);
	 
	 /*EJERCICIO 2*/
	 Coche peugeot308 = new Coche();
	 peugeot308.modelo = "Peugeot 308";
	 //peugeot308.pasajeros= 5;
	 peugeot308.deposito = 60;
	 peugeot308.kpl = 20;
	 
	 //SETTERS Y GETTERS
	 peugeot308.setModelo(null); //en lugar de peugeot308.modelo = "Peugeot 308";
	 peugeot308.setPasajeros(5);
	 peugeot308.setDeposito(55);
	 peugeot308.setModelo(null);
	 
	 System.out.println(peugeot308.getDeposito()); //En lugar de System.out.println(peugeot308.deposito);
	
	 //ES IMPORTANTE PORQUE LOS METODOS Y CLASES PRIVADAS ES LA UNICA FORMA DE ACCEDER A LOS ATRIBUTOS DE LOS OBJETOS
	 
	 
	 
	 System.out.println(peugeot308);
	 System.out.println("La autonomía del coche es: " + peugeot308.autonomiaCoche() + " kilómetros");
	
	 
	/*EJERCICIO 3 Y CREACION DE LA CLASE PERSONA*/
	Persona p1 = new Persona();
	Persona p2 = new Persona();
	p1.edad = 45;
	p1.nombre = "yo";
	p2.edad = 37;
	p2.nombre = "tú";
	
	
	System.out.println(p1); //Metodo toString dentro de la clase persona
	System.out.println(p2); //Metodo toString dentro de la clase persona
	System.out.println("La suma de las edades es: " + (p1.edad + p2.edad));
	
	int km = 100;
	System.out.println("Para recorrer 100 kilometros se necesitan " + peugeot308.gasofaNecesaria(km) + " litros");
	
	/* Debe haber concordancia entre clase de variable y objeto
	Coche golf = new Coche(); //O.K.
	Persona p = new Coche();//MAL
	Coche golf = new Persona();//MAL
	*/

	
	/*Coche coche1 = new Coche();
 	Coche coche2;
 	coche2 = coche1; //coche2 referencia al mismo objeto que coche1
 	
 	Solo hay un objeto. coche 2 referencia a la información del coche 1 que sí tenía un objeto rreferenciado*/
	
	//Para saber si una variable referencia apunta a un objeto o no:
	//boolean b = peugeot308 == null; System.out.println(b);
	//Si la variable no apunta a ningún objeto devuelve true
	 }
}
