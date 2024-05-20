package comparations;

import java.util.Comparator;

import data.Contacto;

public class CompararContactosEdad implements Comparator<Contacto>{

	
	 @Override
	    public int compare(Contacto o1, Contacto o2) {
	        return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
	    }
	
	
}
