package prueba1;

import java.time.LocalDate;

public class Fechas {
	private int dia;
	private int mes;
	private int anyo;
	
	public Fechas() {}
	public Fechas(int dia, int mes, int anyo) {
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}

	public static void main(String[] args) {
		Fechas fecha = new Fechas(32,8,2015);
		if(fecha.metodo1()) {
			System.out.println("Formato correcto usando metodo 1");
		}else {
			System.out.println("Formato incorrecto usando metodo 1");
		}
		if(fecha.metodo2()) {
			System.out.println("Formato correcto usando metodo 2");
		}else {
			System.out.println("Formato incorrecto usando metodo 2");
		}
		if(fecha.metodo3()) {
			System.out.println("Formato correcto usando metodo 3");
		}else {
			System.out.println("Formato incorrecto usando metodo 3");
		}
		if(fecha.metodo4()) {
			System.out.println("Formato correcto usando metodo 4");
		}else {
			System.out.println("Formato incorrecto usando metodo 4");
		}
	}
	public boolean metodo1() {
		if(dia>=1&&dia<=30) {
			if(mes>=1&&mes<=12) {
				if(anyo>=1500&&anyo<=2500) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean metodo2() {
		if(mes==1 || mes==3|| mes==5|| mes==7|| mes==8|| mes==10|| mes==12) {
			if(dia>=1&&dia<=31) {
				if(anyo>=1500&&anyo<=2500) {
					return true;
				}
			}
		}else if( mes==4|| mes==6|| mes==9|| mes==11) {
			if(dia>=1&&dia<=30) {
				if(anyo>=1500&&anyo<=2500) {
					return true;
				}
			}
		}else if(mes==2) {
			if(dia>=1&&dia<=28) {
				if(anyo>=1500&&anyo<=2500) {
					return true;
				}
			}
				
		}
		return false;
	}
	public boolean metodo3() {
		int[] diasMeses = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(mes>=1&&mes<=12) {
			if(dia>=1&&dia<=diasMeses[mes+1]) {
				if(anyo>=1500&&anyo<=2500) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean metodo4() {
		try {
			LocalDate aux = LocalDate.of(anyo, mes, dia);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
