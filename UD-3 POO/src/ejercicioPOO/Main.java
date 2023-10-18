package ejercicioPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Creamos cientificos
		Cientifico cien = new Cientifico("Cien",20,"Calle Falsa 123");
		Cientifico ti = new Cientifico("Ti",21,"Calle Falsa 456");
		Cientifico fico = new Cientifico("Fico",22,"Calle Falsa 789");

		
		Scanner sc = new Scanner(System.in);
		
		//Asignamos cientificos 3, cogemos datos del proyecto con teclado
		Proyecto proy = new Proyecto(cien,ti, fico);
		System.out.println("Introduce el nombre del proyecto: ");
		proy.setNombreProy(sc.nextLine());
		System.out.println("Introduce el departamento del proyecto:");
		System.out.println("[1 ----  MARKETING]");
		System.out.println("[2 ----  INVESTIGACIÓN]");
		System.out.println("[3 ----  INFORMÁTICA]");
		int numDepartamento = sc.nextInt();
		
		switch  (numDepartamento){
			case 1:
				proy.setDepartamento(Departamento.MARKETING); 
				break;
			case 2:
				proy.setDepartamento(Departamento.INVESTIGACIÓN);
				break;
			case 3:
				proy.setDepartamento(Departamento.INFORMÁTICA);
				break;
			default:
				break;
		}
		;
		
		System.out.println("Introduce la duración del proyecto en meses: ");
		proy.setDuracionMeses(sc.nextInt());
		sc.close();
		
		//Calculamos presupuesto
		proy.setPresupuesto(proy.calcPresupuesto());
		
		//toString
		System.out.println(proy.toString());

		//Asignamos cientificos 2 
		Proyecto proyect2 = new Proyecto(cien, ti);
		proyect2.setNombreProy("Miercoles");
		//Asignar un cientifico a proyecto
		proyect2.asignar(1, fico);                  

		//Mostramos el científico por pantalla, comprobando que ha sido asignado
		System.out.println("\nEl científico asignado al nuevo proyecto " + proyect2.getNombreProy() + " ha sido:");
		System.out.println(proyect2.getCientifico1());
		
		
	}

}
