package ordenacionEjercicio3;

import java.util.Comparator;

public class SortByNameAge implements Comparator<Estudiante>{

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		
		if(o1.getNombre().equals(o2.getNombre())) {
			return Integer.compare(o1.getEdad(), o2.getEdad());
		}
		else{
			return o1.getNombre().compareTo(o2.getNombre());
		}
	}

}
