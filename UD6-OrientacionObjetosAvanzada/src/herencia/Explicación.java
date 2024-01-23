package herencia;

	class Persona { 
	    String nombre; 
	    int edad; 
	   
	    public void imprimePersona() {System.out.println("Datos personales: " + nombre + ", "+ edad ); 
	    } 
	} 
	class Alumno extends Persona{ 
	    char grupo; 
	}
	class Unidad4 {
	    public static void main(String[] args) {
	        Persona p1 = new Persona();
	        p1.nombre="Elías";
	        p1.edad=5;
	        p1.imprimePersona();
	        
	        Alumno a1= new Alumno();
	        a1.nombre="Román";
	        a1.edad=3;
	        a1.grupo='a';
	        a1.imprimePersona();
	    }
	}

