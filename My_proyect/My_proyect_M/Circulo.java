package My_proyect.My_proyect_M;

public class Circulo  extends Figura{
	  double radio;

	    public Circulo(double radio) {
	        this.radio = radio;
	    }

	    @Override
	    double calcularArea() {
	        return Math.PI * radio * radio;
	    }

}
