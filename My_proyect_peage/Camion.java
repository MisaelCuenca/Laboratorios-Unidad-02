package My_proyect_peage;

public class Camion extends Vehiculo {
   static int valorPeajeEje = 5000;
  
   int numeroEjes;
   



public Camion(String placa, int numeroEjes) {
	super(placa);
	this.numeroEjes = numeroEjes;
}

public static int getValorPeajeEje() {
	return valorPeajeEje;
}
public static void setValorPeajeEje(int valorPeajeEje) {
	Camion.valorPeajeEje = valorPeajeEje;
}

public int getNumeroEjes() {
	return numeroEjes;
}

public void setNumeroEjes(int numeroEjes) {
	this.numeroEjes = numeroEjes;
}

void imprimir () {
	 System.out.println("placa"+placa);
		System.out.println("Numero de ejes "+ numeroEjes);
		System.out.println("Valor Peaje"+ valorPeajeEje);
 }
}
