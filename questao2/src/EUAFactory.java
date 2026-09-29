public class EUAFactory implements PaisFactory {
    private String estado;
    private boolean avsVerificado;

    public EUAFactory(String estado, boolean avsVerificado) {
        this.estado = estado;
        this.avsVerificado = avsVerificado;
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalEUA(estado);
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoEUA(avsVerificado);
    }

    @Override
    public Etiqueta criarEtiqueta() {
        return new EtiquetaEUA();
    }
}
