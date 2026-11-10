package questao2;

public class TarifaRotativo implements EstrategiaTarifa {
    public static final double VALOR_HORA = 10.00;

    @Override public String getNome() { return "Rotativo"; }

    @Override
    public double calcular(int minutos) {
        return horasIniciadas(minutos) * VALOR_HORA;
    }

    /** Hora iniciada: 1 a 60 min = 1h; 61 a 120 = 2h; 0 min = 0h. */
    static int horasIniciadas(int minutos) {
        return (minutos + 59) / 60;
    }
}
