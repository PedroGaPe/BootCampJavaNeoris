package prueba1;

public class DibujarCuadrado {

	public static void main(String[] args) {
		int size = 8;
		
		for(int i=1; i<=size;i++) {
			for(int j=1; j<=size;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
