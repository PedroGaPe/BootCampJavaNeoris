package prueba1;

public class LineaFactura {
	private int cantidad;
	private int unidades;
	private double precio;
	private double importe;
	private int total;
	
	public LineaFactura() {}
	public LineaFactura(int cantidad, int unidades, double precio) {
		this.cantidad = cantidad;
		this.unidades = unidades;
		this.precio = precio;
	}
	
	public void calcularImporte() {
		this.importe = cantidad*unidades*precio;
	}
	
	public void calcularTotal() {
		this.total = (int) ((int)this.importe*1.21);
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getImporte() {
		return importe;
	}

	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public int getTotal() {
		return total;
	}
	public double getTotalDecimal() {
		return precio*1.21;
	}
	public double getIVA() {
		return this.importe*0.21;
	}

}
