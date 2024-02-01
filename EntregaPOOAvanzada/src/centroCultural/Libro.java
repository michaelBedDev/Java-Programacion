package centroCultural;

public class Libro extends MaterialAGuardar {

	private int numPaginas;

//	Constructor
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libro(String infoGeneral, String titulo, String autor, int numPaginas) {
		super(infoGeneral, titulo, autor);
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		String info = "El libro: " + titulo + " con autor: " + autor + " y con número de páginas: " + numPaginas
				+ " se le ha asignado el código " + numId + " y deberá colocarse en la estantería "
				+ localizacionEstanteria + " y en la altura " + localizacionAltura;

		return info;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		return (this.getTitulo() == ((Libro) obj).getTitulo())
				&& (this.getNumPaginas() == ((Libro) obj).getNumPaginas());
	}
	
	
	

// Getters & Setters
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

}
