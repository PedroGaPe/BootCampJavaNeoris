package prueba1;

public class Primos {
	
	public static void main(String[] args) {
		int cantidadPrimos=2;
		System.out.println("1 es primo");
		System.out.println("2 es primo");
		for(int i= 3; i<100;i++) {
			int cantidadDivisibles = 0;
			
			for(int j= 2; j<=(i/2); j++) {
				if(i%j==0) {
					cantidadDivisibles++;
				}
			}
			if(cantidadDivisibles==0) {
				System.out.println(i+" es primo");
				cantidadPrimos++;
			}
		}
		System.out.println("El número total de primos es "+cantidadPrimos);
		
		
		
	}

}
