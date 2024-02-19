package ordenacionEjercicio1;

import java.util.Comparator;

public class SortById implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		
//		return o1.getCodArticulo().compareTo(o2.getCodArticulo());
		return Integer.compare(o1.cantidad, o2.cantidad);
	}
	
}
