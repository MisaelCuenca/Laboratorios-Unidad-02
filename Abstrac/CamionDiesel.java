package Abstrac;

public class CamionDiesel extends Vehiculo {

	
	public CamionDiesel(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public void mover() {
        System.out.println("Funcionando con motor diésel...");
    }
}
