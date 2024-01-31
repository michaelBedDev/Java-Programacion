package polimorfismoEjercicio3;

public class App {

	public static void main(String[] args) {
		Barco barco = new Barco("Prestige","altura",7,50000);
		GPS gps = new GPS("30ºO","47ºN","31/01/2024",80);
		
		Tripulante capitan1 = new Capitan(001, gps, 30, 1,"Juan","600000001",'m',barco,7500);
		Tripulante capitan2 = new Capitan(002,gps,31,2,"Martín","600000002",'m',barco,20000);
		Tripulante capitan3 = new Capitan(003,gps,32,3,"Pedro","600000003",'m',barco,35000);
		
		capitan1.calcularSueldoTotal();
		System.out.println(capitan1.mostrarDatos());
		
		capitan2.calcularSueldoTotal();
		System.out.println(capitan2.mostrarDatos());
		
		capitan3.calcularSueldoTotal();
		System.out.println(capitan3.mostrarDatos());

		Tripulante jefe1 = new JefeFlota(004,gps,33,4,"Fernando","600000004",'m',barco,0,1);
		Tripulante jefe2 = new JefeFlota(005,gps,34,5,"Marcos","600000005",'m',barco,1,0);
		
		jefe1.calcularSueldoTotal();
		System.out.println(jefe1.mostrarDatos());
		jefe2.calcularSueldoTotal();
		System.out.println(jefe2.mostrarDatos());

		Tripulante marinero1 = new Marinero(006, gps, 35, 6,"Maricarmen","600000006",'f',barco,1);
		Tripulante marinero2 = new Marinero(007, gps, 36, 7,"MariaDelMar","600000007",'f',barco,0);
		
		marinero1.calcularSueldoTotal();
		System.out.println(marinero1.mostrarDatos());
		marinero2.calcularSueldoTotal();
		System.out.println(marinero2.mostrarDatos());
	}
}
