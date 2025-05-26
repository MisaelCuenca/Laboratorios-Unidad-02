package My_proyect.My_proyect_M;

public class Velocista extends Ciclista {

	double potencia;
	double veloPromedioSprint;
	
	
	
	public Velocista(int identificador, String nombre, int tiempoAcumulado, double potencia,
			double veloPromedioSprint) {
		super(identificador, nombre, tiempoAcumulado);
		this.potencia = potencia;
		this.veloPromedioSprint = veloPromedioSprint;
	}



	public double getPotencia() {
		return potencia;
	}



	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}



	public double getVeloPromedioSprint() {
		return veloPromedioSprint;
	}



	public void setVeloPromedioSprint(double veloPromedioSprint) {
		this.veloPromedioSprint = veloPromedioSprint;
	}



	@Override
	public String toString() {
		return
		super.toString()+ "\nVelocista [potencia promedio = "  + potencia +"W"
				+ ", Velocidad Promedio en Sprint=" + veloPromedioSprint + "Km/h"+"]";
	}
	
	   public String imprimirTipo() {
	        return "Es un velocista";
	    }
	
	
}
