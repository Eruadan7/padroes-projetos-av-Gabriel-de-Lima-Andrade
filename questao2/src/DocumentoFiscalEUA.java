public class DocumentoFiscalEUA implements DocumentoFiscal {
    private String estado;
    private double salesTax;
    private String ein = "12-3456789";

    public DocumentoFiscalEUA(String estado) {
        this.estado = estado;
        switch (estado) {
            case "California": salesTax = 0.0725; break;
            case "Texas": salesTax = 0.0625; break;
            case "Oregon": salesTax = 0.0; break;
            default: salesTax = 0.0;
        }
    }

    @Override
    public String gerar() {
        return "Sales Invoice\n" +
               "Estado: " + estado + "\n" +
               "Sales Tax: " + String.format("%.2f%%", salesTax * 100) + "\n" +
               "EIN: " + ein;
    }

    @Override
    public double calcularImposto(double valor) {
        return valor * salesTax;
    }
}
