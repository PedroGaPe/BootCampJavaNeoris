package prueba1;

public class Prueba1 {

	public static void main(String[] args) {
//		Datos nuevos = new Datos();
//		System.out.println("Dia\t"+nuevos.getDia());
//		System.out.println("Dni\t"+nuevos.getnDni());
//		System.out.println("Precio\t"+nuevos.getPrecio());
//		System.out.println("Activo\t"+nuevos.isACTIVO());
		LineaFactura lineaFactura = new LineaFactura(12,4,15.50);
		System.out.println("cantidad\t="+lineaFactura.getCantidad());
		System.out.println("unidades\t="+lineaFactura.getUnidades());
		System.out.println("precio\t="+lineaFactura.getPrecio());
		lineaFactura.calcularImporte();
		System.out.println("Importe ="+lineaFactura.getImporte());
		System.out.println("IVA ="+lineaFactura.getIVA());
		lineaFactura.calcularTotal();
		System.out.println("Total "+lineaFactura.getTotal()+"  deberia ser:"+lineaFactura.getTotalDecimal());
		Circulo circulo = new Circulo(23);
		System.out.println("Radio circulo = "+circulo.getRadio());
		System.out.println("Área circulo = "+circulo.dameArea());
		System.out.println("Perímetro circulo = "+circulo.damePerimetro());
	}

}
