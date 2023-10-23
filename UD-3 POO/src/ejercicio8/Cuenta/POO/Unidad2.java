package ejercicio8.Cuenta.POO;

public class Unidad2{

	public static void main(String[] args) {
		Cuenta c1= new Cuenta("111-222","Epi",50.0);
		System.out.println("el saldo inicial de Epi es: "+ c1.getSaldo());
		Cuenta c2= new Cuenta("999-888","Blas",100.0);
		System.out.println("el saldo inicial de Blas es: "+ c2.getSaldo());
		//no es posible utilizar el constructor sin parámetros
		//Cuenta c3= new Cuenta();
		// modificamos el saldo de Epi
		c1.setSaldo(250.0);
		System.out.println("el nuevo saldo de Epi es: "+ c1.getSaldo());
		// modificamos el saldo de Blas
		c2.setSaldo(877.5);
		System.out.println("el nuevo saldo de Blas es: "+ c2.getSaldo());
 }
}
