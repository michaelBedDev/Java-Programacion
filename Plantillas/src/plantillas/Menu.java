package plantillas;

import java.util.Scanner;

public class Menu {

	public void seleccionarAccion(Departamento dep) throws InterruptedException {
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
				break;
			case 99:
				Menu.tester(dep);
		}
}
