package bigInteger;
import java.math.BigInteger;


public class Main {

	public static void main(String[] args) {
	
	long miLong=9223372036854775807l;
		BigInteger bigInt=new BigInteger("9999999999999999999999999999999999999999999999999999999999999999999");
		System.out.println(miLong);
		System.out.println(bigInt);
		BigInteger suma=bigInt.add(new BigInteger("1"));
		System.out.println(suma);
		
		BigInteger numberA = new BigInteger("98765432123456789");
		BigInteger numberB = BigInteger.TEN;
		numberA = numberA.add(numberB);
		System.out.println("numberA = " + numberA);
		numberA = numberA.multiply(numberB);
		System.out.println("numberA = " + numberA);
		numberA = numberA.subtract(numberB);
		System.out.println("numberA = " + numberA);
		numberA = numberA.divide(numberB);
		System.out.println("numberA = " + numberA);
		numberA = numberA.mod(numberB);
		System.out.println("numberA = " + numberA);
		numberA = numberA.pow(2);
		System.out.println("numberA = " + numberA);
		numberA = numberA.negate();
		System.out.println("numberA = " + numberA);

	}

}
