package prueba1;

public class Factorial {

	public static void main(String[] args) {
		int numero = 8;
		int factorial = numero;
		for(int i=numero-1; i>=1;i--) {
			factorial *=i;
		}
		System.out.println("El factorial de "+numero+" es igual a "+factorial);
	}

}
