package ejercicioParking;

public class Furgoneta extends Coche{

	
	protected Furgoneta() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	protected Furgoneta(String matricula, String color) {
		super(matricula, color);
		//TODO Auto-generated constructor stub
	}
	
	@Override
	public void addHuecosParking() {
		Parking.setContadorPlazas(Parking.getContadorPlazas()+2);
	}
	
	@Override
	public void removeHuecosParking() {
		Parking.setContadorPlazas(Parking.getContadorPlazas()-2);
	}
}
