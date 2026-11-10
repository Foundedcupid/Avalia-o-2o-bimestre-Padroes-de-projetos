package questao1;

import java.util.ArrayList;
import java.util.List;

public class Auditoria implements ObservadorEstoque {
    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        String registro = "Produto=" + nomeProduto + ", novaQuantidade=" + novaQuantidade;
        registros.add(registro);
        System.out.println("[AUDITORIA] " + registro);
    }

    public List<String> getRegistros() { return List.copyOf(registros); }
}
