public class PagamentoEUA implements Pagamento {
    private boolean avsVerificado;

    public PagamentoEUA(boolean avsVerificado) {
        this.avsVerificado = avsVerificado;
    }

    @Override
    public String processar(double valor) {
        return "Pagamento com Cartão de Crédito\n" +
               "AVS: " + (avsVerificado ? "Verificado ✓" : "Falhou ✗") + "\n" +
               "Valor: US$ " + String.format("%.2f", valor);
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor; // Sem desconto nos EUA
    }
}
