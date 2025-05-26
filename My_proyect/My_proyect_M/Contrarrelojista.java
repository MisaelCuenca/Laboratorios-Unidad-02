package My_proyect.My_proyect_M;

public class Contrarrelojista extends Ciclista{

      double velocidadMax;

	public Contrarrelojista(int identificador, String nombre, int tiempoAcumulado, double velocidadMax) {
		super(identificador, nombre, tiempoAcumulado);
		this.velocidadMax = velocidadMax;
	}

	public double getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	@Override
	public String toString() {
		 return super.toString()+"\nContrarrelojista [velocidadMax=" + velocidadMax +"km/h"+ "]";
	}
	   public String imprimirTipo() {
	        return "Es un Contrarrelojista";
	    }

	
		
	
}
