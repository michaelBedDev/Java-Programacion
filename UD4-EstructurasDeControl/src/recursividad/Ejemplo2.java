package recursividad;

public class Ejemplo2 {

	public static void main(String[] args) {
		 Multiplicacion m = new Multiplicacion();
		 System.out.println(m.multiplicar(2,10));
		 System.out.println(m.multiplicar(1,3));
		 System.out.println(m.multiplicar(0,9));
		 //System.out.println(m.multiplicar(2,0));
	}
}

class Multiplicacion{
	int multiplicar(int a, int b){
		if(b==1)
		return a;
		else
		return a + multiplicar(a,b-1);
	}
}