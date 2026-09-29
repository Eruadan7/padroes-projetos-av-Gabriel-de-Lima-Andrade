public class BrasilFactory implements PaisFactory {
    private boolean isInterestadual;
    private String metodoPagamento;

    public BrasilFactory(boolean isInterestadual, String metodoPagamento) {
        this.isInterestadual = isInterestadual;
        this.metodoPagamento = metodoPagamento;
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalBR(isInterestadual);
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBR(metodoPagamento);
    }

    @Override
    public Etiqueta criarEtiqueta() {
        return new EtiquetaBR();
    }
}
