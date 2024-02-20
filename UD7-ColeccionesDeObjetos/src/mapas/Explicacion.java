package mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Explicacion {
	public static void main(String[] args) {
		Map<Integer, String> mapHttpErrors = new HashMap<>();

		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");

		System.out.println(mapHttpErrors);

		Map<Integer, String> mapErrors = new HashMap<>(mapHttpErrors);

		// Recuperacion de objetos (get, size, is empty, containsKey, containsValue)

		String status301 = mapHttpErrors.get(301);
		System.out.println("301: " + status301);

		if (mapHttpErrors.containsKey("200")) {
			System.out.println("Http status 200");
		}
		if (mapHttpErrors.containsValue("OK")) {
			System.out.println("Found status OK");
		}

		status301 = mapHttpErrors.get(301);
		System.out.println("301: " + status301);

		
//		Actualizar o eliminar
//		remove(Object key): elimina la entrada al mapa, si existe devuelve el objeto eliminado, sino null.
//		replace(Object Key, Object Value): cambia un objeto por otro a partir de la clave.
		
		
		
		// Recorrer un map (no es eficiente pero)

		// keySet
		Map<String, String> mapCountryCodes = new HashMap<>();

		mapCountryCodes.put("1", "USA");
		mapCountryCodes.put("44", "United Kingdom");
		mapCountryCodes.put("33", "France");
		mapCountryCodes.put("81", "Japan");

		Set<String> setCodes = mapCountryCodes.keySet();
		Iterator<String> iterator = setCodes.iterator();

		while (iterator.hasNext()) {
			String code = iterator.next();
			String country = mapCountryCodes.get(code);

			System.out.println(code + " => " + country);
		}

		// values
		Collection<String> countries = mapCountryCodes.values();

		for (String country : countries) {
			System.out.println(country);
		}

		// entrySet
		Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet();

		for (Map.Entry<String, String> entry : entries) {
			String code = entry.getKey();
			String country = entry.getValue();

			System.out.println(code + " => " + country);
		}

		// forEach
		mapCountryCodes.forEach((code, country) -> System.out.println(code + " => " + country));

		// Ejemplo

		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "uno");
		map.put(2, "dos");
		map.put(3, "tres");
		System.out.println("Claves = " + map.keySet()); // set-vista de claves
		System.out.println("Valores = " + map.values()); // set-vista de valores
		System.out.println("Entradas = " + map.entrySet()); // set-vista de entradas

		Set<Integer> claves = map.keySet();
		for (Integer k : claves) {
			System.out.println("clave: " + k + "-> val: " + map.get(k));
		}
		Set<Map.Entry<Integer, String>> entradas = map.entrySet();

		for (Map.Entry<Integer, String> e : entradas) {
			System.out.println("clave: " + e.getKey() + "-> val: " + e.getValue());
		}
	}	
	
	//keyset convierte un mapa en un conjunto de solo las claves. con un for se puede recorrer
	//y con el metodo get y la clave se puede obtener el objeto
}
