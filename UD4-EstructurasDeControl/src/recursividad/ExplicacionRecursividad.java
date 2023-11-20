package recursividad;

public class ExplicacionRecursividad {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		A a=new A();
		B b =new B();
		x=a.modificarDeA(x);
		y=b.modificarDeB(y);
	}
}

class A{
	int modificarDeA(int i){
		int j=3;
		return j+i;
	}
}

class B{
	int modificarDeB(int k){
		int p=2;
		int z=0;
		z= suma1(p);
		return k+z;
	}
	int suma1(int w){
		return w + 1;
	}
}

