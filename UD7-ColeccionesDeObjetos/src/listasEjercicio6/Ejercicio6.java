package listasEjercicio6;

public interface Ejercicio6<T> {
	
void insert(T x); //Inserta x 
void remove(T x ); //Elimina el primer x
void removeCurrent();  //Elimina el elemento current
boolean find(T x); //Coloca current para poder ver x
void goFirst(); // Coloca current en la primera posición
void advance(); // Avanza current al siguiente nodo
boolean isOnList(); //No está vacía
Object getCurrent(); //Elemento en la posición current
Object getPrevious(); // Elemento de la posición anterior al current
}