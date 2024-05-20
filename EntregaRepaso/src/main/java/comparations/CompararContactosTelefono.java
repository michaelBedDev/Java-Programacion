package comparations;

import java.util.Comparator;

import data.Contacto;

public class CompararContactosTelefono  implements Comparator<Contacto>{

	@Override
	public int compare(Contacto o1, Contacto o2) {
		
		return Double.compare(o1.getTelefono(), o2.getTelefono());
	}

}
