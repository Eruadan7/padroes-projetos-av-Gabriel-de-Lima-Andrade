public class DocumentoFiscalAlemanha implements DocumentoFiscal {
    private boolean isEssencial;
    private double vatRate;
    private String vatId = "DE123456789";

    public DocumentoFiscalAlemanha(boolean isEssencial) {
        this.isEssencial = isEssencial;
        this.vatRate = isEssencial ? 0.07 : 0.19;
    }

    @Override
    public String gerar() {
        return "VAT Invoice\n" +
               "Umsatzsteuer: " + String.format("%.0f%%", vatRate * 100) + "\n" +
               "VAT-ID: " + vatId + "\n" +
               "Produtos: " + (isEssencial ? "Essenciais" : "Não essenciais");
    }

    @Override
    public double calcularImposto(double valor) {
        return valor * vatRate;
    }
}
