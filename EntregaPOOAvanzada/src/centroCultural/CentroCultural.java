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
//		mostrarMateriales();
//		realizarPrestamo
	}

	public void consultarPrestamo() {

	}

	public void compararLibros(UsuarioCentroCultural user) {
		mostrarMateriales();
		int libro1 = user.introducirCodigoLibroComparar();
		int libro2 = user.introducirCodigoLibroComparar();

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

//	private void realizarPrestamo(String DNI, int idMaterial) {
//
//		Cliente clientePeticion = new Cliente();
//
//		for (Cliente c : listaClientes) { // Mala lógica
//			if (c != null) {
//				if (c.getDNI() == DNI) {
//					clientePeticion = c;
//				}
//			} else {
//				clientePeticion.setDNI(DNI);
//				asignarClienteToLista(clientePeticion);
//				break;
//			}
//
//		}
//
//		MaterialAGuardar material = new MaterialAGuardar();
//
//		for (MaterialAGuardar[] estanteria : localizacion) {
//			for (MaterialAGuardar m : estanteria) {
//				if (m != null) {
//					if (idMaterial == m.numId) {
//						material = m;
//						break;
//					}
//				}
//			}
//		}
//		crearPeticion(clientePeticion, material);
//	}

//	private void crearPeticion(Cliente c, MaterialAGuardar material) { // Arreglar
//		for (int i = 0; i < c.getListaPeticiones().length; i++) {
//			if (c.getListaPeticiones()[i] == null) {
//				Peticion peticion = new Peticion();
//				peticion.setFechaIniPrestamo("29-01-2024");
//
//				if (material instanceof Disco) { // Arreglar que siempre sea el 0
//					peticion.getPeticionDisco()[0] = (Disco) material;
//					c.getListaPeticiones()[i].getPeticionDisco()[0] = peticion.getPeticionDisco()[0];
//				} else if (material instanceof Libro) {
//					peticion.getPeticionLibro()[0] = (Libro) material;
//					c.getListaPeticiones()[i].getPeticionDisco()[0] = peticion.getPeticionDisco()[0];
//				}
//				break;
//			} else {
//				System.out.println("La lista de peticiones del cliente está llena");
//			}
//		}
//	}

//	private void asignarClienteToLista(Cliente c) { // Mala logica
//		for (int i = 0; i < this.listaClientes.length; i++) {
//			if (listaClientes[i] == null) {
//				listaClientes[i] = c;
//				break;
//			}
//		}
//		System.out.println("Ampliar lista de clientes"); // Si no es posible arreglar
//	}

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
