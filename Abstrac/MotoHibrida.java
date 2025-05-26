package Abstrac;

public class MotoHibrida extends Vehiculo {
	public MotoHibrida(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public void mover() {
        System.out.println("Alternando entre motor y batería...");
    }
}
