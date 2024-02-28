package tiposGenericosEjercicio4;

class Nodo<T> {
	private Nodo<T> sig;
	private T dato;

	public Nodo(T dato) {
		this.dato = dato;
		this.sig = null;
	}

	public Nodo(T dato, Nodo<T> sig) {
		this.dato = dato;
		this.sig = sig;
	}

	public void setSiguiente(Nodo<T> sig) {
		this.sig = sig;
	}

	public Nodo<T> getSiguiente() {
		return sig;
	}

	public T getDato() {
		return dato;
	}
}

class MiListaEnlazada<T> {
	private Nodo<T> primero = null;

	public void Tinsertar(T dato) {
		if (primero == null) {
			primero = new Nodo<>(dato);
		} else {
			Nodo<T> temp = new Nodo<>(dato, primero);
			primero = temp;
		}
	}

	public int tamano() {
		int i = 0;
		Nodo<T> temp = primero;
		while (temp != null) {
			i++;
			temp = temp.getSiguiente();
		}
		return i;
	}

	public T obtener(int indice) {
		Nodo<T> temp = primero;
		int i = 0;
		while (i < indice) {
			temp = temp.getSiguiente();
			i++;
		}
		return temp.getDato();
	}
}
