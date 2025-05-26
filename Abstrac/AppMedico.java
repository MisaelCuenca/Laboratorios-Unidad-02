package Abstrac;

public class AppMedico {
    public static void main(String[] args) {
        Medico[] medicos = new Medico[4];

        medicos[0] = new Pediatra("Ana", TipoPediatra.NEUROLOGO);
        medicos[1] = new Ortopedista("Luis", TipoOrtopedista.MAXILOFACIAL);
        medicos[2] = new Pediatra("Clara", TipoPediatra.PSICOLOGO);
        medicos[3] = new Ortopedista("José", TipoOrtopedista.PEDIATRICA);

        for (int i = 0; i < medicos.length; i++) {
            System.out.print("Posición " + i + ": ");
            if (medicos[i] instanceof Pediatra) {
                System.out.println("Pediatra - " + ((Pediatra) medicos[i]).getTipologia());
            } else if (medicos[i] instanceof Ortopedista) {
                System.out.println("Ortopedista - " + ((Ortopedista) medicos[i]).getTipologia());
            }
        }
    }
}
