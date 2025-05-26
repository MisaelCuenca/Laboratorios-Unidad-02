package My_proyect.My_proyect_M;

public class Escalador  extends Ciclista {

	float aceleracionSubida;
	double   gradoRampa;
	
	
	public Escalador(int identificador, String nombre, int tiempoAcumulado, float aceleracionSubida,
		
		double gradoRampa) {
		super(identificador, nombre, tiempoAcumulado);
		this.aceleracionSubida = aceleracionSubida;
		this.gradoRampa = gradoRampa;
	}


	public float getAceleracionSubida() {
		return aceleracionSubida;
	}


	public void setAceleracionSubida(float aceleracionSubida) {
		this.aceleracionSubida = aceleracionSubida;
	}


	public double getGradoRampa() {
		return gradoRampa;
	}


	public void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}


	@Override
	public String toString() {
		return super.toString()+ "\nEscalador [aceleracion promedio en Subida=" + aceleracionSubida +"m/s^2"+ ", Grado rampa soportada=" + gradoRampa +"Grados"+ "]";
	}
	
	   public String imprimirTipo() {
	        return "Es un escalador";
	    }
	
	
	
}
