package prueba1;

public class MultiplosCinco {
	public static void main(String[] args) {
		int multiplos = 10;
		int total = 0;
		for (int i = 1; i<=multiplos;i++) {
			System.out.println(i*5+" es multiplo de 5");
			total += i*5;
		}
		System.out.println("La suma de los 10 primeros multiplos de 5 es"+total);
	}
}
