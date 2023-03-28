package prueba1;

import java.util.ArrayList;

public class Baraja {
	ArrayList<String> baraja;
	public Baraja() {
		baraja = new ArrayList<String>();
		
	}
	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		baraja.cargarBaraja();
		for(String carta: baraja.getBaraja()) {
			System.out.println(carta);
		}
	}

	public ArrayList<String> getBaraja(){
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
