package sobrecargaMetodos;

public class SobreCarga{
	 void metodoSobreCargado(){
		 System.out.println("no hay parámetros");
		 }
	 void metodoSobreCargado(int a){
		 System.out.println("un parámetro: " + a);
		 }
	 void metodoSobreCargado(int a,int b){
		 System.out.println("dos parámetros: " + a +" y " + b);
		 }
	  void metodoSobreCargado(double a,int b){
		 System.out.println("dos parámetros: " + a +" y " + b);
		 }
		}
