package questao2;

public class TarifaConveniado implements EstrategiaTarifa {
    public static final int MINUTOS_GRATUITOS = 30;
    public static final double VALOR_HORA = 10.00;
    public static final double PERCENTUAL_DESCONTO = 0.20; // 20%

    @Override public String getNome() { return "Conveniado"; }

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos - MINUTOS_GRATUITOS);
        double bruto = TarifaRotativo.horasIniciadas(minutosCobrados) * VALOR_HORA;
        return bruto * (1 - PERCENTUAL_DESCONTO);
    }
}
