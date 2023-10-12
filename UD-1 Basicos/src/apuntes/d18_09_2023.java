package apuntes;

public class d18_09_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int radioCirculo = 2;
		double areaCirculo;
		
		areaCirculo = radioCirculo * radioCirculo * Math.PI;
		
		System.out.println(areaCirculo);

		
		//SIGUIENTE EJERCICIO DE PRUEBA
		
		
		 byte midato1 = 1;
		 short midato2 = 100;
		 int midato3 = 10000;
		 long midato4 = 100000000;
		
		 System.out.println("la variable byte vale: " + midato1);
		 System.out.println("la variable short vale: " + midato2);
		 System.out.println("la variable int vale: " + midato3);
		 System.out.println("la variable long vale: " + midato4);
		 
		 long i1 = 5L;// 5L es un literal long
		 long i2 = 5l;//5l literal long pero l minúscula se confunde con 1
		 int i3 = 5;//literal int
		 short s;
		 byte b;
		 s=3; //3 es un literal int no existen literales short
		 b=3; //3 es un literal int no existen literales byte
		 
		 System.out.println("15 en decimal: "+15);
		 System.out.println("15 en octal: "+017);
		 System.out.println("15 en hexadecimal: "+0xF);
		 System.out.println("15 en binario: "+0B1111); //se puede usar b minúscula
		 
		 float valor;
		 //la siguiente instrucción da error si la descomentas
		 //valor = 2.6;
		 //la siguiente instrucción es correcta
		 valor = 2.6f;
		 System.out .println("Valor del dato= " + valor);

		 System.out.println("1/3 con valores float "+ 1.0f/3.0f);
		 System.out.println("1/3 con valores double "+ 1.0d/3.0d);
		 
		//COMO CREAR UN CHAR
		 char a = 'a';
		 
		 char letra_n;
		 letra_n='n'; //Como caracter simple
		 System.out.println("El valor de la variable letra_n es "+letra_n);
		 letra_n=110; //Valor unicode en decimal
		 System.out.println("El valor de la variable letra_n es "+letra_n);
		 letra_n='\u006E'; //Valor unicode simple
		 System.out.println("El valor de la variable letra_n es "+letra_n);
		 
		 //Secuencias de escape
		 System.out.println("-Papá, ¿somos amigos no?\n-Si\n-Y siempre estaremos juntos, ¿verdad?");
		 System.out.print("-Simba, te voy a contar algo que un día me dijo mi padre. ");
		 System.out.println("Mira las estrellas. Los grandes reyes del pasado nos observan desde esas estrellas.");
		 System.out.println("-¿De veras?");
		 System.out.println("-Si. Y cuando te sientas solo, recuerda que esos reyes estarán ahí para guiarte. Y yo también.");

		 System.out.print('A');
		 System.out.print('\t');
		 System.out.print('B');
		 System.out.print('\t');
		 System.out.println('C');
		 
		 System.out.println('\\');
		 //System.out.print('\');
		 System.out.println('\"');
		 
		 
		 //STRINGS
		 String saludo="hola";
		 System.out.println(saludo);
		 System.out.println(saludo+" mundo" );

		 System.out.println("Primera línea \n Segunda linea");
		 System.out.println("A\tB\tC");
		 System.out.println("D\tE\tF");
		 System.out.println("la barra \\ sirve para representar secuencias de escape ");
		 System.out.println("el carácter \' se usa mucho al trabajar con el tipo char");
		 
		 //BOOLEANS
		 boolean d;
		 d = false;
		 System.out.println(" b es " +d);
		 System.out.println("hola mundo");
		 d = true;
		 System.out.println(" b es " +d);
		 
	}
	
}
