package enumsEjercicio1;

public enum Posicion implements Deportista{
	DELANTERO,CENTROCAMPISTA,DEFENSA,PORTERO;

	@Override
	public void getPosicion() {
		System.out.println("La posición del jugador es " + this);
		
	}
}
