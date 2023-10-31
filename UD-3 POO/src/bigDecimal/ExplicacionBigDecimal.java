package bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ExplicacionBigDecimal {

	public static void main(String[] args) {
		 BigDecimal bd1 = new BigDecimal("0.1");
		 BigDecimal bd2= new BigDecimal(0.1);
		 System.out.println(bd1.toString());
		 System.out.println(bd2.toString());
		 double d=0.1;
		 System.out.println(d);
		
		 BigDecimal a;
		 a = new BigDecimal("2.53333");
		 System.out.println(a);
		 System.out.println(a.scale());
		 
		 BigDecimal b;
		 b = new BigDecimal("2.53");
		 b.setScale(4);
		 System.out.println(b);
		 System.out.println(b.scale());
		 
		 BigDecimal c = new BigDecimal("2.5333");
		 c=c.setScale(2,RoundingMode.DOWN);
		 System.out.println(c);
		 BigDecimal d1 = new BigDecimal("2.5333");
		 d1=d1.setScale(2,RoundingMode.UP);
		 System.out.println(d1);
		 //y hay más tipos de redondeo ...
		 //USAR ROUNDING MODE
		 
		 
		 BigDecimal a1 = new BigDecimal("1.1");
		 BigDecimal b1 = new BigDecimal("2.2");
		BigDecimal c1= new BigDecimal("3.33");
		BigDecimal sumaAyB=a1.add(b1);
		BigDecimal sumaAyC=a1.add(c1);
		BigDecimal multiplicaAyB=a1.multiply(b1);
		BigDecimal multiplicaAyC=a1.multiply(c1);
		 System.out.println("sumaAyB: "+sumaAyB);
		System.out.println("sumaAyC: "+sumaAyC);
		System.out.println("multiplicaAyB: "+multiplicaAyB);
		System.out.println("multiplicaAyC: "+multiplicaAyC);
		 
		 //EJERCICIO1
		
		BigDecimal numero1 = new BigDecimal("10.7");
		BigDecimal numero2 = new BigDecimal("5.4");
		
		System.out.println(numero1.add(numero2));
		System.out.println(numero1.subtract(numero2));
		System.out.println(numero1.multiply(numero2));
		System.out.println(numero1.divide(numero2,7,RoundingMode.HALF_EVEN));
		
		
		
		//EJERCICIO 2
		BigDecimal numero3 = new BigDecimal(10.7);
		BigDecimal numero4 = new BigDecimal(5.4);
		System.out.println(numero3.add(numero4));
		System.out.println(numero3.subtract(numero4));
		System.out.println(numero3.multiply(numero4));
		System.out.println(numero3.divide(numero4,7,RoundingMode.HALF_EVEN));
		
		//EJERCICIO 3
		
		 
		 //EJERCICIO 4
		BigDecimal precio;
		BigDecimal impuesto;
		BigDecimal pvp;
		System.out.println("Precio del artículo: ");
		Scanner sc = new Scanner(System.in);
		precio = sc.nextBigDecimal();
		System.out.println("Impuesto: ");
		impuesto =sc.nextBigDecimal();
		pvp = new BigDecimal(precio.add(precio.multiply(impuesto).divide(100, 2, RoundingMode.UP)));
		System.out.println(pvp);

	}

}
