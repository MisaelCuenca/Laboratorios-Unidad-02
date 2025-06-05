package My_proyect_peage;

import java.util.Vector;

public class Peaje {
	String nombre;
	String departamento;
	int totalPeaje=0;
	int totalCamiones =0;
	int totalMotos=0;
	int totalCarro=0;
	//identoficar vehiculos
	Vector<Vehiculo> vehiculos;
	public Peaje (String nombre,String departamento ,Vector<Vehiculo> vehiculos ) {
		this.nombre=nombre;
		this.departamento=departamento;
		
		this.vehiculos = new Vector<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void addVehiculo (Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
	public int calcularPeaje (Vehiculo vehiculo){

		if  (vehiculo instanceof Carro ) {
			totalCarro++;
			totalPeaje+=Carro.valorPeaje;
			return Carro.valorPeaje;
		}else if (vehiculo instanceof Moto) {
			totalMotos++;
			totalPeaje+=Moto.ValorPeaje;
			return Moto.ValorPeaje;
			
		}
		else if (vehiculo instanceof Camion) {
			totalCamiones++;
			Camion camion =(Camion)vehiculo;//cast
			totalPeaje+=camion.valorPeajeEje;
			
			
			totalPeaje += camion.numeroEjes *Camion.getValorPeajeEje();
			return  camion.numeroEjes *Camion.getValorPeajeEje();
		}else return -1;
	
		
			
	}
	public void imprimir () {
		System.out.println("Peaje:"+ getNombre());
		System.out.println("Ubicacion"+getDepartamento());
		System.out.println("total Carro"+ totalCarro);
		System.out.println("total motos"+ totalMotos);
		System.out.println("total Camion"+ totalCamiones);
		System.out.println("total Carro"+ totalCarro);
		int totalVehiculos = totalCarro + totalMotos +totalCamiones;
		System.out.println("totalvehiculos"+totalVehiculos);
		System.out.println("DineroTotal"+totalPeaje);
	}
	

}
