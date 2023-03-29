package banco;

import java.time.LocalDate;

public abstract class Tarjeta {
	protected Cuenta mCuentaAsociada;
	protected LocalDate mFechaCaducidad;
	protected String mNumero;
	protected String mTitular;
 //comentario
	public Tarjeta(String mNumero,String mTitular,LocalDate mFechaCaducidad) {
		this.mNumero = mNumero;
		this.mTitular = mTitular;
		this.mFechaCaducidad = mFechaCaducidad;
	}
	public void setCuenta(Cuenta mCuentaAsociada) {
		this.mCuentaAsociada=mCuentaAsociada;
	}
	public double getSaldo() {
		return this.mCuentaAsociada.getSaldo();
	}
	public abstract void ingresar(double x) throws Exception;
	public abstract void pagoEnEstablecimiento(String datos, double x) throws Exception;
	public abstract void retirar(double x) throws Exception;

}
