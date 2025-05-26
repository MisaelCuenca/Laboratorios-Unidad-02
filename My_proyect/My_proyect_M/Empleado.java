package My_proyect.My_proyect_M;

public abstract class Empleado {
	String nombre;
    double salarioBase;

    Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();

    void mostrarInfo() {
        System.out.println(nombre + " gana $" + calcularSalario());
    }
}
