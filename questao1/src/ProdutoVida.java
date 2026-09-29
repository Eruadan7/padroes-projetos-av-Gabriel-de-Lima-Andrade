public class ProdutoVida extends Produto {
    // atributos específicos
    private int idadeSegurado;
    private Double capitalSegurado;
    private boolean isFumante;
    private boolean possuiAtestadoMedico;
    private boolean possuiCpf;
    private boolean possuiDocumentoIdentidade;

    // construtor
    public ProdutoVida(String segurado, String numeroApolice, int idadeSegurado, Double capitalSegurado, boolean isFumante, boolean possuiAtestadoMedico, boolean possuiCpf, boolean possuiDocumentoIdentidade) {
        super(segurado, numeroApolice);
        this.idadeSegurado = idadeSegurado;
        this.capitalSegurado = capitalSegurado;
        this.isFumante = isFumante;
        this.possuiAtestadoMedico = possuiAtestadoMedico;
        this.possuiCpf = possuiCpf;
        this.possuiDocumentoIdentidade = possuiDocumentoIdentidade;
    }

    // métodos
    @Override
    public boolean validarContratacao() {
        return possuiCpf 
        && possuiDocumentoIdentidade 
        && (capitalSegurado <= 500000 || possuiAtestadoMedico);
    }

    @Override
    public Double calcularPremio() {
        double premio_mensal = (idadeSegurado * 12) + (capitalSegurado*0.002);
        if (isFumante) premio_mensal += premio_mensal*0.5;
        return premio_mensal;
    }

    @Override
    public String listarDocumentos() {
        if (capitalSegurado > 500000) {
            return "documento de identidade, CPF e atestado médico";
        }
        return "Documentos necessários: documento de identidade e CPF";
    }
    
    @Override
    public String gerarResumo() {
        if (validarContratacao()) {
            return "Resumo da Apólice:\n" +
               "Número: " + getNumeroApolice() + "\n" +
               "Segurado: " + getSegurado() + "\n" +
               "Data de Emissão: " + getDataEmissao() + "\n" +
               "Prêmio mensal: R$ " + String.format("%.2f", calcularPremio()) + "\n" +
               "Documentos Exigidos: " + listarDocumentos();
        } return null;
    }
}
