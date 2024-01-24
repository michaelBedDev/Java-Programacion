package centroCultural;

public class CentroCultural {

	private Cliente[] listaClientes = new Cliente[5];
	
	private Libro[] almacenamientoLibros = new Libro[15];
	private Disco[] almacenamientoDiscos = new Disco[15];
	
	
	
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
	public void altaCliente() {
		
	}
	
	public void altaMaterial() {
		
	}
	
	 public void prestarMaterial() {
		
	}
	 
	public void consultarPrestamo() {
		
	}
	
	public void compararLibros() {
		
	}

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
