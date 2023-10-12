package apuntes;

import java.util.Scanner;

public class d20_09_2023 {

	public static void main(String[] args) {
				
		//EJEMPLOS TECLADO
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca aquí su nombre: ");
		String name = sc.nextLine();
		System.out.println("Bienvenido " +name);
		
		System.out.println("¿Cuál es tu edad?");
		int edad = sc.nextInt();
		System.out.println("Genial, el año que viene cumplirás: " +(edad+1));
		sc.close();
		
		
		
		
		//Conversiones y cast
		
		double x, y;
		 byte b;
		 int i;
		 char ch;
		 x=10.0;
		 y=3.0;

		 //i = x/y; //error la división x/y genera un double y no se puede asignar a entero sin downcast
		 i = (int) (x/y); //la division genera un double el cast lo pasa a int truncando.
		 System.out.println("Salida de entero de x/y: " +i);

		 int m=10;
		 int n=3;
		 i = m/n; //habrá truncamiento producida por la propia division entera.
		 System.out.println("Salida de entero de m/n: " +i);
		 i=100;
		 b= (byte) i; //no habrá perdida pues con byte puedo almacenar de -128 a 127
		 System.out.println("al convertir int 100 a byte: " +b);
		 i= 300;
		 b= (byte) i; //habrá perdida
		 System.out.println("al convertir int 300 a byte: " +b);
		 i= 18600;
		 b= (byte) i; //habrá perdida y se genera un número negativa por que el 8º bit codifica signo en el tipo byte.
		 System.out.println("al convertir int 18600 a byte: " +b);

		 i= 65; //código ascii para x
		 ch = (char) i;
		 System.out.println("ch: " + ch);

		 //ch= ch+1; //error la expresion genera un int
		 ch=(char)(ch+1);
		 System.out.println("ch: " + ch);
		 
		 byte bx=-128;
		 byte by=1;
		 System.out.println("bx-by sin hacer cast a byte es un entero: " + (bx-by) );
		 byte bz = (byte)(bx - by);
		 System.out.println("pasando -129 a byte: " + bz );
	}

}
