package Abstrac;

import java.util.ArrayList;

public class AppVehiculos {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(new AutoElectrico("Tesla", "Model S", 2022));
        listaVehiculos.add(new MotoHibrida("Yamaha", "HybridX", 2021));
        listaVehiculos.add(new CamionDiesel("Volvo", "FH16", 2020));

        for (Vehiculo v : listaVehiculos) {
            v.mostrarInfo();
            v.encender();
            v.mover(); // Polimorfismo en acción
            v.apagar();
            System.out.println("----");
        }
    }
}
