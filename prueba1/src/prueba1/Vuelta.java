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
		
	}

}
