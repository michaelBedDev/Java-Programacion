package explicacionStatic;

public class PuntoEjercicio1 {

	int x, y;
	static int numPuntos = 0;

	PuntoEjercicio1(int x, int y) {
		this.x = x;
		this.y = y;
		numPuntos++;
	}
}
