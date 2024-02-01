package centroCultural;

public class CentroCultural {

	private Cliente[] listaClientes = new Cliente[5];// ????????????????

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
	public void altaCliente(UsuarioCentroCultural user) {
		System.out.println(user.inputAltaCliente().toString());

	}

	public void altaDisco(){
		MaterialAGuardar nuevoDisco = new Disco();
		nuevoDisco.inputAltaMaterial();
		asignarLocalizacionMaterial(nuevoDisco);
		nuevoDisco.asignarCodigoMaterial();
	}
	
	public void altaLibro() {
		
	}
//	public void altaMaterial(UsuarioCentroCultural user) {
//
//		MaterialAGuardar temp = new MaterialAGuardar();
//		temp = user.inputAltaMateriales();
//		asignarCodigoMaterial(temp);
//		asignarLocalizacionMaterial(temp);
//		asignarToString(temp);
//
//	}

	public void prestarMaterial(UsuarioCentroCultural user) {
		mostrarMateriales();
		realizarPrestamo(user.introducirDNI(), user.introducirCodigoMaterial());
	}

	public void consultarPrestamo() {

	}

	public void compararLibros(UsuarioCentroCultural user) {
		mostrarLibros();
		int libro1 = user.introducirCodigoLibroComparar();
		int libro2 = user.introducirCodigoLibroComparar();

		compararLibros(libro1, libro2);

	}

	public void verLocalizacionMaterial(UsuarioCentroCultural user) {
		mostrarMateriales();
		dondeColocarMaterial(user.introducirCodigoMaterial());
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
//		} else if (material instanceof Libro) {
//			for (int i = 0; i < almacenamientoMaterial.length; i++) {
//				if (almacenamientoMaterial[i] == null) {
//					almacenamientoMaterial[i] = (Libro) material;
//					material.localizacionEstanteria = 2;
//					material.localizacionAltura = i + 1;
//					break;
//				}
//			}
//		}
	}

	// ver donde colocar material
	public void dondeColocarMaterial(int codigoMaterial) {

		for (MaterialAGuardar estanterias[] : localizacion) {
			for (MaterialAGuardar objeto : estanterias) {
				if (objeto != null) {
					if (codigoMaterial == objeto.getNumId()) {
						asignarToString(objeto);
					}
				}
			}
		}
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
		this.almacenamientoMaterial[0] = generarLibro();
		asignarLocalizacionMaterial(this.almacenamientoMaterial[0]);
		this.almacenamientoMaterial[0].asignarCodigoMaterial();
		
		
		
		//Hacer con el resto de libros
		asignarLocalizacionMaterial(generarLibro());
		asignarLocalizacionMaterial(generarLibro());

		

	}



	private void mostrarMateriales() {
		mostrarLibros();
		mostrarDiscos();
	}

	private void mostrarLibros() {
		System.out.println("Lista de libros: \n");
		for (Libro libro : this.almacenamientoMaterial) {
			if (libro != null) {
				System.out.println(libro.toString());
			}
		}
		System.out.println();
	}

	private void mostrarDiscos() {
		System.out.println("Lista de discos: \n");
		for (Disco disco : this.almacenamientoMaterial) {
			if (disco != null) {
				System.out.println(disco.toString());
			}
		}
		System.out.println();
	}

	public void compararLibros(int libro1, int libro2) {
		Libro temp1 = new Libro();
		Libro temp2 = new Libro();

		for (int i = 0; i < almacenamientoMaterial.length; i++) {
			if (almacenamientoMaterial[i] != null) {
				if (almacenamientoMaterial[i].getNumId() == libro1) {
					temp1 = almacenamientoMaterial[i];
				} else if (almacenamientoMaterial[i].getNumId() == libro2) {
					temp2 = almacenamientoMaterial[i];
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
	}

	private void realizarPrestamo(String DNI, int idMaterial) {

		Cliente clientePeticion = new Cliente();

		for (Cliente c : listaClientes) { // Mala lógica
			if (c != null) {
				if (c.getDNI() == DNI) {
					clientePeticion = c;
				}
			} else {
				clientePeticion.setDNI(DNI);
				asignarClienteToLista(clientePeticion);
				break;
			}

		}

		MaterialAGuardar material = new MaterialAGuardar();

		for (MaterialAGuardar[] estanteria : localizacion) {
			for (MaterialAGuardar m : estanteria) {
				if (m != null) {
					if (idMaterial == m.numId) {
						material = m;
						break;
					}
				}
			}
		}
		crearPeticion(clientePeticion, material);
	}

	private void crearPeticion(Cliente c, MaterialAGuardar material) { // Arreglar
		for (int i = 0; i < c.getListaPeticiones().length; i++) {
			if (c.getListaPeticiones()[i] == null) {
				Peticion peticion = new Peticion();
				peticion.setFechaIniPrestamo("29-01-2024");

				if (material instanceof Disco) { // Arreglar que siempre sea el 0
					peticion.getPeticionDisco()[0] = (Disco) material;
					c.getListaPeticiones()[i].getPeticionDisco()[0] = peticion.getPeticionDisco()[0];
				} else if (material instanceof Libro) {
					peticion.getPeticionLibro()[0] = (Libro) material;
					c.getListaPeticiones()[i].getPeticionDisco()[0] = peticion.getPeticionDisco()[0];
				}
				break;
			} else {
				System.out.println("La lista de peticiones del cliente está llena");
			}
		}
	}

	private void asignarClienteToLista(Cliente c) { // Mala logica
		for (int i = 0; i < this.listaClientes.length; i++) {
			if (listaClientes[i] == null) {
				listaClientes[i] = c;
				break;
			}
		}
		System.out.println("Ampliar lista de clientes"); // Si no es posible arreglar
	}

	// Getters & Setters
	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}

	public Libro[] getAlmacenamientoLibros() {
		return almacenamientoMaterial;
	}

	public void setAlmacenamientoLibros(Libro[] almacenamientoLibros) {
		this.almacenamientoMaterial = almacenamientoLibros;
	}

	public Disco[] getAlmacenamientoDiscos() {
		return almacenamientoMaterial;
	}

	public void setAlmacenamientoDiscos(Disco[] almacenamientoDiscos) {
		this.almacenamientoMaterial = almacenamientoDiscos;
	}

}
