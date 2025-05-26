package My_proyect.My_proyect_M;

public abstract class Ciclista {

	 private int identificador;
	private String nombre;
	private int tiempoAcumulado=0;
	
	
	public Ciclista(int identificador, String nombre, int tiempoAcumulado) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.tiempoAcumulado = tiempoAcumulado;
	}


	public int getIdentificador() {
		return identificador;
	}


	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTiempoAcumulado() {
		return tiempoAcumulado;
	}


	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}


	@Override
	public String toString() {
		return "Ciclista [identificador=" + identificador + ", nombre:" + nombre + ", tiempo Acumulado="
				+ tiempoAcumulado +" minutos"+ "]";
	}
	
	public abstract String imprimirTipo();

	
	
}
