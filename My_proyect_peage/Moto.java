package My_proyect_peage;

public class Moto extends Vehiculo {
static int ValorPeaje =5000;

public Moto(String placa) {
	super(placa);
}

public static int getValorPeaje() {
	return ValorPeaje;
}

public static void setValorPeaje(int valorPeaje) {
	ValorPeaje = valorPeaje;
}
//imprimir
void imprimir () {
	System.out.println("placa"+placa);
	System.out.println("Valor Peaje"+ ValorPeaje);
}

}
