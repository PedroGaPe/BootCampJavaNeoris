package banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import banco.exceptions.PositivoException;
import banco.exceptions.SaldoException;

public class Credito extends Tarjeta {
	private double mCredito; 
	private ArrayList<Movimiento> mMovimientos;

	public Credito(String mNumero, String mTitular, LocalDate mFechaCaducidad, double mCredito) {
		super(mNumero, mTitular, mFechaCaducidad);
		this.mCredito = mCredito;
		this.mMovimientos = new ArrayList<Movimiento>();
		// TODO Auto-generated constructor stub
	}
	//comentario68


	@Override
	public void ingresar(double x) throws Exception {
		if(x<0)
			throw new PositivoException("Importe negativo");
		Movimiento nMovimiento = new Movimiento();
		nMovimiento.setmImporte(x);
		nMovimiento.setmConcepto("Ingreso en cuenta asociada (cajero automático)");
		this.mMovimientos.add(nMovimiento);
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) throws Exception {
		if(x<0)
			throw new PositivoException("Importe negativo");
		if(this.getCreditoDisponible()<x)
			throw new SaldoException("Crédito Insuficiente");
		
		Movimiento nMovimiento = new Movimiento();
		nMovimiento.setmImporte(-x);
		nMovimiento.setmConcepto("Compra a crédito en: "+datos);
		mMovimientos.add(nMovimiento);	
		}

	@Override
	public void retirar(double x) throws Exception {
		if(x<0)
			throw new PositivoException("Importe negativo");
		if(this.getCreditoDisponible()<x)
			throw new SaldoException("Crédito Insuficiente");
		double comision = x*0.05;
		if(comision<3)
			comision = 3;
		Movimiento nMovimiento = new Movimiento();
		nMovimiento.setmImporte(-(x+comision));
		nMovimiento.setmConcepto("Retirada en cuenta asociada (cajero automático)");
		mMovimientos.add(nMovimiento);
	}
	public double getCreditoDisponible() {
		double temp = this.mCredito;
		for(Movimiento aux :mMovimientos) {
			temp += aux.getmImporte();
		}
		return temp;
	}
	public void liquidar(int mes, int anyo) {
		for(Iterator<Movimiento> it = mMovimientos.iterator();it.hasNext();) {
			Movimiento aux = it.next();
			if(anyo == aux.getmFecha().getYear()) {
				if(mes == aux.getmFecha().getMonthValue()) {
					this.mCuentaAsociada.addMovimiento(aux);
					it.remove();
				}
			}
			
		}
	}
	public void listarMovimiento() {
		System.out.println("-----Movimientos de crédito-----");
		for(Movimiento aux : mMovimientos) {
			System.out.println(aux.toString());
		}
	}

}
