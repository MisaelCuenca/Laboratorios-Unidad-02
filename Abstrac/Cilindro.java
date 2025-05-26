package Abstrac;

public class Cilindro extends Circulo {
      int valor2;

	public Cilindro(int valor1, int valor2) {
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
		return "Cilindro [valor2=" + valor2 + "]";
	}
      
	
}
