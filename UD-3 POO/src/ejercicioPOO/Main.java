package ejercicioPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Creamos cientificos
		Cientifico cien = new Cientifico();
		cien.setNombreCientifico(null);
		cien.setEdadCientifico(0);
		cien.setDireccionCientifico(null);
		Cientifico ti = new Cientifico();
		ti.setNombreCientifico(null);
		ti.setEdadCientifico(0);
		ti.setDireccionCientifico(null);
		Cientifico fico = new Cientifico();
		fico.setNombreCientifico(null);
		fico.setEdadCientifico(0);
		fico.setDireccionCientifico(null);

		
		Scanner sc = new Scanner(System.in);
		
		//Asignamos cientificos 3
		Proyecto proy = new Proyecto(cien,ti, fico);
		System.out.println("Introduce el nombre del proyecto: ");
		proy.setNombreProy(sc.nextLine());
		System.out.println("Introduce el departamento del proyecto:");
		System.out.println("[1 ----  MARKETING]");
		System.out.println("[2 ----  INVESTIGACIÓN]");
		System.out.println("[3 ----  INFORMÁTICA]");
		int numDepartamento = sc.nextInt();
		if  (numDepartamento == 1){
			proy.setDepartamento(Departamento.MARKETING); 
		}else if (numDepartamento == 2) {
			proy.setDepartamento(Departamento.INVESTIGACIÓN); 
		}else if (numDepartamento == 3){
			proy.setDepartamento(Departamento.INFORMÁTICA);
		}
		System.out.println("Introduce la duración del proyecto: ");
		proy.setDuracionMeses(sc.nextInt());
		
		
		//Calculamos presupuesto
		int numeroEmpleados;
		System.out.println("Introduce el numero de empleados: ");
		numeroEmpleados = sc.nextInt();
		sc.close();
		proy.setPresupuesto(proy.calcPresupuesto(numeroEmpleados));
		
		//toString
		proy.toString();
		
		//Asignamos cientificos 2 
		Proyecto proyect2 = new Proyecto(cien, ti);
		
		//Asignar un cientifico a proyecto
		proyect2.asignar(3, fico);                  

		
	}

}
