package banco.exceptions;

@SuppressWarnings("serial")
public class SaldoException extends Exception{
	public SaldoException() { 
		super();
	}
	public SaldoException(String mensaje) {
		super(mensaje);
	}
}
//comentario