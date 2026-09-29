public class AlemanhaFactory implements PaisFactory {
    private boolean isEssencial;

    public AlemanhaFactory(boolean isEssencial) {
        this.isEssencial = isEssencial;
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalAlemanha(isEssencial);
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoAlemanha();
    }

    @Override
    public Etiqueta criarEtiqueta() {
        return new EtiquetaAlemanha();
    }
}
