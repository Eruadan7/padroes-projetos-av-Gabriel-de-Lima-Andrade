public class FabricaVida implements iFabricaProduto {
    private static int contador = 0;
    private String segurado;
    private int idadeSegurado;
    private double capitalSegurado;
    private boolean isFumante;
    private boolean possuiAtestadoMedico;
    private boolean possuiCpf;
    private boolean possuiDocumentoIdentidade;

    public FabricaVida(String segurado, int idadeSegurado, double capitalSegurado,
                       boolean isFumante, boolean possuiAtestadoMedico,
                       boolean possuiCpf, boolean possuiDocumentoIdentidade) {
        this.segurado = segurado;
        this.idadeSegurado = idadeSegurado;
        this.capitalSegurado = capitalSegurado;
        this.isFumante = isFumante;
        this.possuiAtestadoMedico = possuiAtestadoMedico;
        this.possuiCpf = possuiCpf;
        this.possuiDocumentoIdentidade = possuiDocumentoIdentidade;
    }

    @Override
    public Produto criarProduto() {
        contador++;
        String numeroApolice = "VID-" + contador;
        return new ProdutoVida(segurado, numeroApolice, idadeSegurado, capitalSegurado,
                               isFumante, possuiAtestadoMedico, possuiCpf,
                               possuiDocumentoIdentidade);
    }
}
