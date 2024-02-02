package centroCultural;

public class CentroCultural {

	private Cliente[] listaClientes = new Cliente[10];

	private MaterialAGuardar[] almacenamientoMaterial = new MaterialAGuardar[30];


//Constructores
	public CentroCultural() {
		// TODO Auto-generated constructor stub
		asignarObjetosPorDefecto();
	}

	public CentroCultural(Cliente[] listaClientes, Libro[] almacenamientoLibros, Disco[] almacenamientoDiscos) {
		super();
		this.listaClientes = listaClientes;
		this.almacenamientoMaterial = almacenamientoLibros;
		this.almacenamientoMaterial = almacenamientoDiscos;
		asignarObjetosPorDefecto();
	}

	// Metodos
	public void altaCliente() {
		Cliente nuevoCliente = new Cliente();
		nuevoCliente.inputAltaCliente();
		asignarClienteToLista(nuevoCliente);
		nuevoCliente.mostrarDatos();
	}

	private void asignarClienteToLista(Cliente nuevoCliente) {
		for (int i = 0; i < listaClientes.length; i++) {
			if (listaClientes[i] == null) {
				listaClientes[i] = nuevoCliente;
			}
		}
	}

	public void altaDisco(){
		MaterialAGuardar nuevoDisco = new Disco();
		nuevoDisco.inputAltaMaterial();
		asignarLocalizacionMaterial(nuevoDisco);
		nuevoDisco.asignarCodigoMaterial();
		
		nuevoDisco.mostrarDatos();
	}
	
	public void altaLibro() {
		MaterialAGuardar nuevoLibro = new Libro();
		nuevoLibro.inputAltaMaterial();
		asignarLocalizacionMaterial(nuevoLibro);
		nuevoLibro.asignarCodigoMaterial();
		
		nuevoLibro.mostrarDatos();
	}
	
	public void prestarMaterial() {
		mostrarMateriales();
		String pedirDNI = "Introduce el DNI del cliente para el préstamo (00000000A)";
		String DNI = UsuarioCentroCultural.getInstance().pedirString(pedirDNI);
		
		String pedirNumIdMaterial = "Introduce el numId del material para prestar";
		int numId = UsuarioCentroCultural.getInstance().pedirNumero(pedirNumIdMaterial);
		
		realizarPrestamo(DNI,numId);
	}

	public void consultarPrestamo() {
		String pedirDNI = "Introduce el DNI del cliente para buscar el préstamo (00000000A)\nNo hay préstamo por defecto";
		String DNI = UsuarioCentroCultural.getInstance().pedirString(pedirDNI);
		Cliente temp = obtenerClientePorDNI(DNI);
		
		if (temp != null) {
			mostrarPrestamos(temp);
		} else {
			System.out.println("No ha sido posible encontrar el cliente con ese DNI\n");
		}
	}

	
	
	
	//realizar Prestamo
	private void realizarPrestamo(String DNI, int idMaterial) {
		
		boolean validoDNI = false; 
		boolean validoID = false;

		for (int i = 0; i < listaClientes.length; i++) {
			if (listaClientes[i] != null) {
				if (listaClientes[i].getDNI().equals(DNI)) {
					validoDNI = true;
				}
			}
		}
		
		for (int i = 0; i < almacenamientoMaterial.length; i++) {
			if (this.almacenamientoMaterial[i] != null) {
				if (almacenamientoMaterial[i].getNumId() == idMaterial) {
					validoID = true;
				}
			}
		}
		
		Cliente c = obtenerClientePorDNI(DNI);
		
		if ((validoDNI && validoID) && c != null) {
			asignarPeticionToCliente(c, idMaterial);
			System.out.println("La petición se ha procesado correctamente");
		} else {
			System.out.println("No se ha podido procesar la petición. Revisa los datos introducidos");
		}
	}	
	
	//asignar Peticion a cliente
	private void asignarPeticionToCliente(Cliente c, int idMaterial) {
		for (int i = 0; i < c.getListaPeticiones().length; i++) {
			if (c.getListaPeticiones()[i] == null) {
				Peticion nuevaPeticion = new Peticion();
				nuevaPeticion.setNumIdMaterial(idMaterial);
				
				java.util.Date hoy = new java.util.Date();
				nuevaPeticion.setFechaIniPrestamo(hoy);
				
				c.getListaPeticiones()[i] = nuevaPeticion;
				break;
			}
		}
	}
	
