public class DocumentoFiscalBR implements DocumentoFiscal {
    private boolean isInterestadual;
    private String chaveAcesso;
    private String cfop;

    public DocumentoFiscalBR(boolean isInterestadual) {
        this.isInterestadual = isInterestadual;
        this.cfop = isInterestadual ? "6.102" : "5.102";
        this.chaveAcesso = gerarChaveAcesso();
    }

    private String gerarChaveAcesso() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 44; i++) {
            sb.append((int) (Math.random() * 10));
        }
        return sb.toString();
    }

    @Override
    public String gerar() {
        return "Nota Fiscal Eletrônica\n" +
               "CFOP: " + cfop + "\n" +
               "Chave de Acesso: " + chaveAcesso + "\n" +
               "Tipo: " + (isInterestadual ? "Interestadual" : "Estadual");
    }

    @Override
    public double calcularImposto(double valor) {
        return isInterestadual ? valor * 0.12 : valor * 0.18;
    }
}
