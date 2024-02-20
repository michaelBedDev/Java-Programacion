package mapasEjercicio1;

public class Coordenadas {
	private String latitud;
	private String longitud;

	protected Coordenadas() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Coordenadas(String latitud, String longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Coordenadas [latitud=" + latitud + ", longitud=" + longitud + "]";
	}
}
