package questao1;

import java.util.ArrayList;
import java.util.List;

/** Subject: conhece apenas a interface ObservadorEstoque (RQ1.7). */
public class Produto {
    private final String nome;
    private int quantidade;
    private final List<ObservadorEstoque> observadores = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }

    public void adicionarObservador(ObservadorEstoque o) {
        if (!observadores.contains(o)) observadores.add(o);
    }

    public void removerObservador(ObservadorEstoque o) {
        observadores.remove(o);
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade == this.quantidade) return; // RQ1.4
        this.quantidade = novaQuantidade;
        notificar();
    }

    private void notificar() {
        // cópia da lista: permite remoção de observadores durante a notificação
        for (ObservadorEstoque o : new ArrayList<>(observadores)) {
            o.atualizar(nome, quantidade);
        }
    }
}
