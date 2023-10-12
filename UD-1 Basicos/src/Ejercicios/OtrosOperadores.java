package Ejercicios;

public class OtrosOperadores {

	public static void main(String[] args) {

		//EJERCICIO 1
		
		int numero; numero = 5;
		boolean paridad = numero % 2 == 1 ? true : false;
		System.out.println("El número es par: " +paridad);
		
		//EJERCICIO 2
		int numero1, numero2; numero1 = 15; numero2 = 5;
		boolean multiplo = (numero1 % numero2) == 0 ? true : false;
		System.out.println("El primer número es múltiplo del segundo: " +multiplo);
		
		//OTRO EJEMPLO AÑADIENDO OPERADOR TERNARIO EN PRINTLN
		//System.out.println( numero1 + (numero1%numero2==0? "es multiplo de ": "no es multiplo de ")+y;
				
		//EJERCICIO 3
		int aa = 15; int bb = 100;
		System.out.println((aa*aa>100) ? "Nuevo valor de bb: " + ++bb: "Nuevo valor de bb: " + --bb);
		
		/*EJERCICIO 7*/
		System.out.println("4*1=" + (1<<2));
		System.out.println("4*2=" + (2<<2));
		System.out.println("4*3=" + (3<<2));
		System.out.println("etc...");
		
		/*EJERCICIO 8*/
		int xx =4, yy =5;
		System.out.println("x= "+xx +" "+"y= "+yy);
		
		System.out.println("Multiplicación lógica: "+Integer.toBinaryString(xx)+
		 " and "+ Integer.toBinaryString(yy) +" = " + Integer.toBinaryString(xx&yy));
		
		System.out.println("Multiplicación aritmética: "+Integer.toBinaryString(xx)+
		" * "+Integer.toBinaryString(yy) + " = "+Integer.toBinaryString(xx*yy));
		
		/*EJERCICIO 9*/
		int i=10;
		System.out.println("Valor inicial de i: " + i);
		i%=3; 
		System.out.println("Valor de i tras i%=3: " + i);
		
		/*PREGUNTAR*/
		i>>=1;
		System.out.println("Valor de i tras i>>=1:  " + i);
		i|=1;
		System.out.println("Valor de i tras i|=1: " + i);
		
		}
	
	}

