package Abstrac;

public class Triangulo extends FiguraGeometrica {
     private int valor2;

	public Triangulo(int valor1, int valor2) {
		super(valor1);
		this.valor2 = valor2;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	@Override
	public String toString() {
		return "Triangulo [valor2=" + valor2 + "]";
	}



    
    
}
