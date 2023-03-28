package prueba1;

public class Circulo {
	private int radio;
	
	public Circulo(int radio) {
		this.radio = radio;
	}
	public double dameArea() {
		return ((this.radio*this.radio)*Math.PI);
	}
	public double damePerimetro() {
		return (this.radio*2*Math.PI);
	}
	public int getRadio() {
		return this.radio;
	}
}
