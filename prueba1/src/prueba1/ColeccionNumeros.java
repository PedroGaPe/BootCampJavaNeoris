package prueba1;

import java.util.ArrayList;
import java.util.Scanner;
public class ColeccionNumeros {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una serie de números");
		String aux;
		while(!(aux = teclado.nextLine()).isEmpty()) {
			
				lista.add(Integer.parseInt(aux));
		}
		for(int num : lista) {
			System.out.println("Cuadrado de "+num+" igual a "+num*num);
		}

	}

}
