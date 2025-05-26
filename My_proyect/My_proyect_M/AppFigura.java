package My_proyect.My_proyect_M;

public class AppFigura {
	   public static void main(String[] args) {
	        Figura circulo = new Circulo(5);
	        Figura rectangulo = new Rectangulo(4, 3);

	        System.out.println("Área del círculo: " + circulo.calcularArea());
	        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
	    }
}
