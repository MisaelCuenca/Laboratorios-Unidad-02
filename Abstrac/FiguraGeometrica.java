package Abstrac;

public abstract class FiguraGeometrica  {
        private int valor1;

		public FiguraGeometrica(int valor1) {
			super();
			this.valor1 = valor1;
		}

		public int getValor1() {
			return valor1;
		}

		public void setValor1(int valor1) {
			this.valor1 = valor1;
		}

		@Override
		public String toString() {
			return "FiguraGeometrica [valor1=" + valor1 + "]";
		}

	

	
       
       
}
