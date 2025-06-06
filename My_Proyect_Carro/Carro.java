package My_Proyect_Carro;

public class Carro {

	  private  Motor motor;
	  private  Carroceria carroceria;
	  private Llanta llanta;
	   private Chasis chasis;
	public Carro(Motor motor, Carroceria carroceria, Llanta llanta, Chasis chasis) {
		super();
		this.motor = motor;
		this.carroceria = carroceria;
		this.llanta = llanta;
		this.chasis = chasis;
	}

	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Carroceria getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}
	public Llanta getLlanta() {
		return llanta;
	}
	public void setLlanta(Llanta llanta) {
		this.llanta = llanta;
	}
	public Chasis getChasis() {
		return chasis;
	}
	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}
	   
	   
	void imprimir () {
		 System.out.println("Motor"+ motor);
		System.out.println("Carroceria "+ carroceria);
		System.out.println("Llanta"+ llanta);
		System.out.println("Chasis"+ chasis);
		
	 }

	@Override
	public String toString() {
		return "Carro [motor=" + motor + ", carroceria=" + carroceria + ", llanta=" + llanta + ", chasis=" + chasis
				+ "]";
	}
	
}
