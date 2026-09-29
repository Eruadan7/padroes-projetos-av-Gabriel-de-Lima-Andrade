public class PagamentoAlemanha implements Pagamento {
    @Override
    public String processar(double valor) {
        return "Pagamento SEPA Direct Debit\n" +
               "Valor: € " + String.format("%.2f", valor);
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor; // Sem desconto na Alemanha
    }
}
