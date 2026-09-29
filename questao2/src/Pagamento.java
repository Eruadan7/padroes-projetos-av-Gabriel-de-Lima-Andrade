public interface Pagamento {
    String processar(double valor);
    double aplicarDesconto(double valor);
}
