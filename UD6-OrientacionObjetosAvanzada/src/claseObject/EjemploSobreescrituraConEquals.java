package claseObject;

public class EjemploSobreescrituraConEquals {

	class Punto2D{
		 private int x;
		 private int y;
		 private String nombre;
		  
		 public Punto2D(int x, int y, String nombre) {
		  super();
		  this.x = x;
		  this.y = y;
		  this.nombre=nombre;
		 }
		 
		 @Override
		 public boolean equals(Object o) { 
		  if (!(o instanceof Punto2D)) return false;
		    Punto2D punto = (Punto2D) o;
		    return (x == punto.x) && (y == punto.y);
		 } 
		}
}
