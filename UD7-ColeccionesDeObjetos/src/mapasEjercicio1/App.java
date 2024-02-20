package mapasEjercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		HashMap<String,Coordenadas> mapaCoordenadas = new HashMap<>();
		
		
		Coordenadas lugoCoord = new Coordenadas("43.01 N","7.33 O");
		Coordenadas barcelonaCoord = new Coordenadas("41.23 N","2.11 E");
		Coordenadas madridCoord = new Coordenadas("40.24 N","3.41 O");
		Coordenadas limaCoord = new Coordenadas("12.03 S","77.03 O");
		Coordenadas inventCoord = new Coordenadas("0 S","0 O");
		
		//añadir
		mapaCoordenadas.put("Lugo", lugoCoord);
		mapaCoordenadas.put("Barcelona", barcelonaCoord);
		mapaCoordenadas.put("Madrid", madridCoord);
		mapaCoordenadas.put("Lima", limaCoord);
		
		//imprimir
		mapaCoordenadas.forEach((capital, coordenada) -> System.out.println(capital + " => " + coordenada));
		System.out.println();
		
		//imprimir 2
		Set<Map.Entry<String, Coordenadas>> setCoord = mapaCoordenadas.entrySet();
		
		for(Map.Entry<String, Coordenadas> fila : setCoord ) {
			String lugar = fila.getKey();
			Coordenadas coord = fila.getValue();
			
			System.out.println(lugar + " => " + coord);
			
		}
		System.out.println();
		//ObtenerObjeto
		Coordenadas coordFind = mapaCoordenadas.get("Lugo");
		System.out.println(coordFind);
		System.out.println();
		//consultar
		mapaCoordenadas.containsKey("Lima");
		mapaCoordenadas.containsValue(inventCoord);
		
		//eliminar
		mapaCoordenadas.remove("Lima");
		mapaCoordenadas.remove("Lugo", limaCoord); //Si no coincide no elimina
		
		
		mapaCoordenadas.forEach((capital, coordenada) -> System.out.println(capital + " => " + coordenada));
	}
}
