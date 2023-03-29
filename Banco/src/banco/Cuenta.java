package banco;

import java.util.ArrayList;

import banco.exceptions.*;

public class Cuenta { 
	private ArrayList<Movimiento> mMovimientos;
	private String mNumero;
	private String mTitular;
	//comentario
	public Cuenta(String mNumero, String mTitular) throws Exception{
		if(mNumero.equals("")||mTitular.equals(""))
			throw new VacioException("Campo vacio");
		this.mNumero = mNumero;
		this.mTitular = mTitular;
		this.mMovimientos = new ArrayList<Movimiento>();
	}
	public void addMovimiento(Movimiento nuevo) {
		this.mMovimientos.add(nuevo);
	}
	public void ingresar(double importe) throws Exception{
		if(importe<0)
			throw new PositivoException("Importe negativo");
		Movimiento nMovimiento = new Movimiento();
		nMovimiento.setmImporte(importe);
		nMovimiento.setmConcepto("");
	}
	public void ingresar(double importe, String concepto) throws Exception{
		if(importe<0)
			throw new PositivoException("Importe negativo");
		Movimiento nMovimiento = new Movimiento();
		nMovimiento.setmImporte(importe);
		nMovimiento.setmConcepto(concepto);
	}
	public void retirar(double importe) throws Exception{
		if(importe<0)
			throw new PositivoException("Importe negativo");
		if(this.getSaldo()<importe)
			throw new SaldoException("Saldo Insuficiente");
		Movimiento nMovimiento = new Movimiento();
		nMovimiento.setmImporte(-importe);
		nMovimiento.setmConcepto("");
	}
	public void retirar(double importe, String concepto) throws Exception{
		if(importe<0)
			throw new PositivoException("Importe negativo");
		Movimiento nMovimiento = new Movimiento();
		nMovimiento.setmImporte(-importe);
		nMovimiento.setmConcepto(concepto);	
		}
	public double getSaldo() {
		double temp=0;
		for(Movimiento uno: mMovimientos) {
			temp+=uno.getmImporte();
		}
		
		return temp;
	}
	public void listarMovimientos() {
		System.out.println("Cliente: "+mTitular);
		System.out.println("Número de cuenta "+mNumero);
		System.out.println("-----Movimientos de cuenta-----");
		for(Movimiento aux : mMovimientos) {
			System.out.println(aux.toString());
		}
	}
}
