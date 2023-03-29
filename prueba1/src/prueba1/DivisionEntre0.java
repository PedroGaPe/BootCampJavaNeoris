package prueba1;

public class DivisionEntre0 {

	public static void main(String[] args) {
		int a = 0;
		int b = 300;
		try {
			int c = b/a;
		}catch(ArithmeticException ae) {
			System.out.println("Se ha producido un error");
		}finally {
			System.out.println("Programa finalizado");
		}
	}

}
