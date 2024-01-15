package herencia.ejercicio1;

public class ordenadorMesa extends Ordenador {

	private String tipoCaja;
	
	
	ordenadorMesa(String caja, int RAM, String procesador){
		super(procesador, RAM);
		this.tipoCaja = caja;
	}
}
