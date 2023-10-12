package tareasEjerciciosBásicos;

public class EjercicioBasico6 {

	public static void main(String[] args) {
		
		int a = 2;

		System.out.println("falso		&&		falso		=		" + (1==2));
		System.out.println("falso		&&		verdadero	=		" + (1==2));
		System.out.println("verdadero	&&		falso		=		" + (1==2));
		System.out.println("verdadero	&&		verdadero	=		" + (a==2));
		
		System.out.println();
		
		System.out.println("falso		||		falso		=		" + (1==2));
		System.out.println("falso		||		verdadero	=		" + (a==2));
		System.out.println("verdadero	||		falso		=		" + (a==2));
		System.out.println("verdadero	||		verdadero	=		" + (a==2));

	}

}
