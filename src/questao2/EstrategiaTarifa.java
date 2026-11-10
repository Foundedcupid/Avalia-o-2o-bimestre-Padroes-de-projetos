package questao2;

/** Strategy: cada perfil de cobrança implementa esta interface. */
public interface EstrategiaTarifa {
    String getNome();
    double calcular(int minutosPermanencia);
}
