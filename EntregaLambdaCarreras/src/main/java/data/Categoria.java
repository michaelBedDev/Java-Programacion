
package data;

public enum Categoria {


	BENJAMIN(0,7),
	ALEVIN(8,10),
	INFANTIL(11,12),
	CADETE(13,14),
	JUVENIL(15,18),
	SENIOR(19,30);
	
	

	
	private Integer edadMinima;
	private Integer edadMaxima;
	
	private Categoria(Integer edadMinima, Integer edadMaxima) {
		this.edadMinima = edadMinima;
		this.edadMaxima = edadMaxima;
	}
	public Integer getEdadMinima() {
		return edadMinima;
	}
	public Integer getEdadMaxima() {
		return edadMaxima;
	}
	
	public static Categoria getCategoria(Integer edad) {
		
		if (edad < 0 || edad > 30) {
            edad = 30;
        }
		
		for(Categoria e : Categoria.values()) {
			if(edad >= e.getEdadMinima() && edad <= e.getEdadMaxima()) {
				return e;
			}
		}
		return SENIOR;
	}
}
