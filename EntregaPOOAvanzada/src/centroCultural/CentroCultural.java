package centroCultural;

public class CentroCultural {

	private Cliente[] listaClientes = new Cliente[5];
	
	private Libro[] almacenamientoLibros = new Libro[15];
	private Disco[] almacenamientoDiscos = new Disco[15];
	
	private MaterialAGuardar[][] localizacion = {almacenamientoLibros, almacenamientoDiscos};
	
	
//Constructores
	public CentroCultural() {
		//TODO Auto-generated constructor stub
	}
	
	public CentroCultural(Cliente[] listaClientes, Libro[] almacenamientoLibros, Disco[] almacenamientoDiscos) {
		super();
		this.listaClientes = listaClientes;
		this.almacenamientoLibros = almacenamientoLibros;
		this.almacenamientoDiscos = almacenamientoDiscos;
	}


	//Metodos
	public void altaCliente(UsuarioCentroCultural user) {
		System.out.println(user.inputAltaCliente().toString());
		
	}
	
	public void altaMaterial(UsuarioCentroCultural user) {
		asignarLocalizacionMaterial(user.inputAltaMateriales());
	}
	
	 public void prestarMaterial() {
		
	}
	 
	public void consultarPrestamo() {
		
	}
	
	public void compararLibros() {
		
	}
	
	private void asignarLocalizacionMaterial(MaterialAGuardar material) {
		if (material instanceof Disco) {
			for (int i = 0; i < almacenamientoDiscos.length; i++) {
				if (almacenamientoDiscos[i] != null) {
					almacenamientoDiscos[i] = (Disco) material;
					break;
				}
			}
		}
		if (material instanceof Libro) {
			for (int i = 0; i < almacenamientoLibros.length; i++) {
				if (almacenamientoLibros[i] != null) {
					almacenamientoLibros[i] = (Libro) material;
					break;
				}
			}
		}
	}

	//mostrar localizacion
	
//Getters & Setters
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
