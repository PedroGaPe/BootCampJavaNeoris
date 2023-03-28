package prueba1;

public class Comparacion {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if(a>b) {
			System.out.println("El valor a: "+a+" es mayor que el valor b: "+b);
		}else if(a<b) {
			System.out.println("El valor a: "+a+" es menor que el valor b: "+b);
		}
		else {
			System.out.println("El valor a: "+a+" es igual que el valor b: "+b);

		}
		if(a==0&&b==0) {
			System.out.println("No son múltiplos");
		}else {
			if(a%b==0||b%a==0) {
				System.out.println("Son múltiplos");
			}else {
				System.out.println("No son múltiplos");
			}
		}
	}

}
