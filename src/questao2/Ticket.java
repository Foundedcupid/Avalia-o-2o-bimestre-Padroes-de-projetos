package questao2;

/** Context: delega o cálculo à estratégia atual, sem if/else sobre o perfil. */
public class Ticket {
    private final String placa;
    private final int minutosPermanencia;
    private EstrategiaTarifa estrategia;

    public Ticket(String placa, int minutosPermanencia, EstrategiaTarifa estrategia) {
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaTarifa estrategia) { this.estrategia = estrategia; }
    public String getPlaca() { return placa; }
    public int getMinutosPermanencia() { return minutosPermanencia; }
    public String getPerfil() { return estrategia.getNome(); }

    public double calcularValor() {
        return estrategia.calcular(minutosPermanencia);
    }
}
