package prueba1.genericos;

public class Intercambio<T> {
	private T objA;
	private T objB;
	
	public Intercambio(){
		
	}
	public Intercambio(T a, T b) {
		this.objA = a;
		this.objB = b;
	}
	public void invierte() {
		T temp = getObjA();
		setObjA(getObjB());
		setObjB(temp);
	}
	public T getObjA() {
		return objA;
	}
	public void setObjA(T objA) {
		this.objA = objA;
	}
	public T getObjB() {
		return objB;
	}
	public void setObjB(T objB) {
		this.objB = objB;
	}
	

}
