package questao3;

/**
 * Decorator abstrato. Um novo complemento é só uma nova subclasse
 * (ou até uma instância anônima), sem alterar classes existentes (RQ3.7).
 */
public abstract class Complemento implements Bebida {
    private final Bebida bebida;
    private final String nome;
    private final double preco;

    protected Complemento(Bebida bebida, String nome, double preco) {
        this.bebida = bebida;
        this.nome = nome;
        this.preco = preco;
    }

    @Override public String getDescricao() { return bebida.getDescricao() + " + " + nome; }
    @Override public double getPreco() { return bebida.getPreco() + preco; }
}
