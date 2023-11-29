package tareaRepaso;

import java.util.Scanner;

public class Menu {

	private static Scanner sc;
	
	public void seleccionarAccion(Departamento dep) {
		sc = new Scanner(System.in);
		
		System.out.println("[1] para dar de alta a un cientifico  ");
		System.out.println("[2] para eliminar a un cientifico     ");
		System.out.println("[3] para calcular el presupuesto anual");
		System.out.println("[4] para Imprimir Departamento");
		System.out.println("[5] para Buscar un Cientifico");

		int seleccion = sc.nextInt();
		sc.nextLine();
		
		switch (seleccion) {
			case 1:
				dep.altaCientifico();
				break;
			case 2:
				dep.eliminarCientifico(dep.getListaCientificos());
				break;
			case 3:
				dep.calcularPresupuestoAnual(dep.getListaCientificos());
				break;
			case 4:
				System.out.println(dep);
				break;
			case 5:
				dep.buscarCientifico(dep.getListaCientificos());
			case 99:
				Menu.tester(dep);
				
		}
	}
	
	
	private static void tester(Departamento dep) {
		System.out.println("Modo Tester Activado");
		System.out.println();
		System.out.println("[1] toString Investigación");
		System.out.println("[2] toString Cientifico");
		System.out.println("[3] toString Departamento");
		sc = new Scanner(System.in);
		int seleccion = sc.nextInt();
		System.out.println();
		switch (seleccion) {
			case 1:
				System.out.println(dep.getListaCientificos()[0].getInvestigacionAsignada());
				break;
			case 2:
				System.out.println(dep.getListaCientificos()[0]);
				break;
			case 3:
				System.out.println(dep);
			default:
				break;
		}
		
	}
}
