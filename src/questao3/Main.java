package questao3;

public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Leite(new Espresso());
        Bebida pedido2 = new Calda(new Chantilly(new Leite(new Espresso())));
        Bebida pedido3 = new Calda(new Calda(new Cha()));   // complemento repetido

        // Novo complemento sem alterar nenhuma classe existente:
        Bebida pedido4 = new Complemento(new Cha(), "Canela", 1.00) { };

        imprimir(1, pedido1);
        imprimir(2, pedido2);
        imprimir(3, pedido3);
        imprimir(4, pedido4);
    }

    private static void imprimir(int n, Bebida b) {
        System.out.printf("Pedido %d: %s | R$ %.2f%n", n, b.getDescricao(), b.getPreco());
    }
}
