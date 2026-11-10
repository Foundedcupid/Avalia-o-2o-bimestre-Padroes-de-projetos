package questao1;

/** Observer: qualquer área interessada implementa esta interface. */
public interface ObservadorEstoque {
    void atualizar(String nomeProduto, int novaQuantidade);
}
