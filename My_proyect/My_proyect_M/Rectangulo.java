package My_proyect.My_proyect_M;

public class Rectangulo extends Figura {

	
	double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    double calcularArea() {
        return ancho * alto;
    }
}
