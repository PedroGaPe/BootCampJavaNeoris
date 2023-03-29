package prueba1.genericos;

public class PruebaIntercambio {

	public static void main(String[] args) {
		Intercambio<String> texto = new Intercambio<String>("Miguel","Juan");
		Intercambio<Integer> numeros = new Intercambio<Integer>(3,4);
		
		System.out.println("Texto sin intercambio: "+texto.getObjA()+"\tNumero sin intercambio: "+numeros.getObjA());
		texto.invierte();
		numeros.invierte();
		System.out.println("Texto con intercambio: "+texto.getObjA()+"\tNumero con intercambio: "+numeros.getObjA());

	}

}
