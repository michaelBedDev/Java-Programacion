package centroCultural;

public class CentroCultural implements plantillas.IClasePrincipal {

	private Cliente[] listaClientes = new Cliente[5];// ????????????????

	private Libro[] almacenamientoLibros = new Libro[15];
	private Disco[] almacenamientoDiscos = new Disco[15];

	private MaterialAGuardar[][] localizacion = { almacenamientoLibros, almacenamientoDiscos };

//Constructores
	public CentroCultural() {
		// TODO Auto-generated constructor stub
		asignarObjetosPorDefecto();
	}

	public CentroCultural(Cliente[] listaClientes, Libro[] almacenamientoLibros, Disco[] almacenamientoDiscos) {
		super();
		this.listaClientes = listaClientes;
		this.almacenamientoLibros = almacenamientoLibros;
		this.almacenamientoDiscos = almacenamientoDiscos;
		asignarObjetosPorDefecto();
	}

	// Metodos
	public void altaCliente(UsuarioCentroCultural user) {
		System.out.println(user.inputAltaCliente().toString());

	}

	public void altaMaterial(UsuarioCentroCultural user) {

		MaterialAGuardar temp = new MaterialAGuardar();
		temp = user.inputAltaMateriales();
		asignarCodigoMaterial(temp);
		asignarLocalizacionMaterial(temp);
		asignarToString(temp);

	}

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
			for (int i = 0; i < almacenamientoDiscos.length; i++) {
				if (almacenamientoDiscos[i] == null) {
					almacenamientoDiscos[i] = (Disco) material;
					material.localizacionEstanteria = 1;
					material.localizacionAltura = i + 1;
					break;
				}
			}
		} else if (material instanceof Libro) {
			for (int i = 0; i < almacenamientoLibros.length; i++) {
				if (almacenamientoLibros[i] == null) {
					almacenamientoLibros[i] = (Libro) material;
					material.localizacionEstanteria = 2;
					material.localizacionAltura = i + 1;
					break;
				}
			}
		}
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

	// asignarCodigoMaterial
	private MaterialAGuardar asignarCodigoMaterial(MaterialAGuardar material) {
		java.util.Random rand = new java.util.Random();
		material.setNumId((int) (rand.nextInt(999) / (material.getLocalizacionEstanteria() + 1)
				- (material.getLocalizacionAltura() + 1)));
		return material;
	}

	// asignarToString a material
	private void asignarToString(MaterialAGuardar material) {
		if (material instanceof Disco) {
			material = (Disco) material;
			System.out.println(material.toString());
		} else if (material instanceof Libro) {
			material = (Libro) material;
			System.out.println(material.toString());
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
		asignarLocalizacionMaterial(generarDisco());
		asignarLocalizacionMaterial(generarLibro());
		asignarLocalizacionMaterial(generarLibro());

		asignarCodigoMaterial(this.almacenamientoDiscos[0]);
		asignarCodigoMaterial(this.almacenamientoLibros[0]);
		asignarCodigoMaterial(this.almacenamientoLibros[1]);

	}

	private void mostrarMateriales() {
		mostrarLibros();
		mostrarDiscos();
	}

	private void mostrarLibros() {
		System.out.println("Lista de libros: \n");
		for (Libro libro : this.almacenamientoLibros) {
			if (libro != null) {
				System.out.println(libro.toString());
			}
		}
		System.out.println();
	}

	private void mostrarDiscos() {
		System.out.println("Lista de discos: \n");
		for (Disco disco : this.almacenamientoDiscos) {
			if (disco != null) {
				System.out.println(disco.toString());
			}
		}
		System.out.println();
	}

	public void compararLibros(int libro1, int libro2) {
		Libro temp1 = new Libro();
		Libro temp2 = new Libro();

		for (int i = 0; i < almacenamientoLibros.length; i++) {
			if (almacenamientoLibros[i] != null) {
				if (almacenamientoLibros[i].getNumId() == libro1) {
					temp1 = almacenamientoLibros[i];
				} else if (almacenamientoLibros[i].getNumId() == libro2) {
					temp2 = almacenamientoLibros[i];
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

		for (Cliente c : listaClientes) {
			if (c != null) {
				if (c.getDNI() == DNI) {
					clientePeticion = c;
				} else {
					clientePeticion.setDNI(DNI);
					asignarClienteToLista(clientePeticion);
				}
			}
		}

		MaterialAGuardar material = new MaterialAGuardar();

		for (MaterialAGuardar[] estanteria : localizacion) {
			for (MaterialAGuardar m : estanteria) {
				if (m != null) {
					if (idMaterial == m.numId) {
						material = m;
					} else {
						System.out.println("No hemos encontrado un disco o libro con ese numID");
						break;
					}
				}

			}
		}

		crearPeticion(clientePeticion, material);
	}

	private void crearPeticion(Cliente c, MaterialAGuardar material) {
		for (int i = 0; i < c.getListaPeticiones().length; i++) {
			if (c.getListaPeticiones()[i] == null) {
				Peticion peticion = new Peticion();
				peticion.setFechaIniPrestamo("29-01-2024");

				if (material instanceof Disco) {

					peticion.getPeticionDisco()[0] = (Disco) material;

				} else if (material instanceof Libro) {

					peticion.getPeticionLibro()[0] = (Libro) material;

				} else {
					System.out.println("La lista de peticiones del cliente está llena");
				}
				break;

			}
		}

	}

	private void asignarClienteToLista(Cliente c) {
		for (int i = 0; i < this.listaClientes.length; i++) {
			if (listaClientes[i] == null) {
				listaClientes[i] = c;
			} else {
				System.out.println("Ampliar lista de clientes");
			}
		}
	}

	// Getters & Setters
	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}

	public Libro[] getAlmacenamientoLibros() {
		return almacenamientoLibros;
	}

	public void setAlmacenamientoLibros(Libro[] almacenamientoLibros) {
		this.almacenamientoLibros = almacenamientoLibros;
	}

	public Disco[] getAlmacenamientoDiscos() {
		return almacenamientoDiscos;
	}

	public void setAlmacenamientoDiscos(Disco[] almacenamientoDiscos) {
		this.almacenamientoDiscos = almacenamientoDiscos;
	}

}
