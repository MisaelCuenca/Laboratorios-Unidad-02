package Abstrac;

public class AutoElectrico extends Vehiculo {
	 public AutoElectrico(String marca, String modelo, int anio) {
	        super(marca, modelo, anio);
	    }

	    @Override
	    public void mover() {
	        System.out.println("Moviéndose en modo eléctrico...");
	    }
}
