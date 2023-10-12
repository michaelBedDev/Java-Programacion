package apuntes;

public class Operadoresbasicos {

	public static void main(String[] args) {
		
		
		//suma y concatenaciones. operandos enteros = division entera
		//algun operando real = division real
		System.out.println("4/2 ="+ 4/2);
		System.out.println("4.0/2 ="+ 4.0/2);
		System.out.println("4/2.0 ="+ 4/2.0);
		System.out.println("5/2 ="+ 5/2);
		System.out.println("5.0/2 ="+ 5.0/2);
		System.out.println("5/2.0 ="+ 5/2.0);
		
		//% devuelve el resto de una división entera
		System.out.println("10%1="+ 10%1);
		System.out.println("10%2="+ 10%2);
		System.out.println("10%3="+ 10%3);
		System.out.println("10%4="+ 10%4);
		System.out.println("10%5="+ 10%5);
		System.out.println("10%6="+ 10%6);
		System.out.println("10%7="+ 10%7);
		System.out.println("10%8="+ 10%8);
		System.out.println("10%9="+ 10%9);
		System.out.println("10%10="+ 10%10);
		System.out.println("10%11="+ 10%11);

		
		//Operadores unarios
		//el + unario no es necesario
		 int result = +1;
		 System.out.println(result);
		 result=-9;
		 System.out.println(result);
		 result++;
		 System.out.println(result);
		 result--;
		 System.out.println(result);

		 result = -result;
		 System.out.println(result);
		 boolean soyElMejor = false;
		 System.out.println(soyElMejor);
		 boolean soyUnFracasado=!soyElMejor;
		 System.out.println(soyUnFracasado);
		 
		 int miNumero=2+5;
		 String miString="2"+"5";
		 System.out.println(miNumero);
		 System.out.println(miString);
		 
		//Como java convierte 2+"5" en un string "25" no se puede asignar un string a un entero
		 // int miNumero=2+"5";
		 String miString1=2+"5";
		 System.out.println(miString1);
		 String miString2="9"+5;
		 System.out.println(miString2);
		 String miString3= 9+ " salchichones";
		 System.out.println(miString3);
	
		 //PRECEDENCIA OPERADORES
		 System.out.println(2+3+"hola");
		 System.out.println("hola"+2+3);
		 System.out.println(4+1+"-"+4+1);
		 
		 //OPERADORES RELACIONALES Y LOGICOS
		 int x=8;
		 int y=5;
		 boolean compara=(x<y);
		 System.out.println("x<y es "+compara);
		 compara=(x>y);
		 System.out.println("x>y es "+compara);
		 compara=(x==y);
		 System.out.println("x==y es "+compara);
		 compara=(x!=y);
		 System.out.println("x!=y es "+compara);
		 compara=(x<=y);
		 System.out.println("x<=y es "+compara);
		 compara=(x>=y);
		 System.out.println("x>=y es "+compara);
		 
	 

		 
	}

}