	// Método obtener cliente por DNI 
	private Cliente obtenerClientePorDNI(String DNI) {
	    for (int i = 0; i < listaClientes.length; i++) {
	        if (listaClientes[i] != null && listaClientes[i].getDNI().equals(DNI)) {
	            return listaClientes[i];
	        }
	    }
	    return null; 
	}
	
	//metodo consultarPrestamo
	private void mostrarPrestamos(Cliente c) {
		for (Peticion p : c.getListaPeticiones()) {
			if (p != null) {
				p.mostrarDatos();
			}
		}
	}
	
	
	
	
	//introducir libros a comparar
	public void introducirLibrosToComparar() {
		mostrarMateriales();
		
		String input = "Introduce el numId de los libros a comparar";
		int libro1 = UsuarioCentroCultural.getInstance().pedirNumero(input);
		int libro2 = UsuarioCentroCultural.getInstance().pedirNumero(input);

		compararLibros(libro1, libro2);

	}

	// asignar localizacion a material
	private void asignarLocalizacionMaterial(MaterialAGuardar material) {
		if (material instanceof Disco) {
			material.localizacionEstanteria = 1;
		} else {
			material.localizacionEstanteria = 2;
		}
		for (int i = 0; i < almacenamientoMaterial.length; i++) {
			if (almacenamientoMaterial[i] == null) {
				almacenamientoMaterial[i] = material;
				material.localizacionAltura = i + 1;
				break;
			}
		}
	}


	//metodo mostrarMateriales
	public void mostrarMateriales() {
		System.out.println("Lista de materiales: \n");
		for (MaterialAGuardar m : this.almacenamientoMaterial) {
			if (m != null) {
				m.mostrarDatos();
			}
		}
		System.out.println();
	}




	// cliente por defecto
	private Cliente generarCliente() {
		Cliente defaultCliente = new Cliente("ClientePorDefecto", "00000000A", new Peticion[6]);
		return defaultCliente;
	}

	// disco por defecto
	private Disco generarDisco() {
		Disco discoDefault = new Disco("info", "titulo", "autor", "discografica");
		return discoDefault;
	}

	// libro por defecto
	private Libro generarLibro() {
		Libro libroDefault = new Libro("info", "titulo", "autor", 999);
		return libroDefault;
	}

	// asignar objetos por defecto
	private void asignarObjetosPorDefecto() {
		this.listaClientes[0] = generarCliente();
		
		//libro por defecto
		MaterialAGuardar libroDefault = generarLibro();
		asignarLocalizacionMaterial(libroDefault);
		libroDefault.asignarCodigoMaterial();
		
		//disco por defecto
		MaterialAGuardar discoDefault = generarDisco();
		asignarLocalizacionMaterial(discoDefault);
		discoDefault.asignarCodigoMaterial();
		
		//otro libro por defecto
		MaterialAGuardar libroDefault2 = generarLibro();
		asignarLocalizacionMaterial(libroDefault2);
		libroDefault2.asignarCodigoMaterial();
	}

	
	//metodo comparar libros
	public void compararLibros(int libro1, int libro2) {
		Libro temp1 = new Libro();
		Libro temp2 = new Libro();

		for (int i = 0; i < almacenamientoMaterial.length; i++) {
			if (almacenamientoMaterial[i] != null) {
				if (almacenamientoMaterial[i] instanceof Libro) {
					if (almacenamientoMaterial[i].getNumId() == libro1) {
						temp1 = (Libro) almacenamientoMaterial[i];
					} else if (almacenamientoMaterial[i].getNumId() == libro2) {
						temp2 = (Libro) almacenamientoMaterial[i];
					}
				} 
				
			}

		}

		if (temp1.getNumId() == 0 || temp2.getNumId() == 0) {
			System.out.println("Los códigos introducidos no son correctos, por favor introdúcelos nuevamente");
		} else {
			compararLibrosEquals(temp1, temp2);
		}

	}

	private void compararLibrosEquals(Libro temp1, Libro temp2) {
		System.out.println(temp1.equals(temp2) ? "Son el mismo libro" : "No son el mismo libro");
		System.out.println();
	}

	// Getters & Setters
	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}

	public MaterialAGuardar[] getAlmacenamientoLibros() {
		return almacenamientoMaterial;
	}

	public void setAlmacenamientoLibros(Libro[] almacenamientoLibros) {
		this.almacenamientoMaterial = almacenamientoLibros;
	}

	public MaterialAGuardar[] getAlmacenamientoDiscos() {
		return almacenamientoMaterial;
	}

	public void setAlmacenamientoDiscos(Disco[] almacenamientoDiscos) {
		this.almacenamientoMaterial = almacenamientoDiscos;
	}

}
