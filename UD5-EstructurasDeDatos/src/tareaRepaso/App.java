package tareaRepaso;

public class App {

	public static void main(String[] args) {
		
		Departamento DepPorDefecto = new Departamento("Departamento por defecto", 0);
		Investigacion InvPorDefecto = new Investigacion(00,"Investigación por defecto");
		Cientifico CientificoPorDefecto = new Cientifico("DefectoNombre","DefectoApellido,",Experiencia.BAJA,0,InvPorDefecto);
		DepPorDefecto.asignarCientifico(CientificoPorDefecto);
		
		System.out.println(DepPorDefecto); //Arreglar imprimir objeto Cientifico
		DepPorDefecto.altaCientifico(InvPorDefecto);
		//Arreglar
		DepPorDefecto.eliminarCientifico(DepPorDefecto.getListaCientificos());
		//Arreglar 
		DepPorDefecto.calcularPresupuestoAnual(DepPorDefecto.getListaCientificos());
		

	}

}
