package questao1.src;
public class ProdutoAuto extends Produto {

    // atributos específicos
    private Double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private boolean possuiCnh;
    private boolean possuiCrlv;

    // construtor
    public ProdutoAuto(String segurado, String numeroApolice, Double valorFipe, 
        int idadeCondutor, int tempoHabilitacao,
        boolean possuiCnh, boolean possuiCrlv
        ) {
        super(segurado, numeroApolice);
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.possuiCnh = possuiCnh;
        this.possuiCrlv = possuiCrlv;
    }

    // métodos
    @Override
    public boolean validarContratacao() {
        return possuiCnh
            && possuiCrlv;
    }

    @Override
    public Double calcularPremio() {
        double premio_anual = valorFipe * 0.08;
        if (idadeCondutor < 25) premio_anual += premio_anual * 0.3;
        if (tempoHabilitacao < 2) premio_anual += premio_anual * 0.2;
        return premio_anual;
    }

    @Override
    public String listarDocumentos() {
        return "Documentos necessários: CNH, CRLV";
    }
    
    @Override
    public String gerarResumo() {
        if (validarContratacao()) {
            return "Resumo da Apólice:\n" +
               "Número: " + getNumeroApolice() + "\n" +
               "Segurado: " + getSegurado() + "\n" +
               "Data de Emissão: " + getDataEmissao() + "\n" +
               "Prêmio mensal: R$ " + String.format("%.2f", calcularPremio()/12) + "\n" +
               "Documentos Exigidos: " + listarDocumentos();
        } return null;
    }
}
