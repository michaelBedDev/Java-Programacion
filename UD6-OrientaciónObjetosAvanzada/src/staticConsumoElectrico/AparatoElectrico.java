package staticConsumoElectrico;

public class AparatoElectrico {

	static int potenciaConsumo = 0;
	boolean encendido;
	int potenciaAparato;
	
	//Constructor
	AparatoElectrico(int potenciaAparato){
		this.potenciaAparato = potenciaAparato;
		this.encendido = false;
	}
	
	public void encender() {
		
		if(!encendido) {  //(!BOOLEAN SIEMPRE ES FALSE)
		this.encendido = true;
		potenciaConsumo += this.potenciaAparato;
		}
	}
	
	public void apagar() {
		if(encendido) {
		this.encendido = false;
		potenciaConsumo -= this.potenciaAparato;
		}
	}

	
	public static void main(String[] args) {
		AparatoElectrico Bombilla = new AparatoElectrico(150);
		AparatoElectrico Plancha = new AparatoElectrico(2000);
		
		System.out.println("La potencia actual es de " +AparatoElectrico.potenciaConsumo + "W");
		Bombilla.encender();
		Plancha.encender();
		System.out.println("La potencia actual es de " +AparatoElectrico.potenciaConsumo + "W");
		Bombilla.apagar();
		System.out.println("La potencia actual es de " +AparatoElectrico.potenciaConsumo + "W");
		
		
	}
}



