package banco;

import java.time.LocalDate;

public class Debito extends Tarjeta { 

	public Debito(String mNumero, String mTitular, LocalDate mFechaCaducidad) {
		super(mNumero, mTitular, mFechaCaducidad);
	}
	//comentario


	@Override
	public void ingresar(double x) throws Exception {
		this.mCuentaAsociada.ingresar(x, "Ingreso en cajero automático");

	}

	@Override
	public void pagoEnEstablecimiento(String datos, double x) throws Exception{
		this.mCuentaAsociada.retirar(x,"Compras en: "+datos);
	}

	@Override
	public void retirar(double x) throws Exception {
		this.mCuentaAsociada.retirar(x, "Retirada en cajero automático");
	}

}
