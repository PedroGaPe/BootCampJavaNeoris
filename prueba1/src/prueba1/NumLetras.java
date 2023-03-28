package prueba1;

public class NumLetras {

	public static void main(String[] args) {
		int num = 54;
		String[] primerosNumeros = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince"};
		String[] stringDecenas = {"dieci","veinti","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
		int unidades = num%10;
		int decenas = num/10;
		if(num<16) {
			System.out.println(primerosNumeros[num]);
		}else {
			if(unidades == 0) {
				System.out.println(stringDecenas[decenas]);
			}
			else if(decenas<3) {
				System.out.println(stringDecenas[decenas-1]+primerosNumeros[unidades]);
			}
			else {
				System.out.println(stringDecenas[decenas]+" y "+primerosNumeros[unidades]);
			}
		}
	}

}
