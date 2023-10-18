package sobrecargaMetodos;

public class Main {

	public static void main(String[] args) {
		
		SobreCarga ob = new SobreCarga();
		 ob.metodoSobreCargado();
		 ob.metodoSobreCargado(5);
		 ob.metodoSobreCargado(5, 10);
		 ob.metodoSobreCargado(6.7, 16);

	}

}
