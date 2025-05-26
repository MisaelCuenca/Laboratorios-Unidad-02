package My_proyect.My_proyect_M;

public class AppEmpleado {

	
	   public static void main(String[] args) {
	        Empleado ing = new Ingeniero("Pepito", 3000);
	        Empleado ger = new Gerente("Misael", 4000);

	        ing.mostrarInfo();  // Ana gana $3500
	        ger.mostrarInfo();  // Luis gana $5000
	    }
}
