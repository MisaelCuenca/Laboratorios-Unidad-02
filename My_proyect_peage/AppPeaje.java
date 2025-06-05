package My_proyect_peage;

public class AppPeaje {
	public static void main (String[]args) {
   Peaje peaje =new Peaje ("el ejido","Quito",null);
   
   Camion camion1= new Camion ("abcd123",2);
   peaje.addVehiculo(camion1);
   peaje.calcularPeaje(camion1);

   Camion camion2= new Camion ("fgh098",5);
   peaje.addVehiculo(camion2);
   peaje.calcularPeaje(camion2);
   
  
   
   Moto moto1= new Moto ("fgh098");
   peaje.addVehiculo(moto1);
   peaje.calcularPeaje(moto1);
   Moto moto2= new Moto ("fgh098");
   peaje.addVehiculo(moto2);
   peaje.calcularPeaje(moto2);
   
   Carro carro1= new Carro ("fgh098");
   peaje.addVehiculo(carro1);
   peaje.calcularPeaje(carro1);
   Carro carro2= new Carro ("fgh098");
   peaje.addVehiculo(carro2);
  peaje.calcularPeaje(carro2);
  
  peaje.imprimir();
}
}
