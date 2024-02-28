package tiposGenericos;

public class ClaseGen<T> {
	T miVal; // se declara una variable tipo parametrizado

	// tipo T lo podemos usar en métodos sin problemas
	public ClaseGen(T val) {
		this.miVal = val;
	}

	public T getMiVal() {
		return this.miVal;
	}

	public String toString() {
		return "ClaseGen<" + this.miVal.getClass().getName() + ">: miVal = " + this.miVal;
	}
}


class DemoGen2 {
	 
	 public static <T> void imprimeArray(T[] arr) {
	    for (T val: arr) System.out.printf("%s ", val);
	        System.out.println();
	}

	 public static void main(String[] args) {
	    Double[] a1 = { 3.5, 2.0, 4.5, -1.67 };
	    Integer[] a2 = { 5, 0, 4, -1 };
	    String[] a3 = { "mi", "casa, ", "teléfono " };
	    imprimeArray(a1);
	    imprimeArray(a2);
	    imprimeArray(a3);
	 }
	}

// En ejecución hay que indicar que tipos vamos a usar con esa clase genérica

class DemoGen3 {
	public static void main(String[] args) {
		ClaseGen<Double> obj1 = new ClaseGen<Double>(23.75);
		double v1 = obj1.getMiVal();
		System.out.println("obj1 miVal = " + v1);
		ClaseGen<String> obj2 = new ClaseGen<String>("Hello!");
		String v2 = obj2.getMiVal();
		System.out.println("obj2 miVal = " + v2);
		System.out.println("obj1 = " + obj1);
		System.out.println("obj2 = " + obj2);
	}
}
