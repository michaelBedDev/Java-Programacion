package constructor;

public class MiClase {

	int x;
	
	public MiClase(){ //Constructor por defecto
		x = 10;
	}
	
	public MiClase(int i){ //Constructor con parámetros
							//Sobrecarga de métodos
		x = i;
	}
	
	
	public static void main(String[] args) {
		
		MiClase Clase = new MiClase(); //Ejecuta Constructor por defecto
		System.out.println(Clase.x);
		
		MiClase Class = new MiClase(20); //Ejecuta constructor por parámetros
		System.out.println(Class.x);
		
		
	}
}
