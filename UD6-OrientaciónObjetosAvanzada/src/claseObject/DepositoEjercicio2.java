package claseObject;

public class DepositoEjercicio2 {

	private String nombre;
	private double largo;
	private double ancho;
	private double alto;
	private double deposito = largo * ancho * alto;

	public DepositoEjercicio2(String nombre, double largo, double ancho, double alto) {
		super();
		this.nombre = nombre;
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}

	public static void main(String[] args) {
		DepositoEjercicio2 deposito1 = new DepositoEjercicio2("dep1", 3, 2, 5);
		DepositoEjercicio2 deposito2 = new DepositoEjercicio2("dep2", 5, 2, 3);
		
		System.out.println(deposito1.equals(deposito2) ? "El deposito tiene el mismo tamaño" : "El deposito no tiene el mismo tamaño");
	}

	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.deposito == ((DepositoEjercicio2) obj).getDeposito(); //duda sintaxis por qué 
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
}
