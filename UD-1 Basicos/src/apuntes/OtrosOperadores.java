package apuntes;

public class OtrosOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1; //DESPLAZAR A LA iZQDA = x*2 // DESPLAZAR A LA DCHA = /2
		 System.out.println(x);
		 x=x<<1;
		 System.out.println(x);
		 x=x<<1;
		 System.out.println(x);
		 x=x<<1;
		 System.out.println(x);
		 x=x<<1;
		 System.out.println(x);
		 x=x<<1;
		 System.out.println(x);
		 
		 
		 int a=1, b=2,c=0;
		 System.out.println("a="+a+" b="+b );
		 //operador & trabajando con operandos enteros y por tanto a nivel de bit
		 c=a&b;//aquí los operandos de & son int
		 System.out.println("a&b = "+c);
		 c=a|b;
		 System.out.println("a|b = "+c);
		 System.out.println("a<5="+(a<5));
		 System.out.println("b<7="+(b<7));
		 System.out.println("a<5&b<7="+(a<5&b<7));//aquí los operandos de & son boolean
		 
			 int xx=15;  /*int to String (binary)*/
			 String xEnBinario=Integer.toBinaryString(xx);
			 System.out.println("x en base 10: "+xx);
			 System.out.println("x en base 2: "+xEnBinario);
			 
			 /*String "1111" to int or string to binary*/
			 int p = Integer.parseInt( "1111",2);
			 System.out.println("En base 10 \"1111\" es: "+p);
			
			 //Saber de que tipo es la variable
			 System.out.println(xEnBinario.getClass().getSimpleName());
			 
			 if (xEnBinario instanceof String) {
				 System.out.println("Es un string");
			 } 
			 System.out.println((xEnBinario instanceof String)? "Es un string" : "no es un string");
			 //tambien se puede hacer:
			 boolean binary = (xEnBinario instanceof String);
			 System.out.println(binary);
	}

}
