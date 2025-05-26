package My_proyect.My_proyect_M;

public class Ingeniero  extends Empleado{
	Ingeniero(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    double calcularSalario() {
        return salarioBase + 500;
    }   
}
