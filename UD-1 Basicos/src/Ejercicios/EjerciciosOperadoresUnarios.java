package Ejercicios;

import java.util.Scanner;

public class EjerciciosOperadoresUnarios {

	public static void main(String[] args) {
	
		//EJERCICIO 1
		int x=3;
		 int y;
		 //y=x++*2
		 y=x*2;    //SUSTITUIMOS x++: PRIMERO MULTIPLICA LUEGO INCREMENTA
		 x=x+1;
		 System.out.println("x: "+ x+ " y:"+y);

		
		 //EJERCICIO2
		 int a=3;
		 int b;   //SUSTITUIMOS ++a: PRIMERO INCREMENTA LUEGO MULTIPLICA
		//b=++a*2
		 a=a+1;
		 b=a*2;
		 System.out.println("a: "+ a+ " b:"+b);
		 
		 
		 //EJERCICIO3 ESTA MAL
		 int p = 3;
		 int q = 5;
		 int pn = 3;
		 int qn = 5;
		 int noeq = ++p*q;
		 int sieq = (++pn)*qn;
		 System.out.println(sieq);
		 System.out.println(noeq);
		 System.out.println();//ERROR (++(p*q));
		 
		 
		 //EJERCICIO 4
		 boolean aa = true && true;
		 boolean ab = true && false;
		 boolean ac = false & true;
		 boolean ad = false && false;
		 
		 System.out.println(aa);
		 System.out.println(ab);
		 System.out.println(ac);
		 System.out.println(ad);
		 
		 
		 //EJERCICIO 5
		 boolean z = (x++%5 == ++x%5);
		 System.out.println(z);
		 
		 
		 
		 //EJERCICIO 6 OPERADOR TERNARIO
		 Scanner sc = new Scanner(System.in);
		 
		 int edad; 
		 System.out.println("¿Qué edad tienes?");
		 edad = sc.nextInt();
		 
		 boolean age = edad>=18 && edad<=40 ? true : false;
		 System.out.println("¿Está la edad entre 18 y 40 años? " +age);
		        //AÑADIMOS RANGO 60-70
		 boolean age2 = (edad>=18 && edad<=40) || (edad>=60 && edad <=70) ? true : false;
		 System.out.println("¿Está la edad entre 18 y 40 años, y entre 60 y 70? " +age2);
		 
		 sc.close();
		 
		 
		 
		 //AÑADIDO OPERADOR CONDICIONAL
		 int num1 = 4, num2 = 3;
		 String texto = (num1>num2) ? "x es mayor que y" : "x es menor que y";
		 System.out.println("Fin programa " + texto);
		 
		 if (num1 > num2) {
			 System.out.println("x es mayor que y");
		 }else {
			 System.out.println("x es menor que y");
		 }
		 
		 
		 
		 //EJERCICIO 7
		 int A = 5; int B =3; int C = 12;
		 
		 boolean bool_n1 = (A > 3);
		 boolean bool_n2 = (B != C);
		 boolean bool_n3 = (A*B == 3);
		 boolean bool_n4 = (C/B == -4);
		 boolean bool_n5 = ((A+B ==8) && (A-B == 2));
		 boolean bool_n6 = ((A+B == 8) || (A-B == 6));
		 
		 System.out.println("(A > 3) es " +bool_n1);
		 System.out.println("(B != C) es " +bool_n2);
		 System.out.println("(A*B == 3) es " +bool_n3);
		 System.out.println("C/B == -4) es " +bool_n4);
		 System.out.println("((A+B == 8) && (A-B == 2)) es " +bool_n5);
		 System.out.println("((A+B == 8) || (A-B == 6)) es " +bool_n6);
	}
}
