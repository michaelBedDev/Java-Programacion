package data;

public enum ENUM_AVANZADO {

	A(4, 9),
	B(10, 17);
	
	private Integer edadMinima;
	private Integer edadMaxima;
	private ENUM_AVANZADO(Integer edadMinima, Integer edadMaxima) {
		this.edadMinima = edadMinima;
	}
	public Integer getEdadMinima() {
		return edadMinima;
	}
	public Integer getEdadMaxima() {
		return edadMaxima;
	}
	
	public static ENUM_AVANZADO getCategoria(Integer edad) {
		for(ENUM_AVANZADO e : ENUM_AVANZADO.values()) {
			if(e.getEdadMinima()<= edad && e.getEdadMaxima()>edad) {
				return e;
			}
		}
		return 
	}
	
	
	
	
}
