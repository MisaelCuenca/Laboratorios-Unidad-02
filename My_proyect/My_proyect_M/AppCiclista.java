package My_proyect.My_proyect_M;

import java.util.Scanner;

public class AppCiclista {

	public static void main(String[] args) {
        Equipo equipo = new Equipo("Ciclismo EPN", "Ecuador");

        Velocista velocista = new Velocista(12, "12.Misael", 450, 60, 29.4);
        Escalador escalador = new Escalador(24, "24.Estiven",29, 3.2f, 15f);
        Contrarrelojista contrareloj = new Contrarrelojista(34, "34.Jhonatan", 20, 65.5);

        velocista.setTiempoAcumulado(120);
        escalador.setTiempoAcumulado(135);
        contrareloj.setTiempoAcumulado(110);

        equipo.añadirCiclista(velocista);
        equipo.añadirCiclista(escalador);
        equipo.añadirCiclista(contrareloj);

        equipo.imprimirEquipo();
        equipo.listarCiclistas();
        System.out.println("Tiempo total: " + equipo.calcularTiempoTotal() + " minutos");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Identificador del ciclista : ");
        int id = sc.nextInt();
        equipo.buscarCiclistaPorId(id);
        sc.close();
    }
}
