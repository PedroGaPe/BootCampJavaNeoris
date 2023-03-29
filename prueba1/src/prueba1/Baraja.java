package prueba1;

import java.util.TreeSet;

public class Baraja {
	TreeSet<String> baraja;
	public Baraja() {
		baraja = new TreeSet<String>();
		
	}
	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		baraja.cargarBaraja();
		for(String carta: baraja.getBaraja()) {
			System.out.println(carta);
		}
	}

	public TreeSet<String> getBaraja(){
		return baraja;
	}
	public void cargarBaraja() {
		String[] palos = {"oros","copas","bastos","espadas"};
		for(int i = 0; i<4;i++) {
			for (int j=1;j<=12;j++) {
				baraja.add(j+" "+palos[i]);
			}
		}
	}

}
