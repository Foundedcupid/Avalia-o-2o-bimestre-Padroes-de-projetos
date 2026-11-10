package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        notebook.adicionarObservador(compras);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(auditoria);

        System.out.println("--- Estoque 10 -> 7");
        notebook.setQuantidade(7);
        System.out.println("--- Estoque 7 -> 7 (sem mudança: ninguém é avisado)");
        notebook.setQuantidade(7);
        System.out.println("--- Estoque 7 -> 4");
        notebook.setQuantidade(4);
        System.out.println("--- Estoque 4 -> 0");
        notebook.setQuantidade(0);
        System.out.println("--- Estoque 0 -> 12 (reposição)");
        notebook.setQuantidade(12);

        System.out.println("\n>>> Removendo Compras em tempo de execução");
        notebook.removerObservador(compras);

        System.out.println("--- Estoque 12 -> 3 (Compras não deve alertar)");
        notebook.setQuantidade(3);
        System.out.println("--- Estoque 3 -> 0");
        notebook.setQuantidade(0);
        System.out.println("--- Estoque 0 -> 8");
        notebook.setQuantidade(8);
    }
}
