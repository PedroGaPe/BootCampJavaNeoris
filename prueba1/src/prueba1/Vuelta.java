package prueba1;

public class Vuelta {

	public static void main(String[] args) {
		String entrada="";
		int ln = args.length;
		for(int i =0; i<ln;i++) {
			entrada+=args[i]+" ";
		}
		System.out.println("fase-1-"+entrada);
		
		int longuitud = entrada.length();
		System.out.print("fase-2-");
		for(int i = longuitud-1; i>=0;i--) {
			System.out.print(entrada.charAt(i));
		}
		System.out.println();
		String entradaInversa="";
		for (int i = longuitud-1; i>=0;i--) {
			entradaInversa+=entrada.charAt(i);
		}
		System.out.println("fase-3-"+entradaInversa);
		String entradaInversaNums="";
		for (int i= longuitud-1; i>=0;i--) {
			char aux = entrada.charAt(i);
			switch(aux) {
			case 'a':
				entradaInversaNums+=4;
				break;
			case 'e':
				entradaInversaNums+=3;
				break;
			case 'i':
				entradaInversaNums+=1;
				break;
			case 'o':
				entradaInversaNums+=0;
				break;
			case 'u':
				entradaInversaNums+=9;
				break;
			default:
				entradaInversaNums+=aux;
				break;
				
			}
		}
		System.out.println("fase-4-"+entradaInversaNums);
		
		char primero = entrada.charAt(0);
		int ultimo = entrada.lastIndexOf(primero);
		String entradaSinFin = "";
		for(int i = ultimo-1;i>=0;i--) {
			entradaSinFin += entrada.charAt(i);
		}
		System.out.println("fase-5-"+entradaSinFin);
		entrada += '&';
		int indice = 0;
		String entradaFinal = "";
		while(entrada.charAt(indice)!='&') {
			entradaFinal = entrada.charAt(indice++)+entradaFinal;
			
			
		}
		System.out.println("fase-6-"+entradaFinal);
	}

}
