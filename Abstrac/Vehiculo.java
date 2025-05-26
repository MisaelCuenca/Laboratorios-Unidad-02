package Abstrac;

public abstract class Vehiculo {
	protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void encender() {
        System.out.println(marca + " " + modelo + " encendido.");
    }

    public void apagar() {
        System.out.println(marca + " " + modelo + " apagado.");
    }

    public abstract void mover();

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio);
    }
}
