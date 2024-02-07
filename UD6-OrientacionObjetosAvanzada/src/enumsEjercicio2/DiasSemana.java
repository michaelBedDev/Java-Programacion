package enumsEjercicio2;

public enum DiasSemana implements Posicion{
	LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO;

	@Override
	public int diaNum() {
		
		return ordinal() + 1;
		}
		
		
	}

class DiaSemana{
	
	public static void main(String[] args) {
		
		DiaSemana dia = new DiaSemana();
		System.out.println("Hoy es " + DiasSemana + " y su número en la semana es el " + DiasSemana.diaNum() );
	}
}

