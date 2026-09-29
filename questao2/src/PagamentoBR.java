public class PagamentoBR implements Pagamento {
    private String metodo;

    public PagamentoBR(String metodo) {
        this.metodo = metodo; // "Pix" ou "Boleto"
    }

    @Override
    public String processar(double valor) {
        String resultado = "Pagamento via " + metodo + "\n";
        if ("Pix".equals(metodo)) {
            resultado += "Desconto de 5% aplicado\n";
            resultado += "Valor com desconto: R$ " + String.format("%.2f", valor * 0.95);
        } else {
            resultado += "Boleto gerado - compensação em 3 dias úteis\n";
            resultado += "Valor: R$ " + String.format("%.2f", valor);
        }
        return resultado;
    }

    @Override
    public double aplicarDesconto(double valor) {
        if ("Pix".equals(metodo)) {
            return valor * 0.95;
        }
        return valor;
    }
}
