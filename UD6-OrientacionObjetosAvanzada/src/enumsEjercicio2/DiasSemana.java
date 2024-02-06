package enumsEjercicio2;

public enum DiasSemana implements Posicion{
	LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO;
	
	private int numDia;

	@Override
	public void getPosicion() {
		switch (this) {
			case LUNES -> this.numDia = 1;
			case MARTES -> this.numDia = 2;
			case MIERCOLES -> this.numDia = 3;
			case JUEVES -> this.numDia = 4;
			case VIERNES -> this.numDia = 5;
			case SABADO -> this.numDia = 6;
			case DOMINGO -> this.numDia = 7;
		
		}
		
		System.out.println("Hoy es " + this + " y su número en la semana es el " + this.numDia);
	}
	
	
	
	
	
}
