package prueba1;

public class Datos {
	int dia;
	long nDni;
	float precio;
	final boolean ACTIVO = true;
	public Datos() {
		dia = 10;
		nDni = 57433222;
		precio = 135.12f;
		
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public long getnDni() {
		return nDni;
	}
	public void setnDni(long nDni) {
		this.nDni = nDni;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public boolean isACTIVO() {
		return ACTIVO;
	}
	
}
