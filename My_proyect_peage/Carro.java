package My_proyect_peage;

public class Carro  extends Vehiculo{

	 static int valorPeaje = 10000;
	 
	public Carro(String placa) {
		super(placa);
	}
	public  int getValorpeaje() {
		return valorPeaje;
	}
	
	public static void setValorPeaje (int valorPeaje) {
		Carro.valorPeaje = valorPeaje;
	}
      
	
	void imprimir() {
		System.out.println("placa"+placa);
		System.out.println("Valor peaje"+valorPeaje);
	}
}
