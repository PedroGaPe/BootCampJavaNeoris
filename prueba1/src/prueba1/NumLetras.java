package prueba1;

public class NumLetras {

	public static void main(String[] args) {
		int num = 72;
		String[] primerosNumeros = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve"};
		String[] stringDecenas = {"","","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
		int unidades = num%10;
		int decenas = num/10;
		if(num<20) {
			System.out.println(primerosNumeros[num]);
		}else {
			if(unidades == 0) {
				System.out.println(stringDecenas[decenas]);
			}
			else {
				System.out.println(stringDecenas[decenas]+" y "+primerosNumeros[unidades]);
			}
		}
	}

}
