package supermercado;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cajero {

	private LinkedList<Cesta> colaCestas;
	private HashMap<String, Producto> mapaProductos; // idProducto, Producto

	protected Cajero() {
		super();
		colaCestas = new LinkedList<>();
		mapaProductos = new HashMap<>();

		generarProductosPorDefecto();
	}

	private void generarProductosPorDefecto() {
		Producto p1 = new Producto("A-0000", "Producto por Defecto 1", 10.0);
		Producto p2 = new Producto("A-0001", "Producto por Defecto 2", 20.0);
		Producto p3 = new Producto("A-0002", "Producto por Defecto 3", 30.0);
		Producto p4 = new Producto("A-0003", "Producto por Defecto 4", 40.0);

		mapaProductos.put(p1.getIdProducto(), p1);
		mapaProductos.put(p2.getIdProducto(), p2);
		mapaProductos.put(p3.getIdProducto(), p3);
		mapaProductos.put(p4.getIdProducto(), p4);

		Cesta c1 = new Cesta("U1", false);
		Cesta c2 = new Cesta("U2", true); // tiene descuento
		Cesta c3 = new Cesta("U3", false);

		c1.getProductosAComprar().add(p1); // Usuario1
		c1.getProductosAComprar().add(p2);
		c2.getProductosAComprar().add(p4); // Usuario2
		c2.getProductosAComprar().add(p3);
		c3.getProductosAComprar().add(p2); // Usuario3

		c1.calcularImporteTotal();
		c2.calcularImporteTotal();
		c3.calcularImporteTotal();

		Cesta u4 = new Cesta("U4", false); // Usuario U4
		u4.getProductosAComprar().add(p1);
		u4.calcularImporteTotal();

		colaCestas.add(c1);
		colaCestas.add(c2);
		colaCestas.add(c3);
		colaCestas.add(u4);

	}

//Pagar la primera cesta de la cola
	public void pagarCesta() {
		colaCestas.getFirst().calcularImporteTotal();
		System.out.println("Importe Total de la cesta: " + colaCestas.get(0).getImporteTotal());
		colaCestas.removeFirst();
		System.out.println("Cesta pagada satisfactoriamente");
		
		//Añadir al fichero de compras del dia
		crearFicheroComprasDia(String.valueOf(colaCestas.get(0).getImporteTotal()) + "\n");	
	}

//Aplicar descuento a la primera cesta de un usuario
	public void aplicarDescuento(String idCliente) { // El descuento se le aplica a la primera cesta
														// de ese usuario que se encuentre en la cola
		boolean descuentoAplicado = false;

		Cesta temp = null;

		for (Cesta c : colaCestas) {

			if (c.getidCliente().equals(idCliente)) {
				c.setDescuento(true);
				c.calcularImporteTotal();

				System.out.println("El importe de la cesta es: " + c.getImporteTotal());
				System.out.println("El importe con descuento es de: " + c.getImporteConDescuento());
				System.out.println("Aplicado descuento correctamente\n");

				temp = c;
				descuentoAplicado = true;
				break;
			}
		}
		colaCestas.remove(temp);

		if (!descuentoAplicado) {
			System.out.println("No se han encontrado cestas con ese Usuario asignado");
		}
	}

//Ordenar productos de una cesta por precio
	public void ordenarListaCompra(String idCliente) {
		boolean cestaEncontrada = false;

		for (Cesta c : colaCestas) {
			if (c.getidCliente().equals(idCliente)) {
				cestaEncontrada = true;
				Collections.sort(c.getProductosAComprar());
				System.out.println("La cesta está ahora ordenada por precio");
				System.out.println(c + "\n");
			}
		}

		if (!cestaEncontrada) {
			System.out.println("No se han encontrado cestas con ese Usuario asignado");
		}
	}

//Ver qué cestas están esperando (cestas)
	public void mostrarProductosYCestas() {
		System.out.println("Cestas actuales en el Supermercado:");
		for (Cesta c : colaCestas) {
			System.out.println(c);
		}
		System.out.println();
	}

// Ver cuántas cestas están esperando (numero)
	public void mostrarCestasEsperando() {
		System.out.printf("Hay %d cestas esperando\n", colaCestas.size());
		mostrarProductosYCestas();
	}

//Añadir producto a una cesta
	public boolean altaProductoEnCesta(String idProducto, String idCliente) {

		boolean ClienteExiste = false;
		Cesta cestaTemp = null;

		try {
			if (!mapaProductos.containsKey(idProducto)) {
				throw new Exception("El producto no existe");
			}

			for (Cesta c : colaCestas) {
				if (c.getidCliente().equals(idCliente)) {
					ClienteExiste = true;
					c.getProductosAComprar().add(mapaProductos.get(idProducto));
					cestaTemp = c;
				}
			}

			if (!ClienteExiste) {
				throw new Exception("El cliente no existe o no tiene cesta asignada");
			} else {
				System.out.println("Producto agregado correctamente");
				System.out.println("Cesta actualizada: " + cestaTemp + "\n"); // Caso añadir A-0000 a U4 no calcula bien
																				// el importe total
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

//Añadir productos por fichero
	public boolean altaProductosPorFichero() {
		Path ficheroProductos = Paths.get("productosToAdd.txt");

		try { // escribo si el fichero está vacío
			String naranjas = "C-6536:Narajas de Almería:5.5";
			Files.writeString(ficheroProductos, naranjas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean flagAnadido = false;

		
		
		
		try (Stream<String> lines = Files.lines(ficheroProductos)){
			lines.filter(line -> line.matches("[A-Z]-\\d{4}:[\\p{L}\\s]+:\\d+(\\.\\d+)?"))
		    .forEach(line -> {
		        Producto p1 = new Producto();
		        String[] datosTemporales = line.split(":");
		        p1.setIdProducto(datosTemporales[0]);
		        p1.setDescripcion(datosTemporales[1]);
		        double importeProducto = Double.parseDouble(datosTemporales[2]);
		        p1.setImporteProducto(importeProducto);
		        mapaProductos.put(p1.getIdProducto(), p1);
		    });
			flagAnadido = true;

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		try {
			List<String> lineasProductos = Files.readAllLines(ficheroProductos);
			for (String line : lineasProductos) {
				
				if (line.matches("[A-Z]-\\d{4}:[\\p{L}\\s]+:\\d+(\\.\\d+)?")) {

					Producto p1 = new Producto();
					String[] datosTemporales = line.split(":");
					p1.setIdProducto(datosTemporales[0]);
					p1.setDescripcion(datosTemporales[1]);
					double importeProducto = Double.parseDouble(datosTemporales[2]);
					p1.setImporteProducto(importeProducto);

					mapaProductos.put(p1.getIdProducto(), p1);
					flagAnadido = true;
				}
			}
			if (flagAnadido) {
				System.out.println("El producto se ha añadido correctamente");
				System.out.println("Ver fichero en: " + ficheroProductos.toUri() + "\n");
			}

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
	
	
//Fichero con las compras del dia //REVISARR
	private void crearFicheroComprasDia(String precioCesta) {
		
		Path ficheroCompras = Paths.get("comprasDia.txt");

		try {	
			 Files.write(ficheroCompras, precioCesta.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//mostrar las compras del dia
	public void mostrarComprasDia() {
		Path ficheroCompras = Paths.get("comprasDia.txt");
		try {
			byte [] data = Files.readAllBytes(ficheroCompras);
			System.out.println(new String(data));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//crear fichero de las cestas en la cola
	public void escribirCestasFichero() {
		Path ficheroCestas = Paths.get("ficheroCestas.txt");
		
		List<Cesta> listaCestas = colaCestas.stream().collect(Collectors.toList());
		
		try {
			Files.write(ficheroCestas, listaCestas.toString().getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//leer fichero de cestas
	public void leerCestasFichero() {
		Path ficheroCestas = Paths.get("ficheroCestas.txt");

		try {
			byte[] data = Files.readAllBytes(ficheroCestas);
			System.out.println(new String(data));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//comprobar si el fichero de productos es correcto
	public void comprobarFicheroProductos() {
		Path ficheroProductos = Paths.get("productosToAdd.txt");
		
		try(Stream<String>lines = Files.lines(ficheroProductos)){
			int numLineas = (int) lines.filter(line -> !line.isBlank()).count();
			System.out.printf("Hay %d lineas en el fichero de productos", numLineas);
			
			boolean isFormatCorrect = Files.lines(ficheroProductos)
				    .allMatch(line -> line.matches("[A-Z]-\\d{4}:[\\p{L}\\s]+:\\d+(\\.\\d+)?")); //coregir
			isFormatCorrect ? System.out.println("El formato del fichero es correcto") : System.out.println("El formato del fichero no es correcto");
			
			boolean anyBlankLine = Files.lines(ficheroProductos)
					.allMatch(line -> !line.isEmpty());
			anyBlankLine ? System.out.println("No existen líneas blancas en el fichero") : System.out.println("Existen líneas vacías en el fichero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	public LinkedList<Cesta> getColaCestas() {
		return colaCestas;
	}

	public void setColaCestas(LinkedList<Cesta> colaCestas) {
		this.colaCestas = colaCestas;
	}

	public HashMap<String, Producto> getMapaProductos() {
		return mapaProductos;
	}

	public void setMapaProductos(HashMap<String, Producto> mapaProductos) {
		this.mapaProductos = mapaProductos;
	}
}
