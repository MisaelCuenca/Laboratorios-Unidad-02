package My_proyect.My_proyect_M;

public class Gerente extends Empleado {
    Gerente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    double calcularSalario() {
        return salarioBase + 1000;
    }
}
