package sobrecargaSobreescritura.ejercicio3;

public class Perro {

	protected String nombre;
	protected double peso;
	protected String color;
	
	static int contadorPerros;
	static double pesoTotalperros;

	
	
	
	// Constructores
	public Perro() {
	}
	
	public Perro(String nombre, double peso, String color) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.color = color;
		
		contadorPerros++;
	}


	// Metodos

	
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static int getContadorPerros() {
		return contadorPerros;
	}

	public static void setContadorPerros(int contadorPerros) {
		Perro.contadorPerros = contadorPerros;
	}

	public static double getPesoTotalperros() {
		return pesoTotalperros;
	}

	public static void setPesoTotalperros(double pesoTotalperros) {
		Perro.pesoTotalperros = pesoTotalperros;
	}

}
