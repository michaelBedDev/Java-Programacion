package ejemploThis;

public class Circulo {
	 private int coordenadaX;
	 private int coordenadaY;
	 private int radio;
	 
	 
	 //CONSTRUCTORES
	 Circulo() {}
	 Circulo (int x, int y, int radio) {
		 setRadio(radio);
		 setCoordenadaX(x);
		 setCoordenadaY(y); 
	 }
	 
	 
	//TO STRING
	public String toString() {
		return "Circulo [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", radio=" + radio + "]";
	}
	
	//METODO EL MAYOR
	Circulo elMayor(Circulo c) {
		Circulo copiaY = new Circulo(this.coordenadaX,this.coordenadaY, this.radio);
		Circulo copiaZ = new Circulo(c.coordenadaX, c.coordenadaY, c.radio);
		return this.radio>c.radio ? copiaY : copiaZ;
	}
	 

	//GETTERS AND SETTERS
	 public int getCoordenadaX() {
		return coordenadaX;
	}


	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}


	public int getCoordenadaY() {
		return coordenadaY;
	}


	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}


	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	} 
}
