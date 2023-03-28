package prueba1;

public class MultiplosCinco {
	public static void main(String[] args) {
		int multiplos = 10;
		int de = 5;
		int total = 0;
		for (int i = 1; i<=multiplos;i++) {
			System.out.println(i*de+" es multiplo de "+de);
			total += i*de;
		}
		System.out.println("La suma de los 10 primeros multiplos de 5 es"+total);
	}
}
