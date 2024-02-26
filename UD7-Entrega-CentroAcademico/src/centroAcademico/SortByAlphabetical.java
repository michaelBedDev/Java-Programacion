package centroAcademico;

import java.util.Comparator;

public class SortByAlphabetical implements Comparator<Asignatura> {

	@Override
	public int compare(Asignatura o1, Asignatura o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
