package explicacionStatic;

//STATIC QUIERE DECIR QUE PERTENECE A LA CLASE, 
//ES PROPIO DE LA CLASE Y NO DEL OBJETO

//LAS VARIABLES LOCALES NO SE PUEDEN DECLARAR “STATIC”
//SE PUEDEN INICIALIZAR OBJETOS SIN REFERENCIA NEW PUNTO (0,0);

public class Cohete {

	static int numCohetes = 14;
	String nombre;

	Cohete(String nombre) {
		numCohetes++;
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		System.out.println(" total de cohetes " + Cohete.numCohetes);
		Cohete rocket = new Cohete("Cohete");
		System.out.println(" total de cohetes " + Cohete.numCohetes);
		
//		TAMBIÉN SE PUEDE ACCEDER A TRAVÉS DE UN OBJETO
		System.out.println(" total de cohetes " + rocket.numCohetes);
	}

}


//Las variables estáticas se pueden inicializar en bloques estáticos tales como

/*static {
	static variable = 1;
}*/


//En los metodos static no podemos usar this. 
//No hacemos referencia a ningún objeto



//DUDA
//Se puede hacer referencia a un objeto incluido como parámetro
//en un método estático??
