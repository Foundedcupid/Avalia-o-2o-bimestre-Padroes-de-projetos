package questao2;

public class TarifaMensalista implements EstrategiaTarifa {
    public static final double VALOR_FIXO = 250.00;

    @Override public String getNome() { return "Mensalista"; }

    @Override
    public double calcular(int minutos) {
        return VALOR_FIXO;
    }
}
