package questao2;

public class Main {
    public static void main(String[] args) {
        int minutos = 135; // 2h15

        EstrategiaTarifa[] perfis = {
            new TarifaRotativo(), new TarifaMensalista(), new TarifaConveniado()
        };

        System.out.println("Permanência de " + minutos + " minutos:");
        for (EstrategiaTarifa perfil : perfis) {
            Ticket t = new Ticket("ABC-1234", minutos, perfil);
            System.out.printf("  %-11s -> R$ %.2f%n", t.getPerfil(), t.calcularValor());
        }

        System.out.println("\nTroca de perfil no mesmo tíquete (placa XYZ-9876, 90 min):");
        Ticket ticket = new Ticket("XYZ-9876", 90, new TarifaRotativo());
        System.out.printf("  %-11s -> R$ %.2f%n", ticket.getPerfil(), ticket.calcularValor());
        ticket.setEstrategia(new TarifaConveniado());
        System.out.printf("  %-11s -> R$ %.2f%n", ticket.getPerfil(), ticket.calcularValor());
        ticket.setEstrategia(new TarifaMensalista());
        System.out.printf("  %-11s -> R$ %.2f%n", ticket.getPerfil(), ticket.calcularValor());
    }
}
