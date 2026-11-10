package questao1;

public class Compras implements ObservadorEstoque {
    public static final int LIMITE_ALERTA = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < LIMITE_ALERTA) {
            System.out.println("[COMPRAS] ALERTA: estoque baixo de '" + nomeProduto
                    + "' (" + novaQuantidade + " un.)");
        }
    }
}
