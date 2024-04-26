
public class Estudiante {

	    private String nombre;
	    private int edad;
	    private double calificacion;

	    public Estudiante(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.calificacion = 0.0;
	    }

	    public void setCalificacion(double calificacion) {
	        this.calificacion = calificacion;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public double getCalificacion() {
	        return calificacion;
	    }

	    public boolean aprobo() {
	        return calificacion >= 5.0;
	    }

	    public int edadEscolar() {
	        return edad / 12;
	    }

	    public boolean esUniversitario() {
	        return edad >= 18;
	    }

	    public void imprimirInformacion() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	        System.out.println("Calificación: " + calificacion);
	    }
}
