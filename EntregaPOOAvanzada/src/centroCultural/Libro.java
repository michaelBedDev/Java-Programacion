package centroCultural;

public class Libro extends MaterialAGuardar {

	private int numPaginas;

//	Constructor
	public Libro() {
		super();
	}

	public Libro(String infoGeneral, String titulo, String autor, int numPaginas) {
		super(infoGeneral, titulo, autor);
		this.numPaginas = numPaginas;
	}

	// libro toString
	@Override
	public void mostrarDatos() {
		String info = "El libro: " + titulo + " con autor: " + autor + " y con número de páginas: " + numPaginas
				+ " se le ha asignado el código " + numId + " y deberá colocarse en la estantería "
				+ localizacionEstanteria + " y en la altura " + localizacionAltura;

		System.out.println(info);
	}

	// metodo comparar libros
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		return (this.getTitulo() == ((Libro) obj).getTitulo())
				&& (this.getNumPaginas() == ((Libro) obj).getNumPaginas());
	}

	// metodo polimorfico
	@Override
	protected void pedirMaterialEspecifico() {
		String nombreDiscografica = "Introduce el numero de paginas";
		this.setNumPaginas(UsuarioCentroCultural.getInstance().pedirNumero(nombreDiscografica)); // INT
		return;

	}

// Getters & Setters
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
}
