package tareaRepaso;

public class App {

	public static void main(String[] args) {
		
		Investigacion InvPorDefecto = new Investigacion(00,"Investigación por defecto");
		Cientifico CientificoPorDefecto = new Cientifico("DefectoNombre","DefectoApellido",Experiencia.ALTA,0,InvPorDefecto);
		Departamento DepPorDefecto = new Departamento("Departamento por defecto", 0, CientificoPorDefecto);
		
		Menu menu = new Menu();
		menu.seleccionarAccion(DepPorDefecto);
	}
}